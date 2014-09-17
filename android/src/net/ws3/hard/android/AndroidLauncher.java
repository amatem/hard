package net.ws3.hard.android;

import net.ws3.hard.GoogleInterface;
import net.ws3.hard.HardGame;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.android.gms.games.Games;
import com.google.example.games.basegameutils.GameHelper;
import com.google.example.games.basegameutils.GameHelper.GameHelperListener;

public class AndroidLauncher extends AndroidApplication implements GameHelperListener, GoogleInterface{
	private boolean isScoresShowed;
	private boolean isScoreSubmitted;
	private long highscore;
	private GameHelper gameHelper;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		isScoresShowed = false;
		isScoreSubmitted = false;
		highscore = -1;
		
		gameHelper = new GameHelper(this, GameHelper.CLIENT_GAMES);
		gameHelper.enableDebugLog(true);
		
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		
		config.useAccelerometer = false;
		config.useCompass = false;
		initialize(new HardGame(this), config);
		
		gameHelper.setMaxAutoSignInAttempts(0); 
		gameHelper.setup(this);
	}
	
	@Override
	public void onStart(){
		super.onStart();
		gameHelper.onStart(this);
	}
	
	@Override
	public void onStop(){
		super.onStop();
		gameHelper.onStop();
	}
	
	@Override
	public void onActivityResult(int request, int response, Intent data){
		super.onActivityResult(request, response, data);
		gameHelper.onActivityResult(request, response, data);
	}

	@Override
	public void signIn() {
 		try {
 			runOnUiThread(new Runnable(){
 				public void run() {
 					gameHelper.beginUserInitiatedSignIn();
 				}
 			});
 		} catch (final Exception ex) {
 		}
	}

	@Override
	public void rateGame() {
		
	}

	@Override
	public void submitScore(long score) {
		if(isSignedIn()){
			Games.Leaderboards.submitScore(gameHelper.getApiClient(), getString(R.string.leaderboard), score);
			Toast.makeText(getApplicationContext(), "New High Score Submitted!\nCheck leaderboard for details...", Toast.LENGTH_SHORT).show();
		}
		else{
			isScoreSubmitted = true;
			highscore = score;
			gameHelper.beginUserInitiatedSignIn();
		}
	}

	@Override
	public void showScores() {
		if(isSignedIn())
			startActivityForResult(Games.Leaderboards.getLeaderboardIntent(gameHelper.getApiClient(), getString(R.string.leaderboard)), 5001);
		else{
			isScoresShowed = true;
			gameHelper.beginUserInitiatedSignIn();
		}
	}

	@Override
	public boolean isSignedIn() {
		return gameHelper.isSignedIn();
	}

	@Override
	public void onSignInFailed() {
		System.out.println("Signin failed...");
	}

	@Override
	public void onSignInSucceeded() {
		if(isScoresShowed){
			isScoresShowed = false;
			showScores();
		}
		if(isScoreSubmitted){
			isScoreSubmitted = false;
			submitScore(highscore);
		}
		
		System.out.println("Signin succeeded...");
	}
}
