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

public class Level6 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 105;
		position.y = 375;
		position.width = 27;
		position.height = 27;
		
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
		float temp = 27;
		float temp2 = 140;
		
		circle = new Circle();
		circle.x = 210;
		circle.y = 340;
		circle.radius = 10;

		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 350;
		circle.y = 340;
		circle.radius = 10;

		blueCircles.add(circle);
				
		circle = new Circle();
		circle.x = 490;
		circle.y = 340;
		circle.radius = 10;

		blueCircles.add(circle);		
		
		circle = new Circle();
		circle.x = 630;
		circle.y = 340;
		circle.radius = 10;
		
		blueCircles.add(circle);
		
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i - temp * k;
				circle.y = 340;
				circle.radius = 10;

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
				circle.radius = 10;

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
				circle.radius = 10;

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
				circle.radius = 10;

				blueCircles.add(circle);
			}
		}
		
		circle = new Circle();
		circle.x = 210;
		circle.y = 130;
		circle.radius = 10;

		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 350;
		circle.y = 130;
		circle.radius = 10;

		blueCircles.add(circle);
				
		circle = new Circle();
		circle.x = 490;
		circle.y = 130;
		circle.radius = 10;

		blueCircles.add(circle);		
		
		circle = new Circle();
		circle.x = 630;
		circle.y = 130;
		circle.radius = 10;
		
		blueCircles.add(circle);
		
		for (int i = 0; i < 4 ; i++)
		{
			for (int k = 1; k < 3; k++)
			{
				circle = new Circle();
				circle.x = 210 + temp2 * i - temp * k;
				circle.y = 130;
				circle.radius = 10;

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
				circle.radius = 10;

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
				circle.radius = 10;

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
				circle.radius = 10;

				blueCircles.add(circle);
			}
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
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
	}

}
