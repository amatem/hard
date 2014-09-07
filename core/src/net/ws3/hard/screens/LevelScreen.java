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
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class LevelScreen implements Screen{
	private final HardGame game;
	private Stage stage;
	private Skin skin;
	private Table table;
	private TextButton textButton;
	private Skin hudSkin;
	private Label deathCount;
	private Button soundButton;
	
	public LevelScreen(HardGame gam){
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
		skin = new Skin(Gdx.files.internal("uitest/uitest.json"), new TextureAtlas(Gdx.files.internal("uitest/uitest.atlas")));
		
		table = new Table();
		table.setFillParent(true);
		
		for(int i = 1; i <= 30; i++){
			if(UserData.isLevelLocked(i) && false)
				textButton = new TextButton("L", skin);
			else{
				textButton = new TextButton("" + i, skin);
				textButton.addListener(new LevelListener(game, i));
			}
			if(i % 8 != 0)
				table.add(textButton).padRight(5).padBottom(5);
			else
				table.add(textButton).padBottom(5).row();
		}
		
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
			if(UserData.getLifes() < 0)
				game.setScreen(new NoLifeScreen(game));
			else if(UserData.isFirstTime())
				game.setScreen(new IntroScreen(game, level));
			else
				game.openLevel(level);
		}
	}
}
