package net.ws3.hard.levels;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level10 implements Level{
	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 335;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		//start
		rect = new Rectangle();
		rect.x = 335;
		rect.y = 345;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 335;
		rect.y = 170;
		rect.width = 35;
		rect.height = 175;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 370;
		rect.y = 170;
		rect.width = 35;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 265;
		rect.y = 100;
		rect.width = 70;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 335;
		rect.y = 65;
		rect.width = 175;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 510;
		rect.y = 100;
		rect.width = 70;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 475;
		rect.y = 170;
		rect.width = 35;
		rect.height = 175;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 440;
		rect.y = 170;
		rect.width = 35;
		rect.height = 140;
		map.add(rect);
		
		//finish
		rect = new Rectangle();
		rect.x = 475;
		rect.y = 345;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float temp = 17.5f;
		float r = 7;
		
		circle = new Circle();
		circle.x = 405 - r;
		circle.y = 310 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(335 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 405 - r;
		circle.y = 240 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(335 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 335 + r;
		circle.y = 275 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(405 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 335 + r;
		circle.y = 205 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(405 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 265 + r;
		circle.y = 205 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(335 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 335 - r;
		circle.y = 170 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(265 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 265 + r;
		circle.y = 135 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(335 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 335 + temp;
		circle.y = 135 - r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(65 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 405 + temp;
		circle.y = 135 - r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(65 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 475 + temp;
		circle.y = 135 - r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(65 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 440 + temp;
		circle.y = 65 + r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(135 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 370 + temp;
		circle.y = 65 + r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(135 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 580 - r;
		circle.y = 135 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(510 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 580 - r;
		circle.y = 205 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(510 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 510 + r;
		circle.y = 170 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(580 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 510 - r;
		circle.y = 205 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(440 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 510 - r;
		circle.y = 275 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(440 + r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 440 + r;
		circle.y = 240 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(510 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 440 + r;
		circle.y = 310 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(510 - r)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
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
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
