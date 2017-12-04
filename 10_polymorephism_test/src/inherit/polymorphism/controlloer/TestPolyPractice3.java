package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		IShape[] iarr = new IShape[5];

		iarr[0] = new Rectangle(5, 10);
		iarr[1] = new Circle(10);
		iarr[2] = new Triangle(10, 12);
		iarr[3] = new Rectangle(10, 15);
		iarr[4] = new Circle(20);
		//5���� ��ü�� �������� ������(Circle, Rectangle, Triangle)	
		//for loop ������ �� ��ü�� ������ �ѷ��� ��� ó����
		for(int i = 0; i < iarr.length; i++){
			if(iarr[i] instanceof Triangle) {
				System.out.println("iarr[" + i + "] �ﰢ��");
				System.out.println("�ﰢ���� ���� : " + iarr[i].area());
				System.out.println("�ﰢ���� �ѷ� : " + iarr[i].perimeter());
				System.out.println("�ﰢ���� ���� : " + ((Triangle) iarr[i]).hypotenuse());
			}
			else if(iarr[i] instanceof Circle) {
				System.out.println("iarr[" + i + "] ��");
				System.out.println("���� ���� : " + iarr[i].area());
				System.out.println("���� �ѷ� : " + iarr[i].perimeter());
			}
			else if(iarr[i] instanceof Rectangle) {
				System.out.println("iarr[" + i + "] �簢��");
				System.out.println("�簢���� ���� : " + iarr[i].area());
				System.out.println("�簢���� �ѷ� : " + iarr[i].perimeter());
			}
			System.out.println("----------------------------------------------");
		}
		//��, Triangle ��ü�� �������̵� ��� ó����
	}

}
