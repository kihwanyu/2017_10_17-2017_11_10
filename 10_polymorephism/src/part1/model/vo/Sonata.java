package part1.model.vo;

public class Sonata extends Car {

	@Override
	public void move() {
		System.out.println("SonataŬ���� move()�޼ҵ�");
	}

	@Override
	public void refuel() {
		System.out.println("SonataŬ���� refuel()�޼ҵ�");
	}
	@Override
	public String toString() {
		return "SonataŬ������ toString()�޼ҵ� ����...";
	}

}
