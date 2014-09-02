package net.ws3.hard.screens;

import net.ws3.hard.HardGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class IntroScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin skin;
	private Image bg;
	private Button button;
	private final int levelid;
	
	public IntroScreen(HardGame gam, int leveli){
		this.levelid = leveli;
		this.game = gam;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		stage.draw();
		
		if(Gdx.input.isKeyPressed(Keys.BACK))
			game.setScreen(new LevelScreen(game));
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		skin = new Skin(new TextureAtlas(Gdx.files.internal("intro/intro.atlas")));
		
		ButtonStyle buttonStyle = new ButtonStyle();
		buttonStyle.down = skin.getDrawable("introplay2");
		buttonStyle.up = skin.getDrawable("introplay1");
		button = new Button(buttonStyle);
		button.setPosition(580, 50);
		button.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				game.openLevel(levelid);
			}
		});
		
		bg = new Image(skin.getRegion("intromenu"));
		
		stage = new Stage(new StretchViewport(800, 480));
		
		stage.addActor(bg);
		stage.addActor(button);
		
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void hide() {
		dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		skin.dispose();
		stage.dispose();
	}

}
