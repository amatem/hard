package net.ws3.hard.model;

import com.badlogic.gdx.math.Circle;

public class CircleWrapper {
	private Circle circle;
	private float x, y;
	private double angle;
	private double r;
	
	public CircleWrapper(Circle circle, float x, float y){
		this.circle = circle;
		this.x = x;
		this.y = y;
		
		r = Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y));
		double X = Math.sqrt((circle.x - x + r) * (circle.x - x + r) + (circle.y - y) * (circle.y - y));
		angle = Math.acos(1 - (X * X) / (r * r + r * r));
		
		if(circle.y < y)
			angle = Math.toRadians(360) - angle;
	}
	
	public Circle getCircle(){
		return circle;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
	
	public double getAngle(){
		return angle;
	}
	
	public void update(double angle){
		this.angle = angle;
		
		circle.x = (float)(x + r * Math.sin(angle));
		circle.y = (float)(y - r * Math.cos(angle));
	}
}
