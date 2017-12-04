package oop3.example2.model.dao;

import java.util.Scanner;

public class SquareManager {
	Scanner sc = new Scanner(System.in);
	
	public void calcParameter(double height, double width){
		double result = (width + height) * 2;
		System.out.printf("�簢���� �ѷ��� %.2f �Դϴ�.\n",result);
		//���̿� �ʺ� �Է¹޾� �ѷ��� ���Ͽ� �Ҽ� 2° �ڸ����� ��� ��, �ѷ� = (�ʺ� + ����) * 2
	}
	public double calcArea(double height, double width){
		double result = width * height;
		//���̿� �ʺ� ���� �޾� ���� ���Ͽ� ���� �� ���� ��, ���� = �غ� * ����
		return result;
	}
	public void printShape(Shape s){
		if(s.getType()==3){
			System.out.println("���� Ÿ�� : �ﰢ��");
		} else {
			System.out.println("���� Ÿ�� : �簢��");
		}
		System.out.println("���� : " + s.getHeight());
		System.out.println("�ʺ� : " + s.getWidth());
		System.out.println("���� : " + s.getColor());
		//getter�� �̿��� ��� �ʵ��� �� ����ϴ� �޼ҵ�
	}
	public String paintColor(Shape s){
		String color;
		System.out.print("� ������ ������ ĥ�ұ��? = ");
		color = sc.nextLine();
		s.setColor(color);
		return "�����Ͻ� ������ " + color + " �� ��ĥ�մϴ�.";
	}
}
