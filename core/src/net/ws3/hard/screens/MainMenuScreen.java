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
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class MainMenuScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin hudSkin;
	private Skin skin;
	private Table table;
	private Button playGame, leaderboard, store;
	private Label deathCount;
	private Button soundButton;
	
	public MainMenuScreen(HardGame gam){
		this.game = gam;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		stage.draw();

		if(Gdx.input.isKeyPressed(Keys.BACK))
			Gdx.app.exit();
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		stage = new Stage(new StretchViewport(800, 480));
		skin = new Skin(Gdx.files.internal("uitest/uitest.json"), new TextureAtlas(Gdx.files.internal("uitest/uitest.atlas")));
		
		table = new Table();
		table.setFillParent(true);
		
		playGame = new Button(skin, "play");
		
		playGame.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				//game.setScreen(new GameScreen(game, new Level9()));
				game.setScreen(new LevelScreen(game));
			}
		});
		
		table.add(playGame).padRight(10);
		
		leaderboard = new Button(skin, "leaderboard");
		leaderboard.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
			}
		});
		table.add(leaderboard).padRight(10);
		
		store = new Button(skin, "store");
		store.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
			}
		});
		table.add(store);
		
		stage.addActor(new Image(skin, "mainmenubg"));
		stage.addActor(table);
		
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
		stage.dispose();
		skin.dispose();
	}

}
