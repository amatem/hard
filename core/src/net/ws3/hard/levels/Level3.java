package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level3 implements Level {

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 380;
		position.y = 230;
		position.width = 27;
		position.height = 27;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 325;
		rect.y = 310;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 325;
		rect.y = 170;
		rect.width = 140;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 360;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 360;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 35f;
		float baseTime = 1.2f;
		
		circle = new Circle();
		circle.x = 325 + temp / 2;
		circle.y = 310 - temp / 2 - temp;
		circle.radius = 10;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 ;
		circle.y = 310 - temp/2 - temp * 2;
		circle.radius = 10;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.repeat(-1, 0f)
			.start(manager); 
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2;
		circle.y = 310 - temp / 2 - temp * 3;
		circle.radius = 10;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))	
			.repeat(-1, 0f)
			.start(manager); 
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp;
		circle.y = 310 - temp / 2 - temp * 3;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))	
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 2;
		circle.y = 310 - temp / 2 - temp * 3;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 3;
		circle.y = 310 - temp / 2 - temp * 3;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 3;
		circle.y = 310 - temp / 2 - temp * 2;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 3;
		circle.y = 310 - temp / 2 - temp;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 3;
		circle.y = 310 - temp / 2;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp * 2;
		circle.y = 310 - temp / 2;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		/*
		circle = new Circle();
		circle.x = 325 + temp / 2 + temp;
		circle.y = 310 - temp / 2;
		circle.radius = 10;
		Timeline.createSequence()
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 3))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp * 2))	
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp * 2))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2 - temp))
		.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp / 2))
		.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp))	
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 325 + temp / 2;
		circle.y = 310 - temp / 2;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.X, baseTime).target(325 + temp / 2 + temp).repeat(-1, 0f).start(manager);
		blueCircles.add(circle); */
		
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 343;
		circle.y = 327;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.FINISH);
		
	}
	
}
