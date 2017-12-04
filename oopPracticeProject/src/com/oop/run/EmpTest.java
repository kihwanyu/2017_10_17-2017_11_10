package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	//메인메소드
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println();
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("번호를 입력하세요 : ");
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
				System.out.println("삭제되었습니다");
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

		System.out.println("사번을 입력해라 : ");
		e.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.println("이름을 입력해라 : ");
		e.setEmpName(sc.nextLine());
		
		System.out.println("소속 부서가 어디냐 : ");
		e.setDept(sc.nextLine());
		
		System.out.println("직급은 뭐냐 : ");
		e.setJob(sc.nextLine());

		System.out.println("나이는 몇이냐 : ");
		e.setAge(sc.nextInt());
		sc.nextLine();

		System.out.println("남자냐 여자냐 : ");
		e.setGender(sc.next().charAt(0));

		System.out.println("급여는 얼마냐 : ");
		e.setSalary(sc.nextInt());

		System.out.println("보너스는 몇퍼냐 : ");
		e.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.println("폰 번호는 뭐니 : ");
		e.setPhone(sc.nextLine());

		System.out.println("주소가 어디냐 : ");
		e.setAddress(sc.nextLine());

		return e;
	}
	public static Employee modifyMenu(Employee e){
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 이름 변경 : ");
		e.setEmpName(sc.nextLine());

		System.out.println("2. 급여 변경 : ");
		e.setSalary(sc.nextInt());
		sc.nextLine();

		System.out.println("3. 부서 변경 : ");
		e.setDept(sc.nextLine());

		System.out.println("4. 직급 변경 : ");
		e.setJob(sc.nextLine());

		System.out.println("5. 이전 메뉴로 이동");


		return e;
	}
	public static void empOutput(Employee e){

		System.out.println("사번 : " + e.getEmpNo());
		System.out.println("이름 : " + e.getEmpName());
		System.out.println("소속부서 : " + e.getDept());
		System.out.println("직급 : " + e.getJob());
		System.out.println("나이 : " + e.getAge());
		System.out.println("성별 : " + e.getGender());
		System.out.println("급여 : " + e.getSalary());
		System.out.println("보너스 포인트 : " + e.getBonusPoint());
		System.out.println("핸드폰 : " + e.getphone());
		System.out.println("주소 : " + e.getAddress());

	}
}
