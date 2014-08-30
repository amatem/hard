package net.ws3.hard;

import net.ws3.hard.screens.MainMenuScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class HardGame extends Game {
	
	@Override
	public void create() {
		Assets.loadAssets();
		
		this.setScreen(new MainMenuScreen(this));
	}
	
	@Override
	public void render(){
		super.render();
	}
	
	@Override
	public void dispose(){
		Gdx.input.setInputProcessor(null);
		Assets.dispose();
	}
}
