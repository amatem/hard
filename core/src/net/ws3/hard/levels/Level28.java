package net.ws3.hard.levels;

import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Level28 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 120;
		position.y = 65;
		position.width = 25;
		position.height = 25;
		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//start
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 30;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 85;
		rect.y = 380;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 30;
		rect.width = 525;
		rect.height = 175;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 135;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);
		//checkpoint
		rect = new Rectangle();
		rect.x = 645;
		rect.y = 205;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 680;
		rect.y = 275;
		rect.width = 35;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 155;
		rect.y = 275;
		rect.width = 525;
		rect.height = 175;
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
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.FINISH);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.PLAIN);	
	}

}
