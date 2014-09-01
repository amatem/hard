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

public class Level18 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 190;
		position.y = 240;
		position.width = 25;
		position.height = 25;	
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 170;
		rect.width = 350;
		rect.height = 140;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 17.5f;
		float baseTime = 1f;
		float r = 7f;
		
		for (int i = 0; i < 5 ; i++)
		{	
			circle = new Circle();
			circle.x = 225 + temp + 70 * i;
			circle.y = 275;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(205)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);	
		}
		
		for (int i = 0; i < 5 ; i++)
		{	
			circle = new Circle();
			circle.x = 260 + temp + 70 * i;
			circle.y = 205;
			circle.radius = r;
			Tween.to(circle, BlueCircleAccessor.Y, baseTime)
				.target(275)
				.repeatYoyo(-1, 0f)
				.start(manager);
			blueCircles.add(circle);	
		}
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		float temp = 17.5f;
		float r = 7f;
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 10 ; j++)
			{
				circle = new Circle();
				circle.x = 225 + temp + 35 * j;
				circle.y = 275 + temp - 35 * i;
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9 ; j++)
			{
				circle = new Circle();
				circle.x = 260 + 35 * j;
				circle.y = 275 - 35 * i;
				circle.radius = r;
				yellowCircles.add(circle);
			}
		}		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);		
	}

}
