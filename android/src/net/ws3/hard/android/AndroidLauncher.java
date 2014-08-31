package net.ws3.hard.android;

import net.ws3.hard.HardGame;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.swarmconnect.Swarm;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		
		config.useAccelerometer = false;
		config.useCompass = false;
		
		initialize(new HardGame(), config);
		Swarm.setActive(this);
	}
	
	public void onResume() {
	    super.onResume();
	    Swarm.setActive(this);
	    
	    Swarm.init(this, 12965, "4549d82b924d92f9be97f5a7e4171f81");
	}

	public void onPause() {
	    super.onPause();
	    Swarm.setInactive(this);
	}
}
