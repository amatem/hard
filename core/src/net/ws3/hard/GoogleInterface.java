package net.ws3.hard;

public interface GoogleInterface {
	public void signIn();
	public void rateGame();
	public void submitScore(long score);
	public void showScores();
	public boolean isSignedIn();
}
