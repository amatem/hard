package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level21 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 120;
		position.y = 345;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 310;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 100;
		rect.width = 490;
		rect.height = 280;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 100;
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
		Circle circle;
		float r = 7;
		float temp = 17.5f;
		
		circle = new Circle();
		circle.x = 155 + temp;
		circle.y = 100 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 400;
		circle.y = 240;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 645 - temp;
		circle.y = 380 - temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
