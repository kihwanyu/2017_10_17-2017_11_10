package oop3.example1.model.manager;

public class Calculator {
	public Calculator() {
		
	}
	public void checkMethod(){
		System.out.println("�޼ҵ� ȣ�� Ȯ��");
	}
	public int sum1to10(){
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum+=i;
		}
		return sum;
	}
	public void checkMaxNumber(int a, int b){
		if(a > b){
			System.out.println("�� �� �� ū ���� " + a + " �̴�.");
		} else {
			System.out.println("�� �� �� ū ���� " + b + " �̴�.");
		}
	}
	public int sumTwoNumber(int a, int b){
		return a+b;
	}
	public int minusTwoNumber(int a, int b){
		return a-b;
	}
}
