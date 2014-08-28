package net.ws3.hard;

import aurelienribon.tweenengine.TweenAccessor;

import com.badlogic.gdx.math.Circle;

public class BlueCircleAccessor implements TweenAccessor<Circle>{
	public static final int X = 1;
	public static final int Y = 2;
	public static final int XY = 3;

	@Override
	public int getValues(Circle circle, int tweenType, float[] returnValues) {
		switch(tweenType){
			case X:
				returnValues[0] = circle.x;
				return 1;
			case Y:
				returnValues[0] = circle.y;
				return 1;
			case XY:
				returnValues[0] = circle.x;
				returnValues[1] = circle.y;
				return 2;
			default:
				return -1;
		}
	}

	@Override
	public void setValues(Circle circle, int tweenType, float[] newValues) {
		switch(tweenType){
			case X:
				circle.x = newValues[0];
				break;
			case Y:
				circle.y = newValues[0];
				break;
			case XY:
				circle.x = newValues[0];
				circle.y = newValues[1];
				break;
			default:
				break;
		}
	}
	

}
