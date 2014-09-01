package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;

public class Level27 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 85;
		position.y = 310;
		position.width = 25;
		position.height = 25;		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		//Checkpoint
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 135;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);
		//start
		rect = new Rectangle();
		rect.x = 50;
		rect.y = 275;
		rect.width = 70;
		rect.height = 70;
		map.add(rect);

		rect = new Rectangle();
		rect.x = 120;
		rect.y = 65;
		rect.width = 560;
		rect.height = 350;
		map.add(rect);
		//finish
		rect = new Rectangle();
		rect.x = 680;
		rect.y = 205;
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
		mapState.add(HardModel.MapState.CHECKPOINT);
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);		
	}

}
