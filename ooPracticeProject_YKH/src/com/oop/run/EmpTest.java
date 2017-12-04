package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		mainMenu();
	}
	public static void mainMenu(){
		Employee e = new Employee();
		
		int num = 0;
		
		while(true){
			System.out.println("******* ��� ���� ���� ���α׷� ************");
			System.out.println("");
			System.out.println("1. �� ��� ���� �Է� "); // empInput() �޼ҵ� ����
			System.out.println("2. ��� ���� ���� "); //�θ޴� ��Ÿ��
			System.out.println("3. ��� ���� ���� ");
			System.out.println("4. ������� ��� "); //empOutput() �޼ҵ� ����
			System.out.println("9. ������");
			
			System.out.print("��ȣ�� �Է����ּ���. : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				e = empInput(e); // ��������Է�
				break;
			case 2:
				e = modifyMenu(e); // �����������
				break;
			case 3:
				e = empDelete(e); // �����������
				break;
			case 4:
				empOutput(e); // ����������
				break;
			case 9:
				System.out.println("����Ǿ����ϴ�.");
				return;
	
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
		}
	}
	public static Employee empInput(Employee e) {
		System.out.print("�����ȣ�� �Է����ּ���. = ");
		e.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("����̸��� �Է����ּ���. = ");
		e.setEmpName(sc.nextLine());
		System.out.print("�μ��� �Է����ּ���. = ");
		e.setDept(sc.nextLine());
		System.out.print("������ �Է����ּ���. = ");
		e.setJop(sc.nextLine());
		System.out.print("���̸� �Է����ּ���. = ");
		e.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �Է����ּ���. = ");
		e.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("�޿��� �Է����ּ���. = ");
		e.setSalary(sc.nextInt());
		sc.nextLine();
		System.out.print("���ʽ�����Ʈ�� �Է����ּ���. = ");
		e.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("�ڵ����� �Է����ּ���. = ");
		e.setPhone(sc.nextLine());
		System.out.print("�ּҸ� �Է����ּ���. = ");
		e.setAddress(sc.nextLine());		
		return e;
	}
	public static Employee empDelete(Employee e) {
		e.setEmpNo(0);
		e.setEmpName("");
		e.setAge(0);
		e.setDept("");
		e.setGender(' ');
		e.setJop("");
		e.setPhone("");
		e.setSalary(0);
		e.setBonusPoint(0.0);
		e.setAddress("");
		System.out.println("�ڷᰡ �����Ǿ����ϴ�.");
		return e;
	}
	public static void empOutput(Employee e) {
		System.out.println(e.toString());
	}
	public static Employee modifyMenu(Employee e) {
		int num;
			while(true){
			System.out.println("***** ��� ���� ���� �޴� *****");
			System.out.println("1. �̸� ���� "); //setEmpName()
			System.out.println("2. �޿� ���� ");//setSalary()
			System.out.println("3. �μ� ���� ");//setDept()
			System.out.println("4. ���� ���� ");//setJob()
			System.out.println("5. ���� �޴��� �̵� ");
			
			System.out.println("�������� �޴��� �������ּ���.");
			num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println("�����̸��� " + e.getEmpName() + " �Դϴ�.");
				System.out.print("������ �̸��� �Է����ּ���. = ");
				String name = sc.nextLine();
				e.setEmpName(name);
				break;
			case 2:
				System.out.println("����޿��� " + e.getSalary() + " �Դϴ�.");
				System.out.print("������ �޿��� �Է����ּ���. = ");
				int salary = sc.nextInt();
				sc.nextLine();
				e.setSalary(salary);
				break;
			case 3:
				System.out.println("����μ��� " + e.getDept() + " �Դϴ�.");
				System.out.print("������ �޿��� �Է����ּ���. = ");
				String dept = sc.nextLine();
				e.setDept(dept);
				break;
			case 4:
				System.out.println("���������� " + e.getJop() + " �Դϴ�.");
				System.out.print("������ �޿��� �Է����ּ���. = ");
				String jop = sc.nextLine();
				e.setJop(jop);
				break;
			case 5:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return e;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
		}
		/***** ��� ���� ���� �޴� *****
		1. �̸� ���� => setEmpName()
		2. �޿� ���� => setSalary()
		3. �μ� ���� => setDept()
		4. ���� ���� => setJob()
		5. ���� �޴��� �̵� => return ó���� ��*/
	}
	
	
	
	/*
	��� : - empNo:int
	�̸� : - empName:String
	�ҼӺμ� : - dept:String
	���� : - job:String
	���� : - age:int
	���� : - gender:char
	�޿� : - salary:int
	���ʽ�����Ʈ : - bonusPoint:double
	�ڵ��� : - phone:String
	�ּ� : - address:String*/

}
