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

public class Level9 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85 + 70/3f;
		position.y = 375;
		position.width = 25;
		position.height = 25;	
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 65;
		rect.width = 210;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 135;
		rect.width = 280;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 135;
		rect.width = 70;
		rect.height = 280;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 345;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 275;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 345;
		rect.width = 210;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 135;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		//checkpoint
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 505;
		rect.y = 135;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 505;
		rect.y = 65;
		rect.width = 210;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 505;
		rect.y = 345;
		rect.width = 210;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 275;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//final
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 0.25f;
		float temp = 17.5f;
		
		// Moving
		
		circle = new Circle();
		circle.x = 85 + temp;
		circle.y = 345 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(85 + temp + temp * 2 ).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp - temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(85 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 120 + temp;
		circle.y = 100 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(120 + temp - temp * 2 ).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(120 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 260 + temp;
		circle.y = 310 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp - temp * 2 ).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 260 + temp;
		circle.y = 100 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp - temp * 2 ).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(260 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 400 + temp;
		circle.y = 345 + temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(400 + temp - temp * 2 ).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 + temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(400 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(345 + temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 + temp;
		circle.y = 240 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(400 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(310).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(240 - temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(365 + temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 505 + temp;
		circle.y = 205 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(505 + temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(205 - temp - temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(505 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(205 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 505 + temp;
		circle.y = 415 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(505 + temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(415 - temp - temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(505 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(415 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 645;
		circle.y = 100 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(135 - temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(575 - temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(645).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 680 + temp;
		circle.y = 380 - temp;
		circle.radius = 7;
		Timeline.createSequence()
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(680 + temp - temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 - temp + temp * 2).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(680 + temp).ease(Linear.INOUT))
			.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 - temp).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		//Non Moving
		
		circle = new Circle();
		circle.x = 120 + temp;
		circle.y = 240;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 85 + temp;
		circle.y = 170;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 190;
		circle.y = 345 - temp;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 190;
		circle.y = 135 - temp;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 225 + temp;
		circle.y = 380 ;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 225 + temp;
		circle.y = 170;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 295;
		circle.y = 170 + temp;
		circle.radius = 7;
		blueCircles.add(circle);
	
		
		circle = new Circle();
		circle.x = 330 + temp;
		circle.y = 135 + temp;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 330;
		circle.y = 345 + temp;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 + temp;
		circle.y = 310;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 505 + temp;
		circle.y = 240;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 505 + temp;
		circle.y = 100;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 610;
		circle.y = 345 + temp;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 540 + temp;
		circle.y = 310;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 645 + temp;
		circle.y = 310;
		circle.radius = 7;
		blueCircles.add(circle);
		
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 680;
		circle.y = 100;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);

		
	}

}
