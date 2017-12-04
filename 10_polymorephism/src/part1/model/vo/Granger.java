package part1.model.vo;

public class Granger extends Car{

	@Override
	public void move() {
		System.out.println("Granger클래스 move()메소드");
	}

	@Override
	public void refuel() {
		System.out.println("Granger클래스 refuel()메소드");
	}
	@Override
	public String toString() {
		return "Granger클래스의 toString()메소드 실행...";
	}
	
}
