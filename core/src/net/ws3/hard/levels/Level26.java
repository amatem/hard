package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level26 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 365;
		position.y = 100;
		position.width = 25;
		position.height = 25;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 65;
		rect.width = 700;
		rect.height = 105;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 295;
		rect.y = 170;
		rect.width = 210;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 260;
		rect.y = 205;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 225;
		rect.y = 240;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 190;
		rect.y = 275;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 310;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 345;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 120;
		rect.y = 380;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 610;
		rect.y = 380;
		rect.width = 70;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 575;
		rect.y = 345;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 540;
		rect.y = 310;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 505;
		rect.y = 275;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 470;
		rect.y = 240;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 435;
		rect.y = 205;
		rect.width = 105;
		rect.height = 35;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 330;
		rect.y = 65;
		rect.width = 140;
		rect.height = 70;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 365;
		rect.y = 135;
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
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
