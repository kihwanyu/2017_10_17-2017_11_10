package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Shape;
import inherit.polymorphism.model.Rectangle;;
public class TestShape {

	public static void main(String[] args) {
		Object s;

		s = new Circle(15.5);
		System.out.println("원면적 : " + ((Circle) s).area());
		System.out.println("원둘레 : " + ((Circle) s).perimeter());
		/** 원면적 = PI * radius * radius;
		* 원둘레 = 2 * PI * radius;*/

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + ((Rectangle) s).area());
		System.out.println("사각형둘레 : " + ((Rectangle) s).perimeter());

		/** 면적 : 가로 * 세로
		* 둘레 : 2 * (가로 + 세로)*/
	}

}
