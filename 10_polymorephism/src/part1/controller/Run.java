package part1.controller;

import part1.model.vo.Car;
import part1.model.vo.Granger;
import part1.model.vo.Sonata;
import part1.model.vo.Avante;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻�޼ҵ�� ��ü�� ������ ���Ѵ�.
		//Car c = new Car(); // �����߻�
		
		//������ �׽�Ʈ
		//�ļ�Ŭ������ �θ� Ŭ���� Ÿ������ �ٷ�� ���
		//�θ� Ŭ���� Ÿ���� �ļ� Ŭ������ ��ü�� �ٷ� �� �ִ�.
		
		Car c1 = new Avante();
		Car c2 = new Sonata();
		Car c3 = new Granger();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//�ļ� Ŭ������ �޼ҵ嵵 ȣ�� �����ϴ�.
		
		c1.move();
		c2.move();
		c3.move();
		
		//�ļ� Ŭ������ �η� Ŭ������ ��ü �ּҸ� ���� �� ����.
		
		/*Avante a = new Car();
		Sonata b = new Car();
		Granger c = new Car();*/
		
		c1.refuel();
		c2.refuel();
		c3.refuel();
		
	}

}
