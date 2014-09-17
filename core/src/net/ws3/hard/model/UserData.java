package net.ws3.hard.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class UserData {
	private static int[] bestScores = new int[31];
	private static boolean[] lockStatus = new boolean[31];
	private static int lifes;
	private static boolean firstTime;
	private static Preferences prefs = Gdx.app.getPreferences("LevelStatus");;
	
	public static void loadUserData(){
		if(prefs.getString("firstTime", "yarrak").equals("yarrak")){
			System.out.println("First time operations initiated");
			prefs.putString("firstTime", "dassak");
			for(int i = 1; i <= 30; i++){
				bestScores[i] = -1;
				lockStatus[i] = true;
				prefs.putInteger(i + "i", -1);
				prefs.putBoolean(i + "b", true);
			}
			prefs.putBoolean("1b", false);
			lockStatus[1] = false;
			prefs.putInteger("lifes", 0);
			lifes = 0;
			firstTime = true;
		}
		else{
			firstTime = false;
			for(int i = 1; i <= 30; i++){
				bestScores[i] = prefs.getInteger(i + "i", -1);
				lockStatus[i] = prefs.getBoolean(i + "b", false);
			}
		}
	}
	
	public static boolean isFirstTime(){
		if(firstTime){
			firstTime = false;
			return true;
		}
		return false;
	}
	
	public static boolean isLevelLocked(int level){
		if(level > 30 || level < 0){
			System.out.println("BUG VAR YARRAK KAFASI levellerde: " + level);
			return false;
		}
		System.out.println("LEVEL: " + level + " - lockStatus: " + lockStatus[level]);
		return lockStatus[level];
	}
	
	public static void unlockNextLevel(int level){
		if(level < 30){
			prefs.putBoolean((level + 1) + "b", false);
			lockStatus[level + 1] = false;
		}
	}
	
	public static int getHighScore(int level){
		return bestScores[level];
	}
	
	public static void saveHighscore(int level, int highscore){
		int oldscore = bestScores[level];
		if(oldscore == -1 || oldscore > highscore){
			prefs.putInteger(level + "i", highscore);
			bestScores[level] = highscore;
		}
	}
	
	public static boolean isAllLevelsFinished(){
		for(int i = 1; i <= 30; i++)
			if(bestScores[i] == -1)
				return false;
		return true;
	}
	
	public static int getLifes(){
		System.out.println("LIFES: " + lifes);
		return lifes;
	}
	
	public static long getAllScore(){
		long rev = 0;
		for(int i = 1; i <= 30; i++)
			rev += bestScores[i];
		return rev;
	}
	
	public static void death(){
		lifes++;
		prefs.putInteger("lifes", lifes);
	}
	
	public static void dispose(){
		prefs.flush();
	}
}
