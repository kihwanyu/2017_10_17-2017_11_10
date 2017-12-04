package part2.model.vo;
//추상메소드만 멤버로 가질 수 있는 추상클래스의 변형체이다.
//상수 필드만 멤버로 가질 수 있다.
//묵시적
public interface IProduct {
	/*public static final*/ String PRODUCT_NAME = "상품명";
	/*public*/ /*abstract*/ void abstIMethod();
	//인터페이스 안에 선언된 메소드는 모두 추상 메소드임
	//선언시 public abstract 생략할 수 있다.
	//후손이 오버라이딩 할 떄 반드시 public으로 한다.
	
	
}
