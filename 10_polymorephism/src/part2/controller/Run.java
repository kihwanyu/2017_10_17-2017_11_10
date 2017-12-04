package part2.controller;

import part2.model.vo.Book;
import part2.model.vo.Galluxy;
import part2.model.vo.Product;
import part2.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args){
		//다형성(Polymorphism)
		//상속관계에 있는 클래스일 때 부모클래스형 래퍼런스가 
		//후손 객체의 주소를 기록 저장할 수 있다.
		/*Product p1 = new Product();*/
		Product p1 = new SmartPhone();
		Product p2 = new Galluxy();
		Product p3 = new Book();
		
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);*/
		
		//Object클래스는 모든 클래스의 조상이다.
		//부모 클래스 타입으로 (Object) 자식 객체의 주소를 받을 수 있다.
		
		Object obj1 = new SmartPhone();
		
		//System.out.println(obj1);
		
		//후손클래스 타입으로 부모 객체의 주소를 받을 수 없다.
		/*Galluxy g = new SmartPhone();*/
	
		print(new Galluxy());
		
	}
	public static void print(Object obj){
		
		//부모 레퍼런스가 후손 객체의 주소를 받는 과정에서 
		//자동으로 클래스 형변환이 발생함(up-casting)
		// => 부모 클래스가 가진 멤버만 참조할 수 있음
		// => 후손것은 참조 할 수 없음
		System.out.println(obj);
		// = > 만약 부모 레퍼런스로 후손 객체가 가진 멤버를 참조할 경우
		// = > 직접 해당 클래스형으로 레퍼런스를 형변환 해야함. (down-casting)
		if(obj instanceof Galluxy){
			((Galluxy) obj).printGalluxy();
		}
		else if(obj instanceof SmartPhone){
			((SmartPhone) obj).printSmartPhone();
		}
		else if(obj instanceof Book){
			((Book) obj).printBook();
		}
		else if(obj instanceof Product){
			((Product) obj).printProduct();
		}		
	}
}
