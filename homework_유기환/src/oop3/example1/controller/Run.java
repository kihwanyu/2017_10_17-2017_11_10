package oop3.example1.controller;

import oop3.example1.model.manager.Calculator;

public class Run {

	public static void main(String[] args) {
		Calculator cal = new Calculator();//�⺻ �����ڸ� ���� ��ü ����       
		cal.checkMethod();//�޼ҵ� ȣ�� Ȯ�ο� �޼ҵ� ȣ��       
		System.out.println("1���� 10������ �� : "+ cal.sum1to10());//�Լ��� ȣ���Ͽ� 1~10������ ���� ���� �޾� ���       
		cal.checkMaxNumber(10, 20);//10, 20 �� ���� ������ �Ű������� �Ͽ� ū �� ����ϴ� �޼ҵ� ȣ��       
		System.out.println("10�� 20�� ���� : " + cal.sumTwoNumber(10, 20));//10, 20 �� ���� ������ �Ű������� �Ͽ� �� ���� ���ϴ� �޼ҵ� ȣ�� �� ���ϰ� ���       
		System.out.println("10�� 5�� ���� : " + cal.minusTwoNumber(10, 5));//10, 5 �� ���� ������ �Ű������� �Ͽ� �� ���� ���� ���ϴ� �޼ҵ� ȣ�� �� ���ϰ� ���
		
		/*�޼ҵ� ȣ�� Ȯ�� 
		1���� 10������ �� : 55 
		�� �� �� ū ���� 20�̴�. 
		10�� 20�� ���� : 30 
		10�� 5�� ���� : 5*/
	}

}
