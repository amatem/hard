package net.ws3.hard.levels;

import net.ws3.hard.BlueCircleAccessor;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level29 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85;
		position.y = 380;
		position.width = 25;
		position.height = 25;		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 345;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 310;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 120;
		rect.y = 65;
		rect.width = 560;
		rect.height = 245;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 310;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 345;
		rect.width = 105;
		rect.height = 70;
		map.add(rect); 
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float baseTime2 = 5f;
		float r = 7f;
		float temp = 17.5f;
		
		for (int i = 0 ; i < 7 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 155 + temp + 70 * i + 35 * j;
				circle.y = 310 - temp - 210 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.Y, baseTime)
					.target(100 - temp + 210 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 2 ; j++)
			{
				circle = new Circle();
				circle.x = 120 + temp + 525 * j;
				circle.y = 275 - temp - 70 * i + 35 * j;
				circle.radius = r;
				Tween.to(circle, BlueCircleAccessor.X, baseTime2)
					.target(645 + temp - 525 * j)
					.repeatYoyo(-1, 0f)
					.start(manager);
				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 645 + temp;
		circle.y = 65 + temp;
		circle.radius = r;
		Tween.to(circle, BlueCircleAccessor.X, baseTime2)
			.target(120 + temp)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float r = 7;
		float temp = 17.5f;
	
		circle = new Circle();
		circle.x = 120 + temp;
		circle.y = 65 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
		circle = new Circle();
		circle.x = 680 - temp;
		circle.y = 65 + temp;
		circle.radius = r;
		yellowCircles.add(circle);
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
