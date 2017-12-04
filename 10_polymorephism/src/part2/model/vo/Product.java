package part2.model.vo;

// 추상메소드를 멤버로 가진 경우에는  class키워드 앞에 
// 반드시 abstract 표시해야함
// 추상클래스 : 미완성된 클래스를 말하며,
//          미완성된 메소드는 반드시 상속을 받은 후손이 완성해야 한다.
// 추상메소드는  객체를 생성하지 못한다.

public abstract class Product {
	public Product() {
		
	}
	//추상 메소드
	//메소드의 헤드만 있고 바디는 없는 메소드
	public abstract void abstMethod();
	public void printProduct(){
		System.out.println("Product클래스의 printProduct() 메소드입니다.");
	}
	@Override
	public String toString(){
		return "Product클래스의 toString() 메소드립니다.";
		
	}
}
