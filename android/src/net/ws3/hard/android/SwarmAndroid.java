package net.ws3.hard.android;

import com.swarmconnect.Swarm;
import com.swarmconnect.SwarmLeaderboard;
import com.swarmconnect.SwarmUserInventory;
import com.swarmconnect.SwarmActiveUser.GotInventoryCB;

import net.ws3.hard.MySwarm;

public class SwarmAndroid implements MySwarm{
	private boolean isUnlimitedLives;
	private boolean isUnlockedLevels;
	
	public SwarmAndroid(){
		isUnlimitedLives = false;
		isUnlockedLevels = false;
	}
	
	@Override
	public void showStore() {
		Swarm.showStore();
		updateStore();
	}

	@Override
	public void showLeaderboards() {
		SwarmLeaderboard.showLeaderboard(17641);
	}

	@Override
	public void submitHighScore(int score) {
		SwarmLeaderboard.submitScore(17641, score);
	}

	@Override
	public boolean isUnlimitedLives() {
		return isUnlimitedLives;
	}

	@Override
	public boolean isUnlockedLevels() {
		return true;
		//return isUnlockedLevels;
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
}
