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
			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println("");
			System.out.println("1. 새 사원 정보 입력 "); // empInput() 메소드 실행
			System.out.println("2. 사원 정보 수정 "); //부메뉴 나타남
			System.out.println("3. 사원 정보 삭제 ");
			System.out.println("4. 사원정보 출력 "); //empOutput() 메소드 실행
			System.out.println("9. 끝내기");
			
			System.out.print("번호를 입력해주세요. : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				e = empInput(e); // 사원정보입력
				break;
			case 2:
				e = modifyMenu(e); // 사원정보수정
				break;
			case 3:
				e = empDelete(e); // 사원정보삭제
				break;
			case 4:
				empOutput(e); // 사원정보출력
				break;
			case 9:
				System.out.println("종료되었습니다.");
				return;
	
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}
	public static Employee empInput(Employee e) {
		System.out.print("사원번호를 입력해주세요. = ");
		e.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("사원이름를 입력해주세요. = ");
		e.setEmpName(sc.nextLine());
		System.out.print("부서을 입력해주세요. = ");
		e.setDept(sc.nextLine());
		System.out.print("직급을 입력해주세요. = ");
		e.setJop(sc.nextLine());
		System.out.print("나이를 입력해주세요. = ");
		e.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("성별을 입력해주세요. = ");
		e.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("급여를 입력해주세요. = ");
		e.setSalary(sc.nextInt());
		sc.nextLine();
		System.out.print("보너스포인트를 입력해주세요. = ");
		e.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("핸드폰을 입력해주세요. = ");
		e.setPhone(sc.nextLine());
		System.out.print("주소를 입력해주세요. = ");
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
		System.out.println("자료가 삭제되었습니다.");
		return e;
	}
	public static void empOutput(Employee e) {
		System.out.println(e.toString());
	}
	public static Employee modifyMenu(Employee e) {
		int num;
			while(true){
			System.out.println("***** 사원 정보 수정 메뉴 *****");
			System.out.println("1. 이름 변경 "); //setEmpName()
			System.out.println("2. 급여 변경 ");//setSalary()
			System.out.println("3. 부서 변경 ");//setDept()
			System.out.println("4. 직급 변경 ");//setJob()
			System.out.println("5. 이전 메뉴로 이동 ");
			
			System.out.println("정보수정 메뉴를 선택해주세요.");
			num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println("현재이름은 " + e.getEmpName() + " 입니다.");
				System.out.print("변경할 이름을 입력해주세요. = ");
				String name = sc.nextLine();
				e.setEmpName(name);
				break;
			case 2:
				System.out.println("현재급여는 " + e.getSalary() + " 입니다.");
				System.out.print("변경할 급여를 입력해주세요. = ");
				int salary = sc.nextInt();
				sc.nextLine();
				e.setSalary(salary);
				break;
			case 3:
				System.out.println("현재부서는 " + e.getDept() + " 입니다.");
				System.out.print("변경할 급여를 입력해주세요. = ");
				String dept = sc.nextLine();
				e.setDept(dept);
				break;
			case 4:
				System.out.println("현재직급은 " + e.getJop() + " 입니다.");
				System.out.print("변경할 급여를 입력해주세요. = ");
				String jop = sc.nextLine();
				e.setJop(jop);
				break;
			case 5:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return e;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
		/***** 사원 정보 수정 메뉴 *****
		1. 이름 변경 => setEmpName()
		2. 급여 변경 => setSalary()
		3. 부서 변경 => setDept()
		4. 직급 변경 => setJob()
		5. 이전 메뉴로 이동 => return 처리할 것*/
	}
	
	
	
	/*
	사번 : - empNo:int
	이름 : - empName:String
	소속부서 : - dept:String
	직급 : - job:String
	나이 : - age:int
	성별 : - gender:char
	급여 : - salary:int
	보너스포인트 : - bonusPoint:double
	핸드폰 : - phone:String
	주소 : - address:String*/

}
