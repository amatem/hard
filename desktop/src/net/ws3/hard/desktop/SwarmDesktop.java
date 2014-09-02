package net.ws3.hard.desktop;

import net.ws3.hard.MySwarm;

public class SwarmDesktop implements MySwarm{

	@Override
	public void showStore() {
		System.out.println("User tried to access to store");
	}

	@Override
	public void showLeaderboards() {
		System.out.println("User tried to access to leaderboards");
	}

	@Override
	public void submitHighScore(int score) {
		System.out.println("User tried to submit new score: " + score);
	}

	@Override
	public boolean isUnlimitedLives() {
		System.out.println("User tried to access isUnlimitedLives");
		return false;
	}

	@Override
	public boolean isUnlockedLevels() {
		System.out.println("User tried to access isUnlockedLevels");
		return false;
	}
}
