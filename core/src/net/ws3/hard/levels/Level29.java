package net.ws3.hard.levels;

import net.ws3.hard.model.HardModel.MapState;
import net.ws3.hard.model.HardModel;
import net.ws3.hard.model.Level;
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
		// TODO Auto-generated method stub
		
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
