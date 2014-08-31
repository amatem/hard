package net.ws3.hard.levels;

import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level16 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85;
		position.y = 240;
		position.width = 25;
		position.height = 25;		
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 205;
		rect.width = 140;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 135;
		rect.width = 350;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 205;
		rect.width = 140;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 275;
		rect.width = 350;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 135;
		rect.width = 140;
		rect.height = 140;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 0.5f;
		float r = 7f;
		
		for (int j = 0; j < 2 ; j++)
		{
			for (int i = 0; i < 3 ; i++)
			{
				circle = new Circle();
				circle.x = 120 + temp + 70 * j;
				circle.y = 345 - temp - 70 * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(120 + temp + 35 + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 35 - 70 * i))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(120 + temp + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 70 * i))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int j = 0; j < 2 ; j++)
		{
			for (int i = 0; i < 3 ; i++)
			{
				circle = new Circle();
				circle.x = 330 + temp + 70 * j;
				circle.y = 345 - temp - 70 * i;
				circle.radius = r;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(330 + temp + 35 + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 35 - 70 * i))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(330 + temp + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 70 * i))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int j = 0; j < 2 ; j++)
		{
			for (int i = 0; i < 3 ; i++)
			{
				circle = new Circle();
				circle.x = 540 + temp + 70 * j;
				circle.y = 345 - temp - 70 * i;
				circle.radius = 7;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(540 + temp + 35 + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 35 - 70 * i))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(540 + temp + 70 * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 70 * i))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 260 + temp;
		circle.y = 205 - temp ;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp + 35))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(205 - temp - 35))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(205 - temp))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 470 + temp;
		circle.y = 345 - temp;
		circle.radius = r;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(470 + temp + 35))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - 35))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(470 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float temp = 17.5f;
		
		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 345 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 225 + temp;
		circle.y = 345 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 170 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 540 + temp;
		circle.y = 170 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
