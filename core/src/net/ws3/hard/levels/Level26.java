package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level26 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 365;
		position.y = 100;
		position.width = 25;
		position.height = 25;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 65;
		rect.width = 700;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 295;
		rect.y = 170;
		rect.width = 210;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 260;
		rect.y = 205;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 240;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 275;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 310;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 345;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 380;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 610;
		rect.y = 380;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 345;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 310;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 505;
		rect.y = 275;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 240;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 435;
		rect.y = 205;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 65;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float temp = 17.5f;
		
		for (int i = 0 ; i < 4 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 50 + temp + 70 * i + 35 * j;
				circle.y = 65 + temp + 70 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(135 + temp - 70 * j)
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
				circle.x = 540 - temp + 70 * i - 35 * j;
				circle.y = 65 + temp + 70 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(135 + temp - 70 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 2 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 190 + temp + 70 * i + 35 * j;
				circle.y = 380 - temp - 70 * i - 105 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(310 - temp - 70 * i + 35 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 2 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 610 - temp - 70 * i - 35 * j;
				circle.y = 310 - temp - 70 * i + 35 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(380 - temp - 70 * i -105 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 240 - temp;
		circle.radius = 7;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(170 - temp)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 470 - temp;
		circle.y = 170 - temp;
		circle.radius = 7;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(240 - temp)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7;
		float temp = 17.5f;
	
		circle = new Circle();
		circle.x = 50 + temp;
		circle.y = 100 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 750 - temp;
		circle.y = 100 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 155;
		circle.y = 380;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 645;
		circle.y = 380;
		circle.radius = r;
		yellowCircles.add(circle);

		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {		
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
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
