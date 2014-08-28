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

public class Level5 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 110;
		position.y = 385;
		position.width = 27;
		position.height = 27;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 380;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		//Checkpoint1
		rect = new Rectangle();
		rect.x = 635;
		rect.y = 380;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 145;
		rect.y = 380;
		rect.width = 490;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 600;
		rect.y = 100;
		rect.width = 35;
		rect.height = 315;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 145;
		rect.y = 65;
		rect.width = 490;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 145;
		rect.y = 100;
		rect.width = 35;
		rect.height = 245;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 310;
		rect.width = 490;
		rect.height = 35;
		map.add(rect);
		
		//Checkpoint2
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 310;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 530;
		rect.y = 170;
		rect.width = 35;
		rect.height = 175;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 215;
		rect.y = 135;
		rect.width = 350;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 215;
		rect.y = 170;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 215;
		rect.y = 240;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 285;
		rect.y = 205;
		rect.width = 210;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 460;
		rect.y = 205;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float temp = 70;
		
		for (int i = 0 ; i < 4 ; i++ )
		{
			circle = new Circle();
			circle.x = 390 + 52.5f + temp * i;
			circle.y = 240;
			circle.radius = 10;
			
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 4 ; i++ )
		{
			circle = new Circle();
			circle.x = 390 - 52.5f - temp * i;
			circle.y = 240;
			circle.radius = 10;
			
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++ )
		{
			circle = new Circle();
			circle.x = 390;
			circle.y = 240 - 52.5f - temp * i;
			circle.radius = 10;
			
			blueCircles.add(circle);
		}
		
		for (int i = 0 ; i < 3 ; i++ )
		{
			circle = new Circle();
			circle.x = 390;
			circle.y = 240 + 52.5f + temp * i;
			circle.radius = 10;
			
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
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
		
	}

}
