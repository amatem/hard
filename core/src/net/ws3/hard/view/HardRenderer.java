package net.ws3.hard.view;

import java.util.Iterator;

import net.ws3.hard.Assets;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class HardRenderer {
	private HardModel model;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private ShapeRenderer debugRenderer;
	private boolean debug;
	
	public HardRenderer(HardModel model, boolean debug){
		Assets.loadAssets();
		this.model = model;
		this.debug = debug;
		
		batch = new SpriteBatch();
		
		if(debug)
			debugRenderer = new ShapeRenderer();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	}
	
	public void render(){
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		batch.draw(Assets.bgTexture, 0, 0, 800, 480);
		
		Array<Rectangle> map = model.getMap();
		Array<MapState> mapState = model.getMapState();
		
		for(Rectangle rect : map)
			Assets.mapWrapperTiled.draw(batch, rect.x - 10, rect.y - 10, rect.width + 20, rect.height + 20);
		
		Iterator<Rectangle> mapIterator = map.iterator();
		Iterator<MapState> stateIterator = mapState.iterator();
		
		while(mapIterator.hasNext() && stateIterator.hasNext()){
			Rectangle rect = mapIterator.next();
			MapState state = stateIterator.next();
			
			if(state == MapState.PLAIN)
				Assets.mapTileTiled.draw(batch, rect.x, rect.y, rect.width, rect.height);
			else
				Assets.mapNotPlainTiled.draw(batch, rect.x, rect.y, rect.width, rect.height);
		}
		
		Rectangle player = model.getPlayer();
		batch.draw(Assets.playerTexture, player.x, player.y, player.width, player.height);
		
		for(Circle circle : model.getBlueCircles())
			batch.draw(Assets.blueCircleTexture, circle.x - circle.radius, circle.y - circle.radius, circle.radius + circle.radius, circle.radius + circle.radius);
		
		for(Circle circle : model.getYellowCircles())
			batch.draw(Assets.yellowCircleTexture, circle.x - circle.radius, circle.y - circle.radius, circle.radius + circle.radius, circle.radius + circle.radius);
		
		if(model.isEndGame())
			batch.draw(Assets.endGameBlack, 0, 0, 800, 480);
		
		batch.end();
		
		if(debug)
			drawDebug();
	}
	
	public void drawDebug(){
		camera.update();
		
		debugRenderer.setProjectionMatrix(camera.combined);
		debugRenderer.begin(ShapeType.Line);
		
		Array<Rectangle> map = model.getMap();
		Array<MapState> mapState = model.getMapState();
		Iterator<Rectangle> mapIterator = map.iterator();
		Iterator<MapState> stateIterator = mapState.iterator();
		
		while(mapIterator.hasNext() && stateIterator.hasNext()){
			Rectangle rect = mapIterator.next();
			MapState state = stateIterator.next();
			if(state == HardModel.MapState.START)
				debugRenderer.setColor(Color.GREEN);
			else if(state == HardModel.MapState.FINISH)
				debugRenderer.setColor(Color.OLIVE);
			else if(state == HardModel.MapState.CHECKPOINT)
				debugRenderer.setColor(Color.MAGENTA);
			else if(state == HardModel.MapState.PLAIN)
				debugRenderer.setColor(Color.CYAN);
			debugRenderer.rect(rect.x, rect.y, rect.width, rect.height);
		}
		
		Rectangle player = model.getPlayer();
		debugRenderer.setColor(Color.RED);
		debugRenderer.rect(player.x, player.y, player.width, player.height);
		
		Array<Circle> blueCircles = model.getBlueCircles();
		debugRenderer.setColor(Color.BLUE);
		for(Circle circle: blueCircles)
			debugRenderer.circle(circle.x, circle.y, circle.radius);

		Array<Circle> yellowCircles = model.getYellowCircles();
		debugRenderer.setColor(Color.YELLOW);
		for(Circle circle: yellowCircles)
			debugRenderer.circle(circle.x, circle.y, circle.radius);
		
		debugRenderer.end();
	}
	
	public void dispose(){
		Assets.dispose();
		batch.dispose();
		if(debug)
			debugRenderer.dispose();
	}
}
