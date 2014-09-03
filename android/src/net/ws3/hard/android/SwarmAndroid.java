package net.ws3.hard.android;

import net.ws3.hard.MySwarm;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.swarmconnect.Swarm;
import com.swarmconnect.SwarmActiveUser;
import com.swarmconnect.SwarmActiveUser.GotInventoryCB;
import com.swarmconnect.SwarmLeaderboard;
import com.swarmconnect.SwarmUserInventory;
import com.swarmconnect.delegates.SwarmLoginListener;

public class SwarmAndroid implements MySwarm{
	private boolean isUnlimitedLives;
	private boolean isUnlockedLevels;
	private int score;
	private AndroidApplication app;
	
	public SwarmAndroid(AndroidApplication app){
		this.app = app;
		isUnlimitedLives = false;
		isUnlockedLevels = false;
	}
	
	@Override
	public void showStore() {
		if(!Swarm.isInitialized()){
	    	Swarm.init(app, 12965, "4549d82b924d92f9be97f5a7e4171f81", new LoginListener(this, 1));
		}
		else{
			Swarm.showStore();
			updateStore();
		}
	}

	@Override
	public void showLeaderboards() {
		if(!Swarm.isInitialized())
			Swarm.init(app, 12965, "4549d82b924d92f9be97f5a7e4171f81", new LoginListener(this, 2));
		else
			SwarmLeaderboard.showLeaderboard(17641);
	}

	@Override
	public void submitHighScore(int score) {
		this.score = score;
		if(!Swarm.isInitialized()){
			Swarm.init(app, 12965, "4549d82b924d92f9be97f5a7e4171f81", new LoginListener(this, 3));
		}
		else{
			SwarmLeaderboard.submitScore(17641, score);
		}
	}

	@Override
	public boolean isUnlimitedLives() {
		return isUnlimitedLives;
	}

	@Override
	public boolean isUnlockedLevels() {
		//return true;
		return isUnlockedLevels;
	}
	
	public void setUnlimitedLives(boolean isUnlimitedLives){
		this.isUnlimitedLives = isUnlimitedLives;
	}
	
	public void setUnlockedLevels(boolean isUnlockedLevels){
		this.isUnlockedLevels = isUnlockedLevels;
	}

	public void updateStore(){
		Swarm.user.getInventory(new GotInventoryCB(){
	    	@Override
	    	public void gotInventory(SwarmUserInventory inventory){
	    		if(inventory != null){
	    			if(inventory.containsItem(1849))
	    				setUnlimitedLives(true);
	    			if(inventory.containsItem(1851))
	    				setUnlockedLevels(true);	
	    		}
	    	}
	    });
	}
	
	private class LoginListener implements SwarmLoginListener{
		private SwarmAndroid swarm;
		private int temp;
		
		public LoginListener(SwarmAndroid swarm, int temp){
			this.swarm = swarm;
			this.temp = temp;
		}

		@Override
		public void loginCanceled() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void loginStarted() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void userLoggedIn(SwarmActiveUser user) {
			swarm.updateStore();
			if(temp == 1)
				swarm.showStore();
			else if(temp == 2)
				SwarmLeaderboard.showLeaderboard(17641);
			else
				SwarmLeaderboard.submitScore(17641, score);
		}

		@Override
		public void userLoggedOut() {
			// TODO Auto-generated method stub
			
		}	
	}
}
