package net.ws3.hard.screens;

import net.ws3.hard.HardGame;
import net.ws3.hard.model.UserData;

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
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class NoLifeScreen implements Screen{
	private final HardGame game;
	
	private Stage stage;
	private Skin skin;
	private Image bg;
	private Button storeButton;
	
	private Skin hudSkin;
	private Label deathCount;
	private Button soundButton;
	
	public NoLifeScreen(HardGame gam){
		this.game = gam;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		stage.draw();

		if(Gdx.input.isKeyPressed(Keys.BACK))
			game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		stage = new Stage(new StretchViewport(800, 480));
		skin = new Skin(new TextureAtlas(Gdx.files.internal("nolife/nolife.atlas")));
		
		bg = new Image(skin.getRegion("nolifescreen"));
		bg.setBounds(0, 0, 800, 480);
		stage.addActor(bg);
		
		ButtonStyle buttonStyle = new ButtonStyle();
		buttonStyle.down = skin.getDrawable("store2");
		buttonStyle.up = skin.getDrawable("store1");
		storeButton = new Button(buttonStyle);
		storeButton.setPosition(460, 55);
		storeButton.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				game.getSwarm().showStore();
			}
		});
		stage.addActor(storeButton);
		
		hudSkin = new Skin(Gdx.files.internal("hud/hud.json"), new TextureAtlas(Gdx.files.internal("hud/hud.atlas")));
		
		deathCount = new Label("" + UserData.getLifes(), hudSkin, "deathCount");
		deathCount.setAlignment(Align.center);
		deathCount.setBounds(0, 401, 61, 79);
		stage.addActor(deathCount);
		
		soundButton = new Button(hudSkin, "sound");
		soundButton.setBounds(800 - 64, 480 - 64, 64, 64);
		stage.addActor(soundButton);
		
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
