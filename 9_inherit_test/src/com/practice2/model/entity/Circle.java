package com.practice2.model.entity;


public class Circle extends Point {
	protected int radius;
	
	public Circle() {
		super();
	}
	public Circle(int x, int y,int radius) {
		super(x,y);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		double area = java.lang.Math.PI * radius * radius;
		double paramter = 2 * java.lang.Math.PI * radius;
		
		super.draw();
		System.out.printf("반지름 : %d 원의 면적 : %3.2f 원의 둘레 : %3.2f\n",radius,area,paramter);
	}

	
	
	
}
