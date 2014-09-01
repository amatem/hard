package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level22 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 715;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 345;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 345;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 205;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 205;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 65;
		rect.width = 70;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 65;
		rect.width = 280;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 135;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 345;
		rect.width = 280;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 65;
		rect.width = 70;
		rect.height = 350;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 65;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
		
	}

}
