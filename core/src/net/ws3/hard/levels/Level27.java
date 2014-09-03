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

public class Level27 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85;
		position.y = 170;
		position.width = 25;
		position.height = 25;		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 275;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 120;
		rect.y = 65;
		rect.width = 560;
		rect.height = 350;
		map.add(rect);
		//checkpoint
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
		float baseTime = 1f;
		float baseTime2 = 2f;
		float baseTime3 = 3f;
		float temp = 17.5f;
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 120 + temp;
				circle.y = 65 + temp + 35 * i + 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(135 + temp + 35 * i + 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{	
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 155 + temp + 140 * j;
				circle.y = 65 + temp + 35 * i;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
					.target(310 + temp + 35 * i)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{	
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 470 + temp + 140 * j;
				circle.y = 65 + temp + 35 * i;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
					.target(310 + temp + 35 * i)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{	
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 575 + temp - 245 * j;
				circle.y = 310 + temp + 35 * i;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
					.target(65 + temp + 35 * i)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 190 + temp;
			circle.y = 65 + temp + 105 * i;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(170 + temp + 105 * i)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 400 + temp;
			circle.y = 65 + temp + 105 * i;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(170 + temp + 105 * i)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 365 + temp;
			circle.y = 170 + temp + 105 * i;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(65 + temp + 105 * i)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 545 + temp;
			circle.y = 170 + temp + 105 * i;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(65 + temp + 105 * i)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 225 + temp;
				circle.y = 415 - temp - 35 * i - 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(345 - temp - 35 * i - 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 260 + temp;
				circle.y = 415 - temp - 35 * i - 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(345 - temp - 35 * i - 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 435 + temp;
				circle.y = 415 - temp - 35 * i - 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(345 - temp - 35 * i - 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 505 + temp;
				circle.y = 415 - temp - 35 * i - 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(345 - temp - 35 * i - 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 645 + temp;
				circle.y = 415 - temp - 35 * i - 175 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(345 - temp - 35 * i - 175 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7;
	
		circle = new Circle();
		circle.x = 715;
		circle.y = 240;
		circle.radius = r;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);		
	}

}
