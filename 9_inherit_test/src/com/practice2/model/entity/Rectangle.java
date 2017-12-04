package com.practice2.model.entity;

public class Rectangle extends Point {
	protected int width;
	protected int height;
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		double area = width * height;
		double paramter = 2 * width * height;
		
		super.draw();
		System.out.printf("가로 : %d 세로 : %d 사각형의 면적 : %3.2f 사각형의 둘레 : %3.2f\n",width,height,area,paramter);
	}
	
	
}
