package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	//���θ޼ҵ�
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.println("******* ��� ���� ���� ���α׷� ************");
			System.out.println();
			System.out.println("1. �� ��� ���� �Է� ");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("9. ������");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();

			switch(num){
			case 1 : 
				e = empInput(e); break;
			case 2 :
				e = modifyMenu(e); break;
			case 3 : 
				e.setAddress(null);
				e.setAge(0);
				e.setBonusPoint(0);
				e.setDept(null);
				e.setEmpName(null);
				e.setEmpNo(0);
				e.setGender(' ');
				e.setJob(null);
				e.setPhone(null);
				e.setSalary(0);
				System.out.println("�����Ǿ����ϴ�");
				break;
			case 4 : 
				empOutput(e); break;
			case 9 : 
				return;
			}
		}
	}

	public static Employee empInput(Employee e){

		Scanner sc = new Scanner(System.in);

		System.out.println("����� �Է��ض� : ");
		e.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.println("�̸��� �Է��ض� : ");
		e.setEmpName(sc.nextLine());
		
		System.out.println("�Ҽ� �μ��� ���� : ");
		e.setDept(sc.nextLine());
		
		System.out.println("������ ���� : ");
		e.setJob(sc.nextLine());

		System.out.println("���̴� ���̳� : ");
		e.setAge(sc.nextInt());
		sc.nextLine();

		System.out.println("���ڳ� ���ڳ� : ");
		e.setGender(sc.next().charAt(0));

		System.out.println("�޿��� �󸶳� : ");
		e.setSalary(sc.nextInt());

		System.out.println("���ʽ��� ���۳� : ");
		e.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.println("�� ��ȣ�� ���� : ");
		e.setPhone(sc.nextLine());

		System.out.println("�ּҰ� ���� : ");
		e.setAddress(sc.nextLine());

		return e;
	}
	public static Employee modifyMenu(Employee e){
		Scanner sc = new Scanner(System.in);

		System.out.println("1. �̸� ���� : ");
		e.setEmpName(sc.nextLine());

		System.out.println("2. �޿� ���� : ");
		e.setSalary(sc.nextInt());
		sc.nextLine();

		System.out.println("3. �μ� ���� : ");
		e.setDept(sc.nextLine());

		System.out.println("4. ���� ���� : ");
		e.setJob(sc.nextLine());

		System.out.println("5. ���� �޴��� �̵�");


		return e;
	}
	public static void empOutput(Employee e){

		System.out.println("��� : " + e.getEmpNo());
		System.out.println("�̸� : " + e.getEmpName());
		System.out.println("�ҼӺμ� : " + e.getDept());
		System.out.println("���� : " + e.getJob());
		System.out.println("���� : " + e.getAge());
		System.out.println("���� : " + e.getGender());
		System.out.println("�޿� : " + e.getSalary());
		System.out.println("���ʽ� ����Ʈ : " + e.getBonusPoint());
		System.out.println("�ڵ��� : " + e.getphone());
		System.out.println("�ּ� : " + e.getAddress());

	}
}
