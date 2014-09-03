package net.ws3.hard.levels;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level11 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 645;
		position.y = 275;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 100;
		rect.width = 420;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 135;
		rect.width = 70;
		rect.height = 105;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 170;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 135;
		rect.width = 280;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 345;
		rect.width = 420;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 240;
		rect.width = 70;
		rect.height = 105;
		map.add(rect);
		// start
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 240;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		float baseTime = 1f;
		float baseTime2 = 1f;
		float temp = 28f;
		float r = 7f;
		
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 435 - 2 * r + temp * i;
			circle.y = 240 + 1.5f * r;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 435 - 2 * r + temp * i;
			circle.y = 240 - 1.5f * r;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + 2 * r - temp * i;
			circle.y = 240 + 1.5f * r ;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + 2 * r - temp * i;
			circle.y = 240 - 1.5f * r;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 400 + 1.5f * r;
			circle.y = 205 + 2 * r - temp * i;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 400 - 1.5f * r;
			circle.y = 275 - 2 * r + temp * i;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 400 - 1.5f * r;
			circle.y = 205 + 2 * r - temp * i;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 7 ; i++ )
		{
			circle = new Circle();
			circle.x = 400 + 1.5f * r;
			circle.y = 275 - 2 * r + temp * i;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 400, 240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(90)))
				.repeat(-1, baseTime2)
				.start(manager);
			blueCircles.add(circle);
		}
		
		
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7f;
		
		circle = new Circle();
		circle.x = 540 - 17.5f;
		circle.y = 100 + 17.5f;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 260 + 17.5f;
		circle.y = 380 - 17.5f;
		circle.radius = r;
		yellowCircles.add(circle);
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		
	}

}
