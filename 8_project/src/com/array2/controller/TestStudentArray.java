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
			System.out.print("이름을 입력해주세요 (0을 입력시 종료됩니다.) = ");
			name = sc.nextLine();
			if(name.equals("0")){
				break;
			}
			System.out.print("학년을 입력해주세요 = ");
			grade = sc.nextInt();
			sc.nextLine();
			System.out.print("반을 입력해주세요 = ");
			classRoom = sc.nextInt();
			sc.nextLine();
			System.out.print("국어점수를 입력해주세요 = ");
			kor = sc.nextInt();
			sc.nextLine();
			System.out.print("영어점수를 입력해주세요 = ");
			eng = sc.nextInt();
			sc.nextLine();
			System.out.print("수학점수를 입력해주세요 = ");
			mat = sc.nextInt();
			sc.nextLine();
			st[count] = new Student(name,grade,classRoom,kor,eng,mat);
			i++;
			count++;
		}
		
		/*st[0] = new Student("홍길동",3,4,60,50,30);
		st[1] = new Student("황진이",4,5,60,50,30);
		st[2] = new Student("황진이",4,5,60,50,30);*/
		
		for(i = 0; i < count; i++){
			System.out.println("["+ (i+1) + "] 번째 " + st[i].toString());
			
			sumKor += st[i].getKor();
			sumEng += st[i].getEng();
			sumMat += st[i].getMat();
		}
			System.out.println((count)+"명의 국어점수 평균은 " + sumKor/(count) + " 입니다.");
			System.out.println((count)+"명의 영어점수 평균은 " + sumEng/(count) + " 입니다.");
			System.out.println((count)+"명의 수학점수 평균은 " + sumMat/(count) + " 입니다.");
			System.out.println((count)+"명의 전체점수 평균은 " + (sumKor+sumMat+sumEng)/((count)*3) + " 입니다.");
	}

}
