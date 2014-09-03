package net.ws3.hard.levels;

import aurelienribon.tweenengine.Timeline;
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

public class Level19 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 155;
		position.y = 240;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 170;
		rect.width = 70;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 135;
		rect.width = 420;
		rect.height = 210;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 170;
		rect.width = 70;
		rect.height = 140;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 0.8f;
		float baseTime2 = 0.7f;
		float r = 7f;
		
		for (int i = 0; i < 6 ; i++)
		{	
			circle = new Circle();
			circle.x = 190 + temp + 70 * i;
			circle.y = 310 + temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(135 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);	
		}
		
		for (int i = 0; i < 6 ; i++)
		{	
			circle = new Circle();
			circle.x = 225 + temp + 70 * i;
			circle.y = 135 + temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(310 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);	
		}
		
		circle = new Circle();
		circle.x = 190 + r;
		circle.y = 345 - r;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(295 - r , 240 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(400 - r , 345 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(505 + r , 240 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(610 - r , 345 - r).ease(Linear.INOUT))
		.repeatYoyo(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 610 - r;
		circle.y = 345 - r;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(505 + r , 240 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(400 + r , 345 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(295 - r , 240 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(190 + r , 345 - r).ease(Linear.INOUT))
		.repeatYoyo(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 190 + r;
		circle.y = 135 + r;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(295 - r , 240 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(400 - r , 135 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(505 + r , 240 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(610 - r , 135 + r).ease(Linear.INOUT))
		.repeatYoyo(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 610 - r;
		circle.y = 135 + r;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(505 + r , 240 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(400 + r , 135 + r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(295 - r , 240 - r).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.XY, baseTime2).target(190 + r , 135 + r).ease(Linear.INOUT))
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
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
