package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	static Employee emp = new Employee();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				empInput(); // ��������Է�
				break;
			case 2:
				emp = modifyMenu(emp);
				break;
			case 3:
				empDelete();
				break;
			case 4:
				empOutput(); // ����������
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
	public static void empInput() {
		System.out.print("�����ȣ�� �Է����ּ���. = ");
		emp.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("����̸��� �Է����ּ���. = ");
		emp.setEmpName(sc.nextLine());
		System.out.print("�μ��� �Է����ּ���. = ");
		emp.setDept(sc.nextLine());
		System.out.print("������ �Է����ּ���. = ");
		emp.setJop(sc.nextLine());
		System.out.print("���̸� �Է����ּ���. = ");
		emp.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �Է����ּ���. = ");
		emp.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("�޿��� �Է����ּ���. = ");
		emp.setSalary(sc.nextInt());
		sc.nextLine();
		System.out.print("���ʽ�����Ʈ�� �Է����ּ���. = ");
		emp.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("�ڵ����� �Է����ּ���. = ");
		emp.setPhone(sc.nextLine());
		System.out.print("�ּҸ� �Է����ּ���. = ");
		emp.setAddress(sc.nextLine());		
	}
	public static void empDelete() {
		emp.setEmpNo(0);
		emp.setEmpName("");
		emp.setAge(0);
		emp.setDept("");
		emp.setGender(' ');
		emp.setJop("");
		emp.setPhone("");
		emp.setSalary(0);
		emp.setBonusPoint(0.0);
		emp.setAddress("");
		System.out.println("�ڷᰡ �����Ǿ����ϴ�.");
	}
	public static void empOutput() {
		System.out.println(emp.toString());
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