package net.ws3.hard.desktop;

import net.ws3.hard.HardGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	   public static void main(String[] args) {
		      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		      config.title = "Hard Fucker";
		      config.width = 800;
		      config.height = 480;
		      new LwjglApplication(new HardGame(), config);
		   }
}
