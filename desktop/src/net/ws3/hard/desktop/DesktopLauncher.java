package net.ws3.hard.desktop;

import net.ws3.hard.HardGame;
import net.ws3.hard.GoogleInterface;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher implements GoogleInterface{
	   public static void main(String[] args) {
		      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		      config.title = "Hard Fucker";
		      config.width = 800;
		      config.height = 480;
		      new LwjglApplication(new HardGame(new DesktopLauncher()), config);
		   }

	@Override
	public void signIn() {
		System.out.println("SignIn");
	}

	@Override
	public void rateGame() {
		System.out.println("rateGame");
	}

	@Override
	public void submitScore(long score) {
		System.out.println("Score: " + score);
	}

	@Override
	public void showScores() {
		System.out.println("showScores");
	}

	@Override
	public boolean isSignedIn() {
		System.out.println("isSignedIn");
		return false;
	}
}
