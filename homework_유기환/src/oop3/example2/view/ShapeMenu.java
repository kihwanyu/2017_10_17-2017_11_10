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

		while(true){ //�ݺ����� �̿��� �޴� ����    	    
				System.out.println("============ �������� ============");    
				System.out.println("3. �ﰢ�� ");      
				System.out.println("4. �簢�� ");      
				System.out.println("9. ���α׷� ���� ");       
				System.out.println("===================================");       
				System.out.print("����Ϸ��� ������ �����ϼ��� : ");  
				
				type = sc.nextInt();
				sc.nextLine();
					
				switch (type) {
				case 3: 
					System.out.print("������ ���̸� �Է����ּ���.");
					height=sc.nextDouble();
					sc.nextLine();
					System.out.print("������ �ʺ� �Է����ּ���.");
					width=sc.nextDouble();
					sc.nextLine();
					
					sh = new Shape(type,height,width);
					triangleMenu(sh);
					//3�� �Է½� ������ ���̿� ������ �ʺ� ��ĳ�ʷ� �Է¹ް�,
					//Shape��ü�� �Ű����� �ִ� �����ڸ� ���� type, height, width �� �����Ͽ� ��ü ����.        
					//���� Ŭ������ triangleMenu(Shape s)�� ������ ��ü�� �Ű������� �����Ͽ� �޼ҵ� ȣ�� 
					break;
				case 4:	
					System.out.print("������ ���̸� �Է����ּ���.");
					height=sc.nextDouble();
					sc.nextLine();
					System.out.print("������ �ʺ� �Է����ּ���.");
					width=sc.nextDouble();
					sc.nextLine();
					
					sh = new Shape(type,height,width);
					squareMenu(sh);
					//4�� �Է½� ������ ���̿� ������ �ʺ� ��ĳ�ʷ� �Է¹ް�,         
					//Shape��ü�� �Ű����� �ִ� �����ڸ� ���� ��ü ����.        
					//���� Ŭ������ squareMenu(Shape s)�� ������ ��ü�� �Ű������� �����Ͽ� �޼ҵ� ȣ�� 
					break;
				case 9: //9�� �Է½� �����α׷��� �����մϴ١� ��� �� ���α׷� ���� 
					System.out.println("���α׷��� ���� �˴ϴ�.");
					return;

				default: //�޴��� ���� ��ȣ �Է½� ������� �� ���� �����Դϴ�. �ٽ� �Է��ϼ��䡱 ��� �� �޴� �ٽ� ���      
					System.out.println("����� �� ���� �����Դϴ�. �ٽ� �Է��ϼ���");
					continue;
				}		
		}
	}
	public void triangleMenu(Shape s){
		TriangleManager tm = new TriangleManager();
		int key;
		while(true){
			System.out.println("========== �ﰢ�� ���� =============="); 
			System.out.println("1. �ﰢ���� �ѷ� ���ϱ� ");
			System.out.println("2. �ﰢ���� ���� ���ϱ� ");
			System.out.println("3. ������ ���� ���� ����ϱ� ");
			System.out.println("4. ������ ���� ĥ�ϱ� ");
			System.out.println("9. �������� ���ư��� ");
			System.out.println("==================================");
			System.out.print("�޴��� �������ּ���. = ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				tm.calcParameter(s.getWidth(), s.getHeight());
				break;
			case 2:
				System.out.println("�ﰢ���� ������ " + tm.calcArea(s.getWidth(), s.getHeight()) + " �Դϴ�.");
				break;
			case 3:
				tm.printShape(s);
				break;
			case 4:
				System.out.println(tm.paintColor(s));
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �����ϼ̽��ϴ�. �޴��� �ٽ� �Է����ּ���.");
				continue;
			}
		}
		
	}
	public void squareMenu(Shape s){
		SquareManager sm = new SquareManager();
		int key;
		while(true){
			System.out.println("========== �簢�� ���� =============="); 
			System.out.println("1. �簢���� �ѷ� ���ϱ� ");
			System.out.println("2. �簢���� ���� ���ϱ� ");
			System.out.println("3. ������ ���� ���� ����ϱ� ");
			System.out.println("4. ������ ���� ĥ�ϱ� ");
			System.out.println("9. �������� ���ư��� ");
			System.out.println("==================================");
			key = sc.nextInt();
			switch (key) {
			case 1:
				sm.calcParameter(s.getWidth(), s.getHeight());
				break;
			case 2:
				System.out.println("�簢���� ������ " + sm.calcArea(s.getWidth(), s.getHeight()) + " �Դϴ�.");
				break;
			case 3:
				sm.printShape(s);
				break;
			case 4:
				System.out.println(sm.paintColor(s));
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �����ϼ̽��ϴ�. �޴��� �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}
}
