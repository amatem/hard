package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level28 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 120;
		position.y = 65;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 30;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 380;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 30;
		rect.width = 525;
		rect.height = 175;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 135;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);
		//checkpoint
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 275;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 275;
		rect.width = 525;
		rect.height = 175;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float baseTime2 = 1f;
		float r = 7f;
		float temp = 17.5f;
		
		for (int i = 0 ; i < 8 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 155 + temp + 70 * i;
				circle.y = 170 + temp + 105 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(30 + temp + 380 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 7 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 190 + temp + 70 * i;
				circle.y = 30 + temp + 380 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(170 + temp + 105 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 4 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 190 - temp + 350 * j;
				circle.y = 30 + temp + 35 * i;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.X, baseTime2)
					.target(330 - temp + 350 * j)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 4 ; i++)
		{
			circle = new Circle();
			circle.x = 365 - temp;
			circle.y = 65 + temp + 35 * i;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.X, baseTime2)
				.target(505 - temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 295 + temp;
			circle.y = 450 - temp - 35 * i;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.X, baseTime2)
				.target(155 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 295 + temp;
		circle.y = 310 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime2)
			.target(155 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 470 + temp;
			circle.y = 380 - temp - 35 * i;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.X, baseTime2)
				.target(330 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 470 + temp;
		circle.y = 450 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime2)
			.target(330 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		for (int i = 0 ; i < 3 ; i++)
		{
			circle = new Circle();
			circle.x = 645 + temp;
			circle.y = 450 - temp - 35 * i;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.X, baseTime2)
				.target(505 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 645 + temp;
		circle.y = 310 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime2)
			.target(505 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
	}
	
	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);	
	}

}
