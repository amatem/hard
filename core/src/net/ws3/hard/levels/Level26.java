package net.ws3.hard.levels;

import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.Level;

public class Level26 implements Level{

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 120;
		position.y = 380;
		position.width = 25;
		position.height = 25;

		
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

}
