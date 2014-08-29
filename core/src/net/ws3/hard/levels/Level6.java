package net.ws3.hard.levels;

import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level6 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 105;
		position.y = 375;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 70;
		rect.y = 340;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 140;
		rect.y = 270;
		rect.width = 560;
		rect.height = 140;
		map.add(rect);
		
		//Checkpoint
		rect = new Rectangle();
		rect.x = 560;
		rect.y = 200;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 140;
		rect.y = 60;
		rect.width = 560;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 70;
		rect.y = 60;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		float temp = 30;
		float temp2 = 140;
		float baseTime = 5f;
		
		circle = new Circle();
		circle.x = 210;
		circle.y = 340;
		circle.radius = 7;

		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 350;
		circle.y = 340;
		circle.radius = 7;

		blueCircles.add(circle);
				
		circle = new Circle();
		circle.x = 490;
		circle.y = 340;
		circle.radius = 7;

		blueCircles.add(circle);		
		
		circle = new Circle();
		circle.x = 630;
		circle.y = 340;
		circle.radius = 7;
		
		blueCircles.add(circle);
		
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i - temp * k;
				circle.y = 340;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 340);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i + temp * k;
				circle.y = 340;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 340);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i ;
				circle.y = 340 + temp * k;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 340);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i ;
				circle.y = 340 - temp * k;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 340);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 210;
		circle.y = 130;
		circle.radius = 7;
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 350;
		circle.y = 130;
		circle.radius = 7;
		blueCircles.add(circle);
				
		circle = new Circle();
		circle.x = 490;
		circle.y = 130;
		circle.radius = 7;
		blueCircles.add(circle);		
		
		circle = new Circle();
		circle.x = 630;
		circle.y = 130;
		circle.radius = 7;		
		blueCircles.add(circle);
		
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i - temp * k;
				circle.y = 130;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 130);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i + temp * k;
				circle.y = 130;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 130);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i ;
				circle.y = 130 + temp * k;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 130);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i ;
				circle.y = 130 - temp * k;
				circle.radius = 7;
				circleWrapper = new CircleWrapper(circle, 210 + temp2 * i, 130);
				Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
					.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
					.repeat(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		Float temp = 17.5f;
		
		circle = new Circle();
		circle.x = 140 + temp;
		circle.y = 200 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 280 + temp;
		circle.y = 200 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 420 + temp;
		circle.y = 200 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 560 + temp;
		circle.y = 200 - temp;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
	}

}
