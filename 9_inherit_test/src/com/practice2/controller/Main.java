package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Circle �迭 �ʱ�ȭ : 3��
		Rectangle �迭 �ʱ�ȭ : 3��
		���� draw() ��� ó��	
		*/
		
		Circle c1 = new Circle(1,2,5);
		Circle c2 = new Circle(2,3,10);
		Circle c3 = new Circle(4,5,15);
		
		Rectangle r1 = new Rectangle(1,2,5,10);
		Rectangle r2 = new Rectangle(6,5,4,10);
		Rectangle r3 = new Rectangle(6,10,1,10);
		
		c1.draw();
		c2.draw();
		c3.draw();
		
		r1.draw();
		r2.draw();
		r3.draw();
		
		/*
		1. Point �� ��ü �迭 ����, ���� : 5��
		2. �� index���� Circle, Rectangle ��ü ����, �ʱ�ȭ��(���Ǵ��)
		3. for �� ��� : draw() �޼ҵ� ������
		*/
		
		Point[] p = new Point[5];
		
		p[0] = new Point(1, 2);
		p[1] = new Point(3, 4);
		p[2] = new Point(5, 6);
		p[3] = new Point(7, 8);
		p[4] = new Point(9, 10);
		
		Circle[] pc = new Circle[5];
		Rectangle[] pr = new Rectangle[5];
		
		
		}

}
