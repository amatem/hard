package net.ws3.hard.screens;

import net.ws3.hard.HardGame;
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

import com.badlogic.gdx.Gdx;
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
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class LevelScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin skin;
	private Table table;
	private TextButton textButton;
	
	public LevelScreen(HardGame gam){
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
			switch(level){
				case 1:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 2:
					game.setScreen(new GameScreen(game, new Level2()));
					break;
				case 3:
					game.setScreen(new GameScreen(game, new Level3()));
					break;
				case 4:
					game.setScreen(new GameScreen(game, new Level4()));
					break;
				case 5:
					game.setScreen(new GameScreen(game, new Level5()));
					break;
				case 6:
					game.setScreen(new GameScreen(game, new Level6()));
					break;
				case 7:
					game.setScreen(new GameScreen(game, new Level7()));
					break;
				case 8:
					game.setScreen(new GameScreen(game, new Level8()));
					break;
				case 9:
					game.setScreen(new GameScreen(game, new Level9()));
					break;
				case 10:
					game.setScreen(new GameScreen(game, new Level10()));
					break;
				case 11:
					game.setScreen(new GameScreen(game, new Level11()));
					break;
				case 12:
					game.setScreen(new GameScreen(game, new Level12()));
					break;
				case 13:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 14:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 15:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 16:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 17:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 18:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 19:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 20:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 21:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 22:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 23:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 24:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 25:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 26:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 27:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 28:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 29:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				case 30:
					game.setScreen(new GameScreen(game, new Level1()));
					break;
				default:
					game.setScreen(new MainMenuScreen(game));
			}
		}
	}
}
