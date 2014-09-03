package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level22 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 715;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 345;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 345;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 205;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 205;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 65;
		rect.width = 70;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 65;
		rect.width = 280;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 135;
		rect.width = 70;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 345;
		rect.width = 280;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 65;
		rect.width = 70;
		rect.height = 350;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 65;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 1.5f;
		float baseTime2 = 1f;
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 680 - temp - 175 * i;
			circle.y = 380 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(470 + temp + 175 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(680 - temp - 175 * i).ease(Linear.INOUT))
				
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 680 - temp - 175 * i;
			circle.y = 240 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(240 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(470 + temp + 175 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(240 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(680 - temp - 175 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 680 - temp - 175 * i;
			circle.y = 100 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(470 + temp + 175 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(100 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(680 - temp - 175 * i).ease(Linear.INOUT))		
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 400 - temp - 175 * i;
			circle.y = 380 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(190 + temp + 175 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(380 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(400 - temp - 175 * i).ease(Linear.INOUT))		
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 330 + temp + 35 * i;
			circle.y = 65 + temp + 175 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(365 + temp - 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(240 + temp - 175 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(330 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(65 + temp + 175 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 120 + temp + 35 * i;
			circle.y = 135 + temp + 175 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(155 + temp - 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(300 + temp - 175 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime).target(120 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime).target(135 + temp + 175 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 540 - temp  - 35 * i;
			circle.y = 310 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(310 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(470 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(310 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(540 - temp - 35 * i).ease(Linear.INOUT))				
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 680 - temp  - 35 * i;
			circle.y = 170 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(170 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(610 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(170 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(680 - temp - 35 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 400 - temp  - 35 * i;
			circle.y = 310 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(310 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(330 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(310 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(400 - temp - 35 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 470 - temp  - 35 * i;
			circle.y = 100 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(100 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(400 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(100 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(470 - temp - 35 * i).ease(Linear.INOUT))	
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 190 - temp  - 35 * i;
			circle.y = 380 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(380 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(120 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(380 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(190 - temp - 35 * i).ease(Linear.INOUT))
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2 ; i++)
		{
			circle = new Circle();
			circle.x = 190 - temp  - 35 * i;
			circle.y = 100 + temp - 35 * i;
			circle.radius = 7;
			Timeline.createSequence()
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(100 - temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(120 + temp + 35 * i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.Y, baseTime2).target(100 + temp - 35 *i).ease(Linear.INOUT))
				.push(Tween.to(circle, BlueCircleAccessor.X, baseTime2).target(190 - temp - 35 * i).ease(Linear.INOUT))	
			.repeat(-1, 0f)
			.start(manager);
			blueCircles.add(circle);
		}
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
		mapState.add(HardModel.MapState.FINISH);
		
		
	}

}
