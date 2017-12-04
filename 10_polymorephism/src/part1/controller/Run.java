package part1.controller;

import part1.model.vo.Car;
import part1.model.vo.Granger;
import part1.model.vo.Sonata;
import part1.model.vo.Avante;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상메소드는 객체를 만들지 못한다.
		//Car c = new Car(); // 에러발생
		
		//다형성 테스트
		//후손클래스를 부모 클래스 타입으로 다루는 기술
		//부모 클래스 타입은 후손 클래스의 객체를 다룰 수 있다.
		
		Car c1 = new Avante();
		Car c2 = new Sonata();
		Car c3 = new Granger();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//후손 클래스의 메소드도 호출 가능하다.
		
		c1.move();
		c2.move();
		c3.move();
		
		//후손 클래스는 부로 클래스의 객체 주소를 받을 수 없다.
		
		/*Avante a = new Car();
		Sonata b = new Car();
		Granger c = new Car();*/
		
		c1.refuel();
		c2.refuel();
		c3.refuel();
		
	}

}
