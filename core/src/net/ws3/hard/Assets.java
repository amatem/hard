package net.ws3.hard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
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
	
	public static TiledDrawable mapWrapperTiled;
	public static TiledDrawable mapTileTiled;
	public static TiledDrawable mapNotPlainTiled;
	
	public static void loadAssets(){
		gameTextures = new TextureAtlas(Gdx.files.internal("gameTextures.atlas"));
		
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
	}
	
	public static void dispose(){
		gameTextures.dispose();
	}
}
