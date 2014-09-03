package net.ws3.hard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable;

public class Assets {
	private static TextureAtlas gameTextures;
	
	public static TextureRegion bgTexture;
	public static TextureRegion mapTileTexture;
	public static TextureRegion mapNotPlainTexture;
	public static TextureRegion mapWrapperTexture;
	public static TextureRegion playerTexture;
	public static TextureRegion blueCircleTexture;
	public static TextureRegion yellowCircleTexture;
	public static TextureRegion endGameBlack;
	public static TextureRegion highScoreSplash;
	
	public static TiledDrawable mapWrapperTiled;
	public static TiledDrawable mapTileTiled;
	public static TiledDrawable mapNotPlainTiled;
	
	public static Sound punchSound;
	public static Sound dollarSound;
	public static boolean isSoundOn;
	
	public static void loadAssets(){
		gameTextures = new TextureAtlas(Gdx.files.internal("gameTextures.atlas"));
		
		endGameBlack = gameTextures.findRegion("endgameblack");
		highScoreSplash = gameTextures.findRegion("highscore");
		bgTexture = gameTextures.findRegion("bg");
		mapTileTexture = gameTextures.findRegion("mapTile");
		mapNotPlainTexture = gameTextures.findRegion("mapNotPlain");
		mapWrapperTexture = gameTextures.findRegion("mapWrapper");
		playerTexture = gameTextures.findRegion("player");
		blueCircleTexture = gameTextures.findRegion("blueCircle");
		yellowCircleTexture = gameTextures.findRegion("yellowCircle");
		
		mapTileTiled = new TiledDrawable(mapTileTexture);
		mapWrapperTiled = new TiledDrawable(mapWrapperTexture);
		mapNotPlainTiled = new TiledDrawable(mapNotPlainTexture);
		
		isSoundOn = true;
		punchSound = Gdx.audio.newSound(Gdx.files.internal("punch.wav"));
		dollarSound = Gdx.audio.newSound(Gdx.files.internal("dollar.wav"));
	}
	
	public static void setSoundOn(boolean isSoundOn){
		Assets.isSoundOn = isSoundOn;
	}
	
	public static void playPunch(){
		if(Assets.isSoundOn)
			punchSound.play();
	}
	
	public static void playDollar(){
		if(Assets.isSoundOn)
			dollarSound.play();
	}
	
	public static void dispose(){
		gameTextures.dispose();
	}
}
