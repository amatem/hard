package net.ws3.hard.screens;

import net.ws3.hard.Assets;
import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.HardGame;
import net.ws3.hard.controller.HardController;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;
import net.ws3.hard.model.UserData;
import net.ws3.hard.view.HardRenderer;
import aurelienribon.tweenengine.Tween;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class GameScreen implements Screen, InputProcessor{
	private final HardGame game;
	private final int levelid;
	private Level level;
	private HardModel model;
	private HardRenderer renderer;
	private HardController controller;
	private InputMultiplexer im;
	private Stage stage;
	private Label deathCount;
	private Button soundButton;
	private Skin hudSkin;
	private Table endGameTable;
	private Label endGameScore;
	private Button nextLevel;
	private Button mainMenu;
	private Image highScoreSplash;
	private boolean isHighScoreFaded;
	
	public GameScreen(HardGame gam, Level level, int leveli){
		this.game = gam;
		this.levelid = leveli;
		this.level = level;
		Tween.registerAccessor(Circle.class, new BlueCircleAccessor());
		Tween.registerAccessor(CircleWrapper.class, new CircleWrapperAccessor());
	}
	
	public void render(float delta){
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(!model.isEndGame()){
			model.updateTweens(delta);
			controller.update(delta);
			if(model.collisionControl()){
				Assets.playPunch();
				UserData.death();
				if(UserData.getLifes() < 0)
					game.setScreen(new NoLifeScreen(game));
				deathCount.setText("" + UserData.getLifes());
				model.respawn();
				controller.updateTouch();
			}
			if(model.eatYellowFuckers())
				Assets.playDollar();
			model.savePosition();
		}	
		else{
			int highScore = UserData.getHighScore(levelid);
			String highStr;
			if(highScore == -1){
				highStr = "NaN";
			}
			else
				highStr = highScore + "";
			UserData.saveHighscore(levelid, model.getDeathCount());
			endGameScore.setText("DEATHS: " + model.getDeathCount() + "\n\nBEST: " + highStr);
			
			if(highScore == -1 || highScore > model.getDeathCount()){
				stage.addActor(highScoreSplash);
				isHighScoreFaded = false;
			}
			else if(isHighScoreFaded){
				UserData.unlockNextLevel(levelid);
				stage.addActor(endGameTable);
			}
		}
		renderer.render();
		stage.act(delta);
		stage.draw();
		
		if(Gdx.input.isKeyPressed(Keys.BACK))
			game.setScreen(new LevelScreen(game));
	}
	
	public void resize(int width, int height){
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void show() {
		isHighScoreFaded = true;
		
		model = new HardModel();
		model.loadLevel(level);
		
		renderer = new HardRenderer(model, false);
		controller = new HardController(model);
		
		highScoreSplash = new Image(Assets.highScoreSplash);
		highScoreSplash.setCenterPosition(400, 240);
		highScoreSplash.getColor().a = 0f;
		highScoreSplash.setTouchable(Touchable.disabled);
		highScoreSplash.addAction(Actions.sequence(Actions.fadeIn(1f), Actions.delay(1f), Actions.fadeOut(1f), new Action(){
			@Override
			public boolean act(float delta){
				UserData.unlockNextLevel(levelid);
				stage.addActor(endGameTable);
				return true;
			}
		}));
		
		stage = new Stage(new StretchViewport(800, 480));
		
		hudSkin = new Skin(Gdx.files.internal("hud/hud.json"), new TextureAtlas(Gdx.files.internal("hud/hud.atlas")));
		
		deathCount = new Label("" + UserData.getLifes(), hudSkin, "deathCount");
		deathCount.setAlignment(Align.center);
		deathCount.setBounds(0, 401, 61, 79);
		stage.addActor(deathCount);
		
		soundButton = new Button(hudSkin, "sound");
		soundButton.setBounds(800 - 64, 480 - 64, 64, 64);
		stage.addActor(soundButton);
		
		endGameTable = new Table();
		endGameTable.setBackground(hudSkin.getDrawable("endgamebg"));
		endGameTable.setBounds(400 - 198, 240 - 71, 396, 142);
		
		endGameScore = new Label("DEATHS: \n\nBEST: ", hudSkin, "score");
		endGameScore.setAlignment(Align.center);
		endGameTable.add(endGameScore).width(117).height(117).padRight(3);
		
		mainMenu = new Button(hudSkin, "mainMenu");
		mainMenu.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				game.setScreen(new MainMenuScreen(game));
			}
		});
		endGameTable.add(mainMenu).padRight(3);
		
		nextLevel = new Button(hudSkin, "nextLevel");
		nextLevel.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y){
				game.openLevel(levelid + 1);
			}
		});
		endGameTable.add(nextLevel);
		
		im = new InputMultiplexer();
		Array<InputProcessor> processors = new Array<InputProcessor>();
		processors.add(this);
		processors.add(stage);
		im.setProcessors(processors);

		Gdx.input.setInputProcessor(im);
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
		UserData.dispose();
		renderer.dispose();
		stage.dispose();
		hudSkin.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.A)
			controller.leftPressed();
		if(keycode == Keys.D)
			controller.rightPressed();
		if(keycode == Keys.W)
			controller.upPressed();
		if(keycode == Keys.S)
			controller.downPressed();
		/*if(keycode == Keys.BACK)
			game.setScreen(new LevelScreen(game));*/
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		if(keycode == Keys.A)
			controller.leftReleased();
		if(keycode == Keys.D)
			controller.rightReleased();
		if(keycode == Keys.W)
			controller.upReleased();
		if(keycode == Keys.S)
			controller.downReleased();
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		controller.setTouchDown(screenX, 480 - screenY);
		System.out.println("TOUCHDOWN = screenX: " + screenX + " - screenY: " + screenY);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		controller.setTouchUp();
		System.out.println("TOUCHUP = screenX: " + screenX + " - screenY: " + screenY);
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		controller.setTouchDragged(screenX, 480 - screenY);
		System.out.println("TOUCHDRAGGED = screenX: " + screenX + " - screenY: " + screenY);
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}