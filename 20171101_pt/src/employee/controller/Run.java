package employee.controller;

import employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setEmpNo(10);
		emp.setEmpName("����ȯ");
		emp.setDept("���Ի��");
		emp.setJop("���α׷���");
		emp.setAge(24);
		emp.setGender('��');
		emp.setBonusPoint(100.5);
		emp.setPhone("010-4803-4471");
		emp.setAddress("��⵵ �����ν�");
		String str = emp.toString();
		
		System.out.println(str);
	}

}
