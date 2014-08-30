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

public class Level8 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 220 + 5;
		position.y = 350 + 5;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 185;
		rect.y = 70;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 290;
		rect.y = 70;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 395;
		rect.y = 70;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 500;
		rect.y = 70;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 220;
		rect.y = 70;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 220;
		rect.y = 175;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 220;
		rect.y = 280;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		//start
		rect = new Rectangle();
		rect.x = 220;
		rect.y = 350;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 220;
		rect.y = 385;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 325;
		rect.y = 350;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 325;
		rect.y = 105;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 430;
		rect.y = 70;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 430;
		rect.y = 175;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 430;
		rect.y = 280;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 430;
		rect.y = 385;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		//finish
		rect = new Rectangle();
		rect.x = 535;
		rect.y = 210;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 1f;
		float baseTime2 = 1.5f;
		
		for (int j = 0; j < 2 ; j++)
		{
			for (int i = 0; i < 3 ; i++)
			{
				circle = new Circle();
				circle.x = 185 + temp + 18 * temp * j;
				circle.y = 420 - temp - 6 * temp * i;
				circle.radius = 7;
				Timeline.createSequence()
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(185 + temp + 6* temp + 6 * temp * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(420 - temp - 6 * temp * i - 6 * temp))
					.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(185 + temp + 18 * temp * j))
					.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(420 - temp - 6 * temp * i))
				.repeat(-1, 0f)
				.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 290 + temp ;
		circle.y = 385 - temp ;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(290 + temp + 6* temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(385 - temp - 14 * temp))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(290 + temp))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(385 - temp))
		.repeat(-1, 0f)
		.start(manager);
		blueCircles.add(circle);
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float temp = 17.5f;
		
		circle = new Circle();
		circle.x = 185 + temp;
		circle.y = 70 + temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 185 + temp + 18 * temp;
		circle.y = 70 + temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 185 + temp + 18 * temp;
		circle.y = 70 + temp + 18 * temp;
		circle.radius = 10;
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
