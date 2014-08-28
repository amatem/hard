package net.ws3.hard;

import net.ws3.hard.levels.Level4;
import net.ws3.hard.screens.GameScreen;

import com.badlogic.gdx.Game;

public class HardGame extends Game {
	
	@Override
	public void create() {
		Assets.loadAssets();
		
		//this.setScreen(new MainMenuScreen(this));
		this.setScreen(new GameScreen(this, new Level4()));
	}
	
	@Override
	public void render(){
		super.render();
	}
	
	@Override
	public void dispose(){
		Assets.dispose();
	}
}
