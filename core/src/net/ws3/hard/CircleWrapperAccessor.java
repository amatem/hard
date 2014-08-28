package net.ws3.hard;

import net.ws3.hard.model.CircleWrapper;
import aurelienribon.tweenengine.TweenAccessor;

public class CircleWrapperAccessor implements TweenAccessor<CircleWrapper>{
	public static final int R = 1;

	@Override
	public int getValues(CircleWrapper circle, int tweenType, float[] returnValues) {
		switch(tweenType){
			case R:
				returnValues[0] = (float) circle.getAngle();
				return 1;
			default:
				return -1;
		}
	}

	@Override
	public void setValues(CircleWrapper circle, int tweenType, float[] newValues) {
		switch(tweenType){
			case R:
				circle.update((double)newValues[0]);
				break;
			default:
				break;
		}
	}

}
