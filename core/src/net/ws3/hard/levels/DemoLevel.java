package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
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

public class DemoLevel implements Level{
	
	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 75 + 35;
		position.y = 115 + 125;
		position.width = 27;
		position.height = 27;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 115;
		rect.width = 105;
		rect.height = 250;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 800 - 75 - 105;
		rect.y = 115;
		rect.width = 105;
		rect.height = 250;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 75 + 105;
		rect.y = 115;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 800 - 75 - 105 - 70;
		rect.y = 115 + 250 - 35;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 75 + 105 + 35;
		rect.y = 115 + 35;
		rect.width = 370;
		rect.height = 215 - 35;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		CircleWrapper circleWrapper;
		
		circle = new Circle();
		circle.x = 225;
		circle.y = 310;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.X, 1.3f)
			.target(570)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 225;
		circle.y = 220;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.X, 1.3f)
			.target(570)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 570;
		circle.y = 270;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.X, 1.3f)
			.target(225)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 570;
		circle.y = 170;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.X, 1.3f)
			.target(225)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 300;
		circle.y = 240;
		circle.radius = 10;
		circleWrapper = new CircleWrapper(circle, 400, 240);
		Tween.to(circleWrapper, CircleWrapperAccessor.R, 1f)
			.target((float)(circleWrapper.getAngle() + Math.toRadians(360)))
			.repeat(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 500;
		circle.y = 240;
		circle.radius = 10;
		yellowCircles.add(circle);
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
	}
}
