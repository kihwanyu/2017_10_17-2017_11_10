package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Shape;
import inherit.polymorphism.model.Rectangle;;
public class TestShape {

	public static void main(String[] args) {
		Object s;

		s = new Circle(15.5);
		System.out.println("������ : " + ((Circle) s).area());
		System.out.println("���ѷ� : " + ((Circle) s).perimeter());
		/** ������ = PI * radius * radius;
		* ���ѷ� = 2 * PI * radius;*/

		s = new Rectangle(34.5, 42.7);
		System.out.println("�簢������ : " + ((Rectangle) s).area());
		System.out.println("�簢���ѷ� : " + ((Rectangle) s).perimeter());

		/** ���� : ���� * ����
		* �ѷ� : 2 * (���� + ����)*/
	}

}
