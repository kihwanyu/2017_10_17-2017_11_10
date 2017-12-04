package part1.model.vo;

public class Avante extends Car {

	@Override
	public void move() {
		System.out.println("Avante클래스 move()메소드");
	}

	@Override
	public void refuel() {
		System.out.println("Avante클래스 refuel()메소드");
	}
	@Override
	public String toString() {
		return "Avante클래스의 toString()메소드 실행...";
	}
}
