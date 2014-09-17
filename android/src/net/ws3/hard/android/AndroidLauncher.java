package net.ws3.hard.android;

import net.ws3.hard.AdInterface;
import net.ws3.hard.GoogleInterface;
import net.ws3.hard.HardGame;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.games.Games;
import com.google.example.games.basegameutils.GameHelper;
import com.google.example.games.basegameutils.GameHelper.GameHelperListener;

public class AndroidLauncher extends AndroidApplication implements GameHelperListener, GoogleInterface, AdInterface{
	private static final String AD_INTERSTITIAL = "ca-app-pub-1152600437902796/7094918028";
	private static final String AD_BANNER = "ca-app-pub-1152600437902796/1650486820";
	
	protected AdView adView;
	protected View gameView;
	private InterstitialAd interstitialAd;
	
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
		
		// Do the stuff that initialize() would do for you
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

	    RelativeLayout layout = new RelativeLayout(this);
	    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
	    layout.setLayoutParams(params);

	    View gameView = createGameView(config);
	    layout.addView(gameView);
	    AdView admobView = createAdView();
	    layout.addView(admobView);

	    setContentView(layout);
	    
	    interstitialAd = new InterstitialAd(this);
	    interstitialAd.setAdUnitId(AD_INTERSTITIAL);
	    
	    AdRequest adRequest = new AdRequest.Builder().build();
	    adView.loadAd(adRequest);
		
		gameHelper.setMaxAutoSignInAttempts(0); 
		gameHelper.setup(this);
	}
	
	private AdView createAdView() {
	    adView = new AdView(this);
	    adView.setAdSize(AdSize.SMART_BANNER);
	    adView.setAdUnitId(AD_BANNER);
	    adView.setId(12345); // this is an arbitrary id, allows for relative positioning in createGameView()
	    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
	    params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
	    params.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
	    adView.setLayoutParams(params);
	    adView.setBackgroundColor(Color.BLACK);
	    return adView;
	  }
	
	  private View createGameView(AndroidApplicationConfiguration cfg) {
	    gameView = initializeForView(new HardGame(this, this), cfg);
	    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
	    params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
	    params.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
	    params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
	    gameView.setLayoutParams(params);
	    return gameView;
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


	@Override
	public void loadInterstitial() {
		try {
 			runOnUiThread(new Runnable(){
 				public void run() {
 					if(!interstitialAd.isLoaded()){
 						AdRequest adReq = new AdRequest.Builder().build();
 						interstitialAd.loadAd(adReq);
 					}
 				}
 			});
 		} catch (final Exception ex) {
 		}
	}

	@Override
	public void displayInterstitial() {
		try {
 			runOnUiThread(new Runnable(){
 				public void run() {
 					if(!interstitialAd.isLoaded()){
 						AdRequest adReq = new AdRequest.Builder().build();
 						interstitialAd.loadAd(adReq);
 					}
 					else{
 						interstitialAd.show();
 					}
 				}
 			});
 		} catch (final Exception ex) {
 		}
	}

	@Override
	public void showBanner() {
		try {
 			runOnUiThread(new Runnable(){
 				public void run() {
 					adView.setVisibility(View.VISIBLE);
 				}
 			});
		} catch(final Exception ex){
		}
	}

	@Override
	public void hideBanner() {	
		try {
 			runOnUiThread(new Runnable(){
 				public void run() {
 					adView.setVisibility(View.GONE);
 				}
 			});
		} catch(final Exception ex){
		}
	}
}
