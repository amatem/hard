package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level30 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85;
		position.y = 65;
		position.width = 25;
		position.height = 25;		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 30;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 100;
		rect.width = 700;
		rect.height = 350;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 30;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float baseTime2 = 2f;
		float r = 7f;
		float temp = 17.5f;
		
		for (int i = 0 ; i < 10 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 50 + temp + 70 * i + 35 * j;
				circle.y = 100 + temp + 315 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(450 - temp - 315 * j )
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 10 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 50 + temp + 70 * i + 35 * j;
				circle.y = 100 + temp + 315 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(450 - temp - 315 * j )
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = -1 ; i < 2; i += 2 )
		{
			for (int j = -1 ; j < 2 ; j += 2)
			{
				circle = new Circle();
				circle.x = 85 + temp * j;
				circle.y = 135 + temp * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(415 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(715 + temp * j).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(135 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(85 + temp * j).ease(Linear.INOUT))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 85;
		circle.y = 135;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(415).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(715).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(135).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(85).ease(Linear.INOUT))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		for (int i = -1 ; i < 2; i += 2 )
		{
			for (int j = -1 ; j < 2 ; j += 2)
			{
				circle = new Circle();
				circle.x = 155 + temp * j;
				circle.y = 205 + temp * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(345 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(645 + temp * j).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(205 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(155 + temp * j).ease(Linear.INOUT))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 155;
		circle.y = 205;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(345).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(645).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(205).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(155).ease(Linear.INOUT))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		for (int i = -1 ; i < 2; i += 2 )
		{
			for (int j = -1 ; j < 2 ; j += 2)
			{
				circle = new Circle();
				circle.x = 225 + temp * j;
				circle.y = 275 + temp * i;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.X, baseTime2)
					.target(575 + temp * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 225;
		circle.y = 275;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime2)
			.target(575)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		for (int i = -1 ; i < 2; i += 2 )
		{
			for (int j = -1 ; j < 2 ; j += 2)
			{
				circle = new Circle();
				circle.x = 715 + temp * j;
				circle.y = 415 + temp * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(135 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(85 + temp * j).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(415 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(715 + temp * j).ease(Linear.INOUT))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 715;
		circle.y = 415;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(135).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(85).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(415).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(715).ease(Linear.INOUT))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		for (int i = -1 ; i < 2; i += 2 )
		{
			for (int j = -1 ; j < 2 ; j += 2)
			{
				circle = new Circle();
				circle.x = 645 + temp * j;
				circle.y = 345 + temp * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(205 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(155 + temp * j).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(345 + temp * i).ease(Linear.INOUT))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(645 + temp * j).ease(Linear.INOUT))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 645;
		circle.y = 345;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(205).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(155).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(345).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(645).ease(Linear.INOUT))
		.repeat(-1, 0f)
		.start(manager); 
		blueCircles.add(circle);
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7;
	
		circle = new Circle();
		circle.x = 85;
		circle.y = 415;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 715;
		circle.y = 415;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 715;
		circle.y = 135;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 400;
		circle.y = 275;
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
