package com.array2.controller;

import java.util.Scanner;

import com.oop.array2.model.Student;

public class TestStudentArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student[] st = new Student[10];
		
		String name;
		int grade;
		int classRoom;
		int kor;
		int eng;
		int mat;
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		
		int i = 0;
		int count = 0;
		
		while(i < st.length){
			System.out.print("�̸��� �Է����ּ��� (0�� �Է½� ����˴ϴ�.) = ");
			name = sc.nextLine();
			if(name.equals("0")){
				break;
			}
			System.out.print("�г��� �Է����ּ��� = ");
			grade = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �Է����ּ��� = ");
			classRoom = sc.nextInt();
			sc.nextLine();
			System.out.print("���������� �Է����ּ��� = ");
			kor = sc.nextInt();
			sc.nextLine();
			System.out.print("���������� �Է����ּ��� = ");
			eng = sc.nextInt();
			sc.nextLine();
			System.out.print("���������� �Է����ּ��� = ");
			mat = sc.nextInt();
			sc.nextLine();
			st[count] = new Student(name,grade,classRoom,kor,eng,mat);
			i++;
			count++;
		}
		
		/*st[0] = new Student("ȫ�浿",3,4,60,50,30);
		st[1] = new Student("Ȳ����",4,5,60,50,30);
		st[2] = new Student("Ȳ����",4,5,60,50,30);*/
		
		for(i = 0; i < count; i++){
			System.out.println("["+ (i+1) + "] ��° " + st[i].toString());
			
			sumKor += st[i].getKor();
			sumEng += st[i].getEng();
			sumMat += st[i].getMat();
		}
			System.out.println((count)+"���� �������� ����� " + sumKor/(count) + " �Դϴ�.");
			System.out.println((count)+"���� �������� ����� " + sumEng/(count) + " �Դϴ�.");
			System.out.println((count)+"���� �������� ����� " + sumMat/(count) + " �Դϴ�.");
			System.out.println((count)+"���� ��ü���� ����� " + (sumKor+sumMat+sumEng)/((count)*3) + " �Դϴ�.");
	}

}
