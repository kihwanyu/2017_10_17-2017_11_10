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
		System.out.printf("���� : %d ���� : %d �簢���� ���� : %3.2f �簢���� �ѷ� : %3.2f\n",width,height,area,paramter);
	}
	
	
}
