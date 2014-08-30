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

public class Level12 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 645;
		position.y = 170;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 100;
		rect.width = 630;
		rect.height = 280;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//Checkpoint
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 275;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 610;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float baseTime = 1f;
		float temp = 17.5f;
		float r = 7;
		
		for (int i = 0; i < 34 ; i++)
		{
			circle = new Circle();
			circle.x = 120 - r + 2.5f * r * i;
			circle.y = 135 - r;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 34 ; i++)
		{
			circle = new Circle();
			circle.x = 120 - r + 2.5f * r * i;
			circle.y = 345 + r;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 1; i <= 12 ; i++)
		{
			circle = new Circle();
			circle.x = 120 - r ;
			circle.y = 135 - r + 2.5f * r * i;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 1; i <= 12 ; i++)
		{
			circle = new Circle();
			circle.x = 680 + 1.5f * r ;
			circle.y = 135 - r + 2.5f * r * i;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 13; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				circle = new Circle();
				circle.x = 680 - r - 2.5f * r * i;
				circle.y = 205 + r + 2.5f * r * j;
				circle.radius = r;
				blueCircles.add(circle);
			}
		}
		
		for (int i = 0; i < 7; i++)
		{
			circle = new Circle();
			circle.x = 610 - r - 2.5f * r * i;
			circle.y = 205 - 1.5f * r;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2; i++)
		{
			circle = new Circle();
			circle.x = 575 - r - 2.5f * r * i;
			circle.y = 205 - 4f * r;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 8; i++)
		{
			circle = new Circle();
			circle.x = 505 - r - 2.5f * r * i;
			circle.y = 135 + 1.5f * r;
			circle.radius = r;
			blueCircles.add(circle);
		}
		
		for (int i = 0; i < 2; i++)
		{
			circle = new Circle();
			circle.x = 470 - 3.5f * r - 2.5f * r * i;
			circle.y = 135 + 4f * r;
			circle.radius = r;
			blueCircles.add(circle);
		}
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.START);
		
	}

}
