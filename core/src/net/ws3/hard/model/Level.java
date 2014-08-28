package net.ws3.hard.model;

import net.ws3.hard.model.HardModel.MapState;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public interface Level {
	void setStartPosition(Rectangle position);
	void setMap(Array<Rectangle> map);
	void setBlueCircles(Array<Circle> blueCircles, TweenManager manager);
	void setYellowCircles(Array<Circle> yellowCircles);
	void setMapState(Array<MapState> mapState);
}
