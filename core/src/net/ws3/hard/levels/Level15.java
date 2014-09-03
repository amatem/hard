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

public class Level15 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 102.5f;
		position.y = 380f;
		position.width = 25;
		position.height = 25;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 345;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 310;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 50;
		rect.y = 170;
		rect.width = 105;
		rect.height = 140;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 50;
		rect.y = 65;
		rect.width = 245;
		rect.height = 105;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 190;
		rect.y = 170;
		rect.width = 105;
		rect.height = 140;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 190;
		rect.y = 310;
		rect.width = 245;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 170;
		rect.width = 105;
		rect.height = 140;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 330;
		rect.y = 65;
		rect.width = 245;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 170;
		rect.width = 105;
		rect.height = 140;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 470;
		rect.y = 310;
		rect.width = 280;
		rect.height = 105;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 170;
		rect.width = 105;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 715;
		rect.y = 135;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 65;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 0.4f;
		float baseTime2 = 1.2f;
		float baseTime3 = 1.8f;
		float temp = 17.5f;
		float r = 7f;
		
		for (int i = 0 ; i < 6 ; i++ )
		{
			circle = new Circle();
			circle.x = 190 + temp + 70f * i;
			circle.y = 65 + temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(415 - temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++ )
		{
			circle = new Circle();
			circle.x = 225 + temp + 140f * i;
			circle.y = 415 - temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime3)
				.target(65 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 50 + temp + 70f * i;
			circle.y = 65 + temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
				.target(310 - temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 85 + temp;
		circle.y = 310 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
			.target(65 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		for (int i = 0 ; i < 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 645 + temp + 70f * i;
			circle.y = 415 - temp;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
				.target(170 + temp)
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 680 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime2)
			.target(415 - temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 295 + temp;
		circle.y = 415 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(310 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 170 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(65 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 155 + temp;
		circle.y = 170 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(65 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 610 + temp;
		circle.y = 415 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(310 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 575 + temp;
		circle.y = 310 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(415 - temp)
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
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
		
	}

}
