package net.ws3.hard;

import net.ws3.hard.levels.Level1;
import net.ws3.hard.levels.Level10;
import net.ws3.hard.levels.Level11;
import net.ws3.hard.levels.Level12;
import net.ws3.hard.levels.Level13;
import net.ws3.hard.levels.Level14;
import net.ws3.hard.levels.Level15;
import net.ws3.hard.levels.Level16;
import net.ws3.hard.levels.Level17;
import net.ws3.hard.levels.Level18;
import net.ws3.hard.levels.Level19;
import net.ws3.hard.levels.Level2;
import net.ws3.hard.levels.Level20;
import net.ws3.hard.levels.Level21;
import net.ws3.hard.levels.Level22;
import net.ws3.hard.levels.Level23;
import net.ws3.hard.levels.Level24;
import net.ws3.hard.levels.Level25;
import net.ws3.hard.levels.Level26;
import net.ws3.hard.levels.Level27;
import net.ws3.hard.levels.Level28;
import net.ws3.hard.levels.Level29;
import net.ws3.hard.levels.Level3;
import net.ws3.hard.levels.Level30;
import net.ws3.hard.levels.Level4;
import net.ws3.hard.levels.Level5;
import net.ws3.hard.levels.Level6;
import net.ws3.hard.levels.Level7;
import net.ws3.hard.levels.Level8;
import net.ws3.hard.levels.Level9;
import net.ws3.hard.model.UserData;
import net.ws3.hard.screens.GameScreen;
import net.ws3.hard.screens.MainMenuScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class HardGame extends Game { 
	private GoogleInterface google;
	private AdInterface ads;
	
	public HardGame(GoogleInterface google, AdInterface ads){
		super();
		this.google = google;
		this.ads = ads;
	}
	
	public GoogleInterface getGoogle(){
		return google;
	}
	
	public AdInterface getAds(){
		return ads;
	}
	
	@Override
	public void create() {
		UserData.loadUserData();
		Assets.loadAssets();
        Gdx.input.setCatchBackKey(true);
		this.setScreen(new MainMenuScreen(this));
	}
	
	public void openLevel(int level){
		switch(level){
		case 1:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 2:
			setScreen(new GameScreen(this, new Level2(), level));
			break;
		case 3:
			setScreen(new GameScreen(this, new Level3(), level));
			break;
		case 4:
			setScreen(new GameScreen(this, new Level4(), level));
			break;
		case 5:
			setScreen(new GameScreen(this, new Level5(), level));
			break;
		case 6:
			setScreen(new GameScreen(this, new Level6(), level));
			break;
		case 7:
			setScreen(new GameScreen(this, new Level7(), level));
			break;
		case 8:
			setScreen(new GameScreen(this, new Level8(), level));
			break;
		case 9:
			setScreen(new GameScreen(this, new Level9(), level));
			break;
		case 10:
			setScreen(new GameScreen(this, new Level10(), level));
			break;
		case 11:
			setScreen(new GameScreen(this, new Level11(), level));
			break;
		case 12:
			setScreen(new GameScreen(this, new Level12(), level));
			break;
		case 13:
			setScreen(new GameScreen(this, new Level13(), level));
			break;
		case 14:
			setScreen(new GameScreen(this, new Level14(), level));
			break;
		case 15:
			setScreen(new GameScreen(this, new Level15(), level));
			break;
		case 16:
			setScreen(new GameScreen(this, new Level16(), level));
			break;
		case 17:
			setScreen(new GameScreen(this, new Level17(), level));
			break;
		case 18:
			setScreen(new GameScreen(this, new Level18(), level));
			break;
		case 19:
			setScreen(new GameScreen(this, new Level19(), level));
			break;
		case 20:
			setScreen(new GameScreen(this, new Level20(), level));
			break;
		case 21:
			setScreen(new GameScreen(this, new Level21(), level));
			break;
		case 22:
			setScreen(new GameScreen(this, new Level22(), level));
			break;
		case 23:
			setScreen(new GameScreen(this, new Level23(), level));
			break;
		case 24:
			setScreen(new GameScreen(this, new Level24(), level));
			break;
		case 25:
			setScreen(new GameScreen(this, new Level25(), level));
			break;
		case 26:
			setScreen(new GameScreen(this, new Level26(), level));
			break;
		case 27:
			setScreen(new GameScreen(this, new Level27(), level));
			break;
		case 28:
			setScreen(new GameScreen(this, new Level28(), level));
			break;
		case 29:
			setScreen(new GameScreen(this, new Level29(), level));
			break;
		case 30:
			setScreen(new GameScreen(this, new Level30(), level));
			break;
		default:
			setScreen(new MainMenuScreen(this));
		}
	}
	
	@Override
	public void render(){
		super.render();
	}
	
	@Override
	public void dispose(){
		Gdx.input.setInputProcessor(null);
		UserData.dispose();
		Assets.dispose();
	}
}
