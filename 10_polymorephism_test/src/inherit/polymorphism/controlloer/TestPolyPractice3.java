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
		//5개의 객체를 무작위로 생성함(Circle, Rectangle, Triangle)	
		//for loop 문으로 각 객체의 면적과 둘레를 출력 처리함
		for(int i = 0; i < iarr.length; i++){
			if(iarr[i] instanceof Triangle) {
				System.out.println("iarr[" + i + "] 삼각형");
				System.out.println("삼각형의 넓이 : " + iarr[i].area());
				System.out.println("삼각형의 둘레 : " + iarr[i].perimeter());
				System.out.println("삼각형의 빗변 : " + ((Triangle) iarr[i]).hypotenuse());
			}
			else if(iarr[i] instanceof Circle) {
				System.out.println("iarr[" + i + "] 원");
				System.out.println("원의 넓이 : " + iarr[i].area());
				System.out.println("원의 둘레 : " + iarr[i].perimeter());
			}
			else if(iarr[i] instanceof Rectangle) {
				System.out.println("iarr[" + i + "] 사각형");
				System.out.println("사각형의 넓이 : " + iarr[i].area());
				System.out.println("사각형의 둘레 : " + iarr[i].perimeter());
			}
			System.out.println("----------------------------------------------");
		}
		//단, Triangle 객체는 빗변길이도 출력 처리함
	}

}
