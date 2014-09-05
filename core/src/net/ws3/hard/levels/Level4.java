package net.ws3.hard.levels;

import net.ws3.hard.CircleWrapperAccessor;
import net.ws3.hard.model.CircleWrapper;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;
import aurelienribon.tweenengine.equations.Linear;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level4 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 412.5f;
		position.y = 380;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 165;
		rect.y = 155;
		rect.width = 120;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 285;
		rect.y = 120;
		rect.width = 280;
		rect.height = 140;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 320;
		rect.y = 85;
		rect.width = 210;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 355;
		rect.y = 50;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 320;
		rect.y = 260;
		rect.width = 210;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 355;
		rect.y = 295;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 390;
		rect.y = 330;
		rect.width = 70;
		rect.height = 120;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		float baseTime = 2.4f;
		
		//middle point
		circle = new Circle();
		circle.x = 425;
		circle.y = 190;
		circle.radius = 7;		
		blueCircles.add(circle);
		
		//right part
		for (int i = 1 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 425 + 25 * i;
			circle.y = 190;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,425,190);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeat(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}		
		//left part
		for (int i = 1 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 425 - 25 * i;
			circle.y = 190;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,425,190);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeat(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}		
		//top part
		for (int i = 1 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 425;
			circle.y = 190 + 25 * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,425,190);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeat(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		//bottom part
		for (int i = 1 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 425;
			circle.y = 190 - 25 * i;
			circle.radius = 7;
			circleWrapper = new CircleWrapper(circle,425,190);
			Tween.to(circleWrapper, CircleWrapperAccessor.R, baseTime)
				.target((float)(circleWrapper.getAngle() - Math.toRadians(360)))
				.ease(Linear.INOUT)
				.repeat(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 425;
		circle.y = 85;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 530;
		circle.y = 190;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		
	}

}
