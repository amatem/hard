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

public class Level25 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 120;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 345;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 65;
		rect.width = 140;
		rect.height = 280;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 190;
		rect.y = 65;
		rect.width = 490;
		rect.height = 140;
		map.add(rect);		
		//finish
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
		CircleWrapper circleWrapper;
		float baseTime = 1f;
		float temp = 17.5f;
		float baseTime2 = 5f;
		
		for (int i = 0 ; i < 5 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 120 - temp + 70 * j;
				circle.y = 345 - temp - 35 * i;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.X, baseTime)
					.target(85 - temp + 70 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 15 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 190 - temp + 35 * i;
				circle.y = 100 - temp + 70 * j;
				circle.radius = 7;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(135 - temp + 70 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		//middle point
		circle = new Circle();
		circle.x = 120;
		circle.y = 135;
		circle.radius = 7;		
		blueCircles.add(circle);
		
		//right part
		for (int i = 1 ; i <= 3 ; i++)
		{
			circle = new Circle();
			circle.x = 120 + 17.5f * i;
			circle.y = 135 - 17.5f * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,120,135);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime2)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
				.repeat(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		//left part
		for (int i = 1 ; i <= 3 ; i++)
		{
			circle = new Circle();
			circle.x = 120 - 17.5f * i;
			circle.y = 135 + 17.5f * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,120,135);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime2)
				.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
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
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
