package net.ws3.hard.levels;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level23 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 242.5f;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;

		rect = new Rectangle();
		rect.x = 225;
		rect.y = 135;
		rect.width = 280;
		rect.height = 280;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 100;
		rect.width = 280;
		rect.height = 280;
		map.add(rect);
		
		//start
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 345;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		
		rect = new Rectangle();
		rect.x = 295;
		rect.y = 65;
		rect.width = 210;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 135;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 505;
		rect.y = 100;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		float baseTime = 5f;
		float r = 7;
		
		//middle point
		circle = new Circle();
		circle.x = 400;
		circle.y = 240;
		circle.radius = 7;		
		blueCircles.add(circle);
		
		//right part
		for (int i = 1 ; i <= 10 ; i++)
		{
			circle = new Circle();
			circle.x = 400 + 2.5f * r * i;
			circle.y = 240;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,400,240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			circle = new Circle();
			circle.x = 400 - 2.5f * r * i;
			circle.y = 240;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,400,240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			circle = new Circle();
			circle.x = 400;
			circle.y = 240 - 2.5f * r * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,400,240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			circle = new Circle();
			circle.x = 400;
			circle.y = 240 + 2.5f * r * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,400,240);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
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
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j  = 0; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 400 + temp + 2 * temp + 2 * temp * i;
				circle.y = 240 + temp - 2 * temp * j;
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j  = 0; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 400 - temp - 2 * temp * (i + 1);
				circle.y = 240 + temp - 2 * temp * j;
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j  = 0; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 400 + temp - 2 * temp * j;
				circle.y = 240 - temp  - 2 * temp * (i + 1);
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j  = 0; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 400 + temp - 2 * temp * j;
				circle.y = 240 + temp  + 2 * temp * (i + 1);
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 275 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 470 + temp;
		circle.y = 275 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 310 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 - temp;
		circle.y = 275 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 330 - temp;
		circle.y = 275 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 - temp;
		circle.y = 310 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 470 + temp;
		circle.y = 170 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 435 + temp;
		circle.y = 135 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 - temp;
		circle.y = 170 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 330 - temp;
		circle.y = 170 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 365 - temp;
		circle.y = 135 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
