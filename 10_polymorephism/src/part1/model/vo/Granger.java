package part1.model.vo;

public class Granger extends Car{

	@Override
	public void move() {
		System.out.println("GrangerŬ���� move()�޼ҵ�");
	}

	@Override
	public void refuel() {
		System.out.println("GrangerŬ���� refuel()�޼ҵ�");
	}
	@Override
	public String toString() {
		return "GrangerŬ������ toString()�޼ҵ� ����...";
	}
	
}
