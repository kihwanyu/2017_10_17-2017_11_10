package part1.model.vo;

public abstract class Car {
	public Car() {
		
	}
	//�߻�޼ҵ�
	//�ݵ�� ��� �� �������̵��� �ؾ� ��
	public abstract void move();
	public abstract void refuel();
	
	@Override
	public String toString(){
		return "Car Ŭ������ toString() �޼ҵ� �����...";
	}
}
