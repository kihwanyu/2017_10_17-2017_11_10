package oop3.example2.model.dao;

import java.util.Scanner;

public class TriangleManager {
Scanner sc = new Scanner(System.in);
	
	public void calcParameter(double height, double width){
		double result = Math.sqrt(height+height+width+width)+height+width;
		System.out.printf("�ﰢ���� �ѷ��� %.2f �Դϴ�.\n",result);
		//���̿� �ʺ� �Է¹޾� Math.sqrt(����+����+�ʺ�+�ʺ�)�� ������ ���̸� ���ϰ�, �ѷ��� ���Ͽ� �Ҽ� 2° �ڸ����� ��� ��, �ѷ� = ���� + �ʺ� + ����
	}
	public double calcArea(double height, double width){
		double result = ( width * height )/ 2;
		//���̿� �ʺ� ���� �޾� ���� ���Ͽ� ���� �� ���� ��, ���� = (�غ� * ����) / 2
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
