package net.ws3.hard.model;

import java.util.Calendar;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class UserData {
	private static int[] bestScores = new int[31];
	private static boolean[] lockStatus = new boolean[31];
	private static int lifes;
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
			prefs.putBoolean("1", false);
			lockStatus[1] = false;
			prefs.putInteger("lifes", 500);
			prefs.putInteger("lastlifeupdate", Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
			lifes = 1000;
		}
		else{
			for(int i = 1; i <= 30; i++){
				bestScores[i] = prefs.getInteger(i + "i", -1);
				lockStatus[i] = prefs.getBoolean(i + "b", false);
			}
			if(prefs.getInteger("lastlifeupdate") != Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
				lifes = prefs.getInteger("lifes") + 100;
				prefs.putInteger("lastlifeupdate", Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
			}
			else
				lifes = prefs.getInteger("lifes");
		}
	}
	
	public static void unlockNextLevel(int level){
		if(level < 30)
			prefs.putBoolean((level + 1) + "b", false);
	}
	
	public static int getHighScore(int level){
		return prefs.getInteger(level + "i", -1);
	}
	
	public static void saveHighscore(int level, int highscore){
		int oldscore = prefs.getInteger(level + "i", -1);
		if(oldscore == -1 || oldscore > highscore)
			prefs.putInteger(level + "i", highscore);
	}
	
	public static int getLifes(){
		System.out.println("LIFES: " + lifes);
		return lifes;
	}
	
	public static void death(){
		lifes--;
		prefs.putInteger("lifes", lifes);
	}
	
	public static void dispose(){
		prefs.flush();
	}
}
