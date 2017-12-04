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
			System.out.print("["+(i+1)+"]번쨰 이름을 입력해주세요. = ");
			name=sc.nextLine();

			System.out.print("["+(i+1)+"]키을 입력해주세요. = ");
			age=sc.nextInt();
			sc.nextLine();
	
			System.out.print("["+(i+1)+"]몸무게을 입력해주세요. = ");
			weight=sc.nextDouble();
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]나이을 입력해주세요. = ");
			height = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]성별을 입력해주세요. = ");
			gender = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("["+(i+1)+"]생일을 입력해주세요. = ");
			birthDay = sc.nextLine();
			
			ps[i] = new Person(name,age,weight,height,gender,birthDay);
		}

		/*ps[0] = new Person("유기환",20,60.0,163.0,'남',"0526");
		ps[1] = new Person("홍길동",30,65.0,150.0,'남',"0526");
		ps[2] = new Person("강호동",40,65.0,170.0,'여',"0526");
		ps[3] = new Person("김유신",50,70.0,180.0,'여',"0526");
		ps[4] = new Person("구주승",20,60,178.0,'남',"0526");*/
		
		for(int i = 0; i < ps.length ; i++){
			System.out.println(i+1 + " 번째 Person" + ps[i].toString());
			ageSum+=ps[i].getAge();
			weightSum+=ps[i].getWeight();
			heightSum+=ps[i].getHeight();		
		}
		
		ageAvg=ageSum/ps.length;
		weightAvg=weightSum/ps.length;
		heightAvg=heightSum/ps.length;
		
		System.out.println("");
		System.out.println(ps.length + " 명의 나이의 평균은 " + ageAvg + " 입니다.");
		System.out.println(ps.length + " 명의 키의 평균은 " + heightAvg + " 입니다.");
		System.out.println(ps.length + " 명의 몸무게의 평균은 " + weightAvg + " 입니다.");
		
	}

}
