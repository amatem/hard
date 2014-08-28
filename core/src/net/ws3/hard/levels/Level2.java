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

public class Level2 implements Level {

	@Override
	public void setStartPosition(Rectangle position) {
		position.x = 100;
		position.y = 220;
		position.width = 27;
		position.height = 27;
	}

	@Override
	public void setMap(Array<Rectangle> map) {
		Rectangle rect;
		
		rect = new Rectangle();
		rect.x = 75;
		rect.y = 190;
		rect.width = 110;
		rect.height = 70;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 185;
		rect.y = 115;
		rect.width = 430;
		rect.height = 215;
		map.add(rect);
		
		rect = new Rectangle();
		rect.x = 615;
		rect.y = 190;
		rect.width = 110;
		rect.height = 70;
		map.add(rect);
		
		
	}

	@Override
	public void setBlueCircles(Array<Circle> blueCircles, TweenManager manager) {
		Circle circle;
		float bot,top;
		bot = 130;
		top = 320;
		
		circle = new Circle();
		circle.x = 205;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top,55)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 240;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 275;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 310;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 345;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 380;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 415;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 450;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 485;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 520;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 555;
		circle.y = bot;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(top)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);
		
		circle = new Circle();
		circle.x = 590;
		circle.y = top;
		circle.radius = 10;
		Tween.to(circle, BlueCircleAccessor.Y, 1.3f)
			.target(bot)
			.repeatYoyo(-1, 0f)
			.start(manager);
		blueCircles.add(circle);	
		
	}

	@Override
	public void setYellowCircles(Array<Circle> yellowCircles) {
		Circle circle;
		
		circle = new Circle();
		circle.x = 403;
		circle.y = 223;
		circle.radius = 10;
		yellowCircles.add(circle);
	}

	@Override
	public void setMapState(Array<MapState> mapState) {
		mapState.add(HardModel.MapState.START);
		mapState.add(HardModel.MapState.PLAIN);
		mapState.add(HardModel.MapState.FINISH);
		
	}

}
