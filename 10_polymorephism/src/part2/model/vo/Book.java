package part2.model.vo;

public class Book extends Product implements IProduct{

	@Override
	public void abstMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstIMethod() {
		// TODO Auto-generated method stub
		
	}
	public void printBook(){
		System.out.println("Book클래스의 printBook() 실행...");
	}
	@Override
	public String toString(){
		return "Book클래스의 toString() 메소드 입니다.";
		
	}
	// 인터페이스 , 추상메소드 상속시 반드시 모든 추상메소드를 오버라이딩 해야한다.
}
