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

public class Level17 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 160;
		position.y = 385;
		position.width = 25;
		position.height = 25;	
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 380;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 100;
		rect.width = 490;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 100;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 345;
		rect.width = 490;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 30;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 30;
		rect.width = 35;
		rect.height = 350;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 170;
		rect.width = 350;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 260;
		rect.y = 275;
		rect.width = 350;
		rect.height = 35;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 505;
		rect.y = 170;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 1f;
		float r = 7f;

		circle = new Circle();
		circle.x = 540 + temp;
		circle.y = 275 + temp;
		circle.radius = r;
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 65 + temp;
		circle.radius = r;
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 135 + temp;
		circle.radius = r;
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 310 + temp;
		circle.radius = r;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 225 + temp;
		circle.y = 345 + temp;
		circle.radius = r;
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 190 + temp;
		circle.y = 415 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(100 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 120 + temp;
		circle.y = 100 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(610 - temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 680 - temp;
		circle.y = 380 - temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(190 + temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 - temp;
		circle.y = 30 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(380 - temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 610 - temp;
		circle.y = 30 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(380 - temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 260 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(610 - temp)
			.ease(Linear.INOUT)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);

		circle = new Circle();
		circle.x = 260 + temp;
		circle.y = 275 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime)
			.target(610 - temp)
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
