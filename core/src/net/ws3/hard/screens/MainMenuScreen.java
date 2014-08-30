package net.ws3.hard.screens;

import net.ws3.hard.HardGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class MainMenuScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin skin;
	private Table table;
	private Button playGame, leaderboard, store;
	
	public MainMenuScreen(HardGame gam){
		//SAMET CUKUMU YESIN
		this.game = gam;
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
		table.add(leaderboard).padRight(10);
		
		store = new Button(skin, "store");
		table.add(store);
		
		stage.addActor(new Image(skin, "mainmenubg"));
		stage.addActor(table);
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
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
