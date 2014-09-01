package net.ws3.hard.screens;

import net.ws3.hard.HardGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class LevelScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin skin;
	private Table table;
	private TextButton textButton;
	private long startTime;
	
	public LevelScreen(HardGame gam){
		startTime = TimeUtils.nanoTime();
		this.game = gam;
		stage = new Stage(new StretchViewport(800, 480));
		skin = new Skin(Gdx.files.internal("uitest/uitest.json"), new TextureAtlas(Gdx.files.internal("uitest/uitest.atlas")));
		
		table = new Table();
		table.setFillParent(true);
		
		for(int i = 1; i <= 30; i++){
			textButton = new TextButton("" + i, skin);
			textButton.addListener(new LevelListener(game, i));
			if(i % 8 != 0)
				table.add(textButton).padRight(5).padBottom(5);
			else
				table.add(textButton).padBottom(5).row();
		}
		
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
		
		if(TimeUtils.nanoTime() - startTime > 5000000L && Gdx.input.isKeyJustPressed(Keys.BACK))
			game.setScreen(new MainMenuScreen(game));
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
	
	private class LevelListener extends ClickListener{
		private int level;
		private final HardGame game;
		
		public LevelListener(HardGame gam, int level){
			super();
			this.game = gam;
			this.level = level;
		}
		
		@Override
		public void clicked(InputEvent event, float x, float y){
			game.openLevel(level);
		}
	}
}
