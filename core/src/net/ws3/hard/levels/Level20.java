package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level20 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 715;
		position.y = 135;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//finish
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 310;
		rect.width = 105;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 155;
		rect.y = 345;
		rect.width = 35;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 170;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 240;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 260;
		rect.y = 345;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 310;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 170;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 275;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 435;
		rect.y = 240;
		rect.width = 175;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 345;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 310;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 275;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 575;
		rect.y = 170;
		rect.width = 140;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 240;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 645;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 170;
		rect.width = 35;
		rect.height = 210;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 100;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.START);
		
	}

}
