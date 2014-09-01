package net.ws3.hard.model;

import java.util.Iterator;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class HardModel {
	public enum MapState{
		START, FINISH, CHECKPOINT, PLAIN
	}
	
	private Rectangle player;
	private Rectangle savedPosition;
	private Array<Rectangle> map;
	private Array<Circle> blueCircles;
	private Array<Circle> yellowCircles;
	private Array<Circle> tempYellowCircles;
	private Array<MapState> mapState;
	private TweenManager manager;
	private int deathCount;
	
	public HardModel(){
		deathCount = 0;
		player = new Rectangle();
		savedPosition = new Rectangle();
		map = new Array<Rectangle>();
		blueCircles = new Array<Circle>();
		yellowCircles = new Array<Circle>();
		tempYellowCircles = new Array<Circle>();
		mapState = new Array<MapState>();
		manager = new TweenManager();
	}
	
	public int getDeathCount(){
		return deathCount;
	}
	
	public TweenManager getManager(){
		return manager;
	}
	
	public void loadLevel(Level level){
		level.setStartPosition(savedPosition);
		level.setMap(map);
		level.setBlueCircles(blueCircles, manager);
		level.setYellowCircles(yellowCircles);
		level.setMapState(mapState);
		
		player.x = savedPosition.x;
		player.y = savedPosition.y;
		player.width = savedPosition.width;
		player.height = savedPosition.height;
		
		for(Circle circle : yellowCircles)
			tempYellowCircles.add(circle);
	}
	
	public Rectangle getPlayer(){
		return player;
	}
	public Rectangle getSavedPosition(){
		return savedPosition;
	}
	public Array<Rectangle> getMap(){
		return map;
	}
	public Array<Circle> getBlueCircles(){
		return blueCircles;
	}
	public Array<Circle> getYellowCircles(){
		return tempYellowCircles;
	}
	public Array<MapState> getMapState(){
		return mapState;
	}
	
	public void respawn(){
		deathCount++;
		player.x = savedPosition.x;
		player.y = savedPosition.y;
		
		tempYellowCircles.clear();
		for(Circle circle : yellowCircles)
			tempYellowCircles.add(circle);
	}
	
	private boolean isOutOfMapp(float x, float y){
		for(Rectangle rect: map)
			if(rect.x <= x && rect.y <= y && rect.x + rect.width >= x && rect.y + rect.height >= y)
				return false;
		
		return true;
	}
	
	public void savePosition(){
		Iterator<Rectangle> mapIterator = map.iterator();
		Iterator<MapState> stateIterator = mapState.iterator();
		
		while(mapIterator.hasNext() && stateIterator.hasNext()){
			MapState state = stateIterator.next();
			Rectangle rect = mapIterator.next();
			
			if(state == MapState.CHECKPOINT && rect.x <= player.x && rect.y <= player.y && rect.x + rect.width >= player.x && rect.y + rect.height >= player.y){
				savedPosition.x = player.x;
				savedPosition.y = player.y;
				break;
			}
		}
	}
	
	public boolean isOutOfMap(float x, float y, float width, float height){
		return isOutOfMapp(x, y) || isOutOfMapp(x + width, y) || isOutOfMapp(x, y + height) || isOutOfMapp(x + width, y + height);
	}
	
	public boolean collisionControl(){
		for(Circle circle: blueCircles)
			if(Intersector.overlaps(circle, player))
				return true;
		return false;
	}
	
	public void eatYellowFuckers(){
		Iterator<Circle> iterator = tempYellowCircles.iterator();
		Circle circle;
		
		while(iterator.hasNext()){
			circle = iterator.next();
			if(Intersector.overlaps(circle, player))
				iterator.remove();
		}
	}
	
	public boolean isEndGame(){
		if(tempYellowCircles.random() == null && player.overlaps(map.get(mapState.indexOf(MapState.FINISH, false))))
			return true;
		return false;
	}
	
	public void updateTweens(float delta){
		manager.update(delta);
	}
}
