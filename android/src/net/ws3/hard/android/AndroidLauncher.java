package net.ws3.hard.android;

import net.ws3.hard.HardGame;
import net.ws3.hard.MySwarm;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.swarmconnect.Swarm;
import com.swarmconnect.SwarmActiveUser;
import com.swarmconnect.delegates.SwarmLoginListener;

public class AndroidLauncher extends AndroidApplication {
	private SwarmAndroid swarm;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		
		config.useAccelerometer = false;
		config.useCompass = false;
		
		Swarm.setAllowGuests(true);
	    Swarm.setActive(this);
	    
	    swarm = new SwarmAndroid();
		initialize(new HardGame(swarm), config);
	}
	
	public void onResume() {
	    super.onResume();
	    Swarm.setActive(this);
	    Swarm.init(this, 12965, "4549d82b924d92f9be97f5a7e4171f81", new mySwarmLoginListener(swarm));
	}

	public void onPause() {
	    super.onPause();
	    Swarm.setInactive(this);
	}
	
	private class mySwarmLoginListener implements SwarmLoginListener{
		private SwarmAndroid swarm;
		
		public mySwarmLoginListener(SwarmAndroid swarm){
			this.swarm = swarm;
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
		}

		@Override
		public void userLoggedOut() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
