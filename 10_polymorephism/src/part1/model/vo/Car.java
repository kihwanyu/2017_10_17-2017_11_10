package part1.model.vo;

public abstract class Car {
	public Car() {
		
	}
	//추상메소드
	//반드시 상속 후 오버라이딩을 해야 함
	public abstract void move();
	public abstract void refuel();
	
	@Override
	public String toString(){
		return "Car 클래스의 toString() 메소드 실행됨...";
	}
}
