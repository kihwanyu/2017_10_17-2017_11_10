package employee.controller;

import employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setEmpNo(10);
		emp.setEmpName("유기환");
		emp.setDept("신입사원");
		emp.setJop("프로그래머");
		emp.setAge(24);
		emp.setGender('남');
		emp.setBonusPoint(100.5);
		emp.setPhone("010-4803-4471");
		emp.setAddress("경기도 의정부시");
		String str = emp.toString();
		
		System.out.println(str);
	}

}
