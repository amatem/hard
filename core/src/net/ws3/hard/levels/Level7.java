package net.ws3.hard.levels;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level7 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 110;
		position.y = 227.5f;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 205;
		rect.width = 120;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 195;
		rect.y = 100;
		rect.width = 420;
		rect.height = 280;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 615;
		rect.y = 205;
		rect.width = 120;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float temp2 = 70f;
		float baseTime = 1f;
		
		for (int i = 0 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 195 + temp + temp2 * i;
			circle.y = 107;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(373)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 6 ; i++)
		{
			circle = new Circle();
			circle.x = 195 + temp + temp2 / 2 + temp2 * i;
			circle.y = 373;
			circle.radius = 7;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(107)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);
		}		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 195 + 17.5f;
		circle.y = 380 - 17.5f;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 195 + 17.5f;
		circle.y = 100 + 17.5f;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 615 - 17.5f;
		circle.y = 380 - 17.5f;
		circle.radius = 10;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 615 - 17.5f;
		circle.y = 100 + 17.5f;
		circle.radius = 10;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
