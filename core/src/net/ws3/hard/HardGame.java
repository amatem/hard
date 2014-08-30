package net.ws3.hard;

import net.ws3.hard.levels.Level1;
import net.ws3.hard.levels.Level10;
import net.ws3.hard.levels.Level11;
import net.ws3.hard.levels.Level12;
import net.ws3.hard.levels.Level2;
import net.ws3.hard.levels.Level3;
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
	
	@Override
	public void create() {
		Assets.loadAssets();
		UserData.loadUserData();
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
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 14:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 15:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 16:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 17:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 18:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 19:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 20:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 21:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 22:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 23:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 24:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 25:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 26:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 27:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 28:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 29:
			setScreen(new GameScreen(this, new Level1(), level));
			break;
		case 30:
			setScreen(new GameScreen(this, new Level1(), level));
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
