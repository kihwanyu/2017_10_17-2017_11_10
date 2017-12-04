package oop3.example2.view;


import java.util.Scanner;

import oop3.example2.model.dao.Shape;
import oop3.example2.model.dao.SquareManager;
import oop3.example2.model.dao.TriangleManager;

public class ShapeMenu {
	private static Scanner sc = new Scanner(System.in);
	private Shape sh;
	
	private int type = 0;
	private double height = 0.0;
	private double width = 0.0;

	public void inputMenu() {

		while(true){ //반복문을 이용해 메뉴 실행    	    
				System.out.println("============ 도형계산기 ============");    
				System.out.println("3. 삼각형 ");      
				System.out.println("4. 사각형 ");      
				System.out.println("9. 프로그램 종료 ");       
				System.out.println("===================================");       
				System.out.print("계산하려는 도형을 선택하세요 : ");  
				
				type = sc.nextInt();
				sc.nextLine();
					
				switch (type) {
				case 3: 
					System.out.print("도형의 높이를 입력해주세요.");
					height=sc.nextDouble();
					sc.nextLine();
					System.out.print("도형의 너비를 입력해주세요.");
					width=sc.nextDouble();
					sc.nextLine();
					
					sh = new Shape(type,height,width);
					triangleMenu(sh);
					//3번 입력시 도형의 높이와 도형의 너비를 스캐너로 입력받고,
					//Shape객체에 매개변수 있는 생성자를 통해 type, height, width 값 전달하여 객체 생성.        
					//동일 클래스의 triangleMenu(Shape s)에 생성한 객체를 매개변수로 전달하여 메소드 호출 
					break;
				case 4:	
					System.out.print("도형의 높이를 입력해주세요.");
					height=sc.nextDouble();
					sc.nextLine();
					System.out.print("도형의 너비를 입력해주세요.");
					width=sc.nextDouble();
					sc.nextLine();
					
					sh = new Shape(type,height,width);
					squareMenu(sh);
					//4번 입력시 도형의 높이와 도형의 너비를 스캐너로 입력받고,         
					//Shape객체에 매개변수 있는 생성자를 통해 객체 생성.        
					//동일 클래스의 squareMenu(Shape s)에 생성한 객체를 매개변수로 전달하여 메소드 호출 
					break;
				case 9: //9번 입력시 “프로그램을 종료합니다” 출력 후 프로그램 종료 
					System.out.println("프로그램이 종료 됩니다.");
					return;

				default: //메뉴에 없는 번호 입력시 “계산할 수 없는 도형입니다. 다시 입력하세요” 출력 후 메뉴 다시 출력      
					System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요");
					continue;
				}		
		}
	}
	public void triangleMenu(Shape s){
		TriangleManager tm = new TriangleManager();
		int key;
		while(true){
			System.out.println("========== 삼각형 계산기 =============="); 
			System.out.println("1. 삼각형의 둘레 구하기 ");
			System.out.println("2. 삼각형의 면적 구하기 ");
			System.out.println("3. 선택한 도형 정보 출력하기 ");
			System.out.println("4. 도형의 색상 칠하기 ");
			System.out.println("9. 메인으로 돌아가기 ");
			System.out.println("==================================");
			System.out.print("메뉴를 선택해주세요. = ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				tm.calcParameter(s.getWidth(), s.getHeight());
				break;
			case 2:
				System.out.println("삼각형의 면적은 " + tm.calcArea(s.getWidth(), s.getHeight()) + " 입니다.");
				break;
			case 3:
				tm.printShape(s);
				break;
			case 4:
				System.out.println(tm.paintColor(s));
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 메뉴를 다시 입력해주세요.");
				continue;
			}
		}
		
	}
	public void squareMenu(Shape s){
		SquareManager sm = new SquareManager();
		int key;
		while(true){
			System.out.println("========== 사각형 계산기 =============="); 
			System.out.println("1. 사각형의 둘레 구하기 ");
			System.out.println("2. 사각형의 면적 구하기 ");
			System.out.println("3. 선택한 도형 정보 출력하기 ");
			System.out.println("4. 도형의 색상 칠하기 ");
			System.out.println("9. 메인으로 돌아가기 ");
			System.out.println("==================================");
			key = sc.nextInt();
			switch (key) {
			case 1:
				sm.calcParameter(s.getWidth(), s.getHeight());
				break;
			case 2:
				System.out.println("사각형의 면적은 " + sm.calcArea(s.getWidth(), s.getHeight()) + " 입니다.");
				break;
			case 3:
				sm.printShape(s);
				break;
			case 4:
				System.out.println(sm.paintColor(s));
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 메뉴를 다시 입력해주세요.");
				continue;
			}
		}
	}
}
