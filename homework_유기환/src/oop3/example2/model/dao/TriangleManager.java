package oop3.example2.model.dao;

import java.util.Scanner;

public class TriangleManager {
Scanner sc = new Scanner(System.in);
	
	public void calcParameter(double height, double width){
		double result = Math.sqrt(height+height+width+width)+height+width;
		System.out.printf("삼각형의 둘레는 %.2f 입니다.\n",result);
		//높이와 너비를 입력받아 Math.sqrt(높이+높이+너비+너비)로 빗변의 길이를 구하고, 둘레를 구하여 소수 2째 자리까지 출력 단, 둘레 = 빗변 + 너비 + 높이
	}
	public double calcArea(double height, double width){
		double result = ( width * height )/ 2;
		//높이와 너비를 전달 받아 면적 구하여 계산된 값 리턴 단, 면적 = (밑변 * 높이) / 2
		return result;
	}
	public void printShape(Shape s){
		if(s.getType()==3){
			System.out.println("도형 타입 : 삼각형");
		} else {
			System.out.println("도형 타입 : 사각형");
		}
		System.out.println("높이 : " + s.getHeight());
		System.out.println("너비 : " + s.getWidth());
		System.out.println("색상 : " + s.getColor());
		//getter를 이용해 모든 필드의 값 출력하는 메소드
	}
	public String paintColor(Shape s){
		String color;
		System.out.print("어떤 색으로 도형을 칠할까요? = ");
		color = sc.nextLine();
		s.setColor(color);
		return "선택하신 도형을 " + color + " 로 색칠합니다.";
	}
}
