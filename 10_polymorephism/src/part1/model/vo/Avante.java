package part1.model.vo;

public class Avante extends Car {

	@Override
	public void move() {
		System.out.println("AvanteŬ���� move()�޼ҵ�");
	}

	@Override
	public void refuel() {
		System.out.println("AvanteŬ���� refuel()�޼ҵ�");
	}
	@Override
	public String toString() {
		return "AvanteŬ������ toString()�޼ҵ� ����...";
	}
}
