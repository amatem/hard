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

public class Level20 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 715;
		position.y = 135;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//finish
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 310;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 345;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 170;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 240;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 345;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 310;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 170;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 275;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 435;
		rect.y = 240;
		rect.width = 175;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 345;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 310;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 275;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 575;
		rect.y = 170;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 240;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 100;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 0.9f;
		float temp = 17.5f;
		float baseTime2 = 1.6f;
		
		for (int i = 0; i < 2 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 400 - temp + 210 * i;
				circle.y = 170 + temp + 105 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.X, baseTime)
					.target(505 - temp + 210 * i)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 295 - temp + 210 * i;
				circle.y = 240 + temp + 105 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.X, baseTime)
					.target(400 - temp + 210 * i)
					.ease(Linear.INOUT)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 5 ; i++)
		{
			circle = new Circle();
			circle.x = 680 + temp - 105 * i;
			circle.y = 170 + temp;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
				.target(380 - temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}

		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7;
		float temp = 17.5f;
		
		circle = new Circle();
		circle.x = 680 + temp;
		circle.y = 380 - temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 680 - temp;
		circle.y = 240 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 540 + temp;
		circle.y = 240 - temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 540 + temp;
		circle.y = 310 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 240 - temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 310 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 470 - temp;
		circle.y = 240 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		
	}

}
