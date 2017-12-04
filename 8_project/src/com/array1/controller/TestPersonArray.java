package com.array1.controller;

import java.util.Scanner;

import com.opp.array1.model.Person;

public class TestPersonArray {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Person[] ps = new Person[5];
		
		String name;
		int age;
		double height;
		double weight;
		char gender;
		String birthDay;
		
		double ageSum = 0.0;
		double heightSum = 0.0;
		double weightSum = 0.0;
		double ageAvg = 0.0;
		double heightAvg = 0.0;
		double weightAvg = 0.0;
		
		for(int i = 0; i < ps.length ; i++) {
			System.out.print("["+(i+1)+"]���� �̸��� �Է����ּ���. = ");
			name=sc.nextLine();

			System.out.print("["+(i+1)+"]Ű�� �Է����ּ���. = ");
			age=sc.nextInt();
			sc.nextLine();
	
			System.out.print("["+(i+1)+"]�������� �Է����ּ���. = ");
			weight=sc.nextDouble();
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]������ �Է����ּ���. = ");
			height = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]������ �Է����ּ���. = ");
			gender = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]������ �Է����ּ���. = ");
			birthDay = sc.nextLine();
			
			ps[i] = new Person(name,age,weight,height,gender,birthDay);
		}

		/*ps[0] = new Person("����ȯ",20,60.0,163.0,'��',"0526");
		ps[1] = new Person("ȫ�浿",30,65.0,150.0,'��',"0526");
		ps[2] = new Person("��ȣ��",40,65.0,170.0,'��',"0526");
		ps[3] = new Person("������",50,70.0,180.0,'��',"0526");
		ps[4] = new Person("���ֽ�",20,60,178.0,'��',"0526");*/
		
		for(int i = 0; i < ps.length ; i++){
			System.out.println(i+1 + " ��° Person" + ps[i].toString());
			ageSum+=ps[i].getAge();
			weightSum+=ps[i].getWeight();
			heightSum+=ps[i].getHeight();		
		}
		
		ageAvg=ageSum/ps.length;
		weightAvg=weightSum/ps.length;
		heightAvg=heightSum/ps.length;
		
		System.out.println("");
		System.out.println(ps.length + " ���� ������ ����� " + ageAvg + " �Դϴ�.");
		System.out.println(ps.length + " ���� Ű�� ����� " + heightAvg + " �Դϴ�.");
		System.out.println(ps.length + " ���� �������� ����� " + weightAvg + " �Դϴ�.");
		
	}

}
