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
				empInput(); // 사원정보입력
				break;
			case 2:
				emp = modifyMenu(emp);
				break;
			case 3:
				empDelete();
				break;
			case 4:
				empOutput(); // 사원정보출력
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
	public static void empInput() {
		System.out.print("사원번호를 입력해주세요. = ");
		emp.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("사원이름를 입력해주세요. = ");
		emp.setEmpName(sc.nextLine());
		System.out.print("부서을 입력해주세요. = ");
		emp.setDept(sc.nextLine());
		System.out.print("직급을 입력해주세요. = ");
		emp.setJop(sc.nextLine());
		System.out.print("나이를 입력해주세요. = ");
		emp.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("성별을 입력해주세요. = ");
		emp.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("급여를 입력해주세요. = ");
		emp.setSalary(sc.nextInt());
		sc.nextLine();
		System.out.print("보너스포인트를 입력해주세요. = ");
		emp.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("핸드폰을 입력해주세요. = ");
		emp.setPhone(sc.nextLine());
		System.out.print("주소를 입력해주세요. = ");
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
		System.out.println("자료가 삭제되었습니다.");
	}
	public static void empOutput() {
		System.out.println(emp.toString());
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
