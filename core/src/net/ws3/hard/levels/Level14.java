package net.ws3.hard.levels;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level14 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 137.5f;
		position.y = 187.5f;
		position.width = 25;
		position.height = 25;		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 135;
		rect.width = 105;
		rect.height = 105;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 190;
		rect.y = 135;
		rect.width = 525;
		rect.height = 105;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 610;
		rect.y = 240;
		rect.width = 105;
		rect.height = 105;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		float baseTime = 2.5f;
		float temp = 17.5f;
		float r = 7f;
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 225 + temp;
			circle.y = 170 + temp + i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 225 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 225 + temp;
			circle.y = 170 + temp - i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 225 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 225 + temp - i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 225 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 225 + temp + i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 225 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + temp;
			circle.y = 170 + temp + i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 365 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + temp;
			circle.y = 170 + temp - i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 365 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + temp - i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 365 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 365 + temp + i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 365 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 505 + temp;
			circle.y = 170 + temp + i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 505 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 505 + temp;
			circle.y = 170 + temp - i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 505 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 505 + temp - i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 505 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 505 + temp + i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 505 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 645 + temp;
			circle.y = 170 + temp + i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 645 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 645 + temp;
			circle.y = 170 + temp - i * (2 * r + temp / 3);
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 645 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 645 + temp - i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 645 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 2 ; i++ )
		{
			circle = new Circle();
			circle.x = 645 + temp + i * (2 * r + temp / 3);
			circle.y = 170 + temp;
			circle.radius = r;
			circleWrapper = new CircleWrapper(circle, 645 + temp, 170 + temp);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager); 
			blueCircles.add(circle);
		}
		
		circle = new Circle();
		circle.x = 225 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 505 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 645 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 295 + temp;
		circle.y = 135 + r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(240 - 3 * r - temp /3)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 295 + temp;
		circle.y = 135 + 3 * r + temp / 3;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(240 - r)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 575 + temp;
		circle.y = 135 + r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(240 - 3 * r - temp /3)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 575 + temp;
		circle.y = 135 + 3 * r + temp / 3;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(240 - r)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 240 - r;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(135 + 3 * r + temp / 3)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 240 - 3 * r - temp /3;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.Y, baseTime)
			.target(135 + r)
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
		mapState.add(HardModel.MapState.FINISH);
		
		
	}

}
