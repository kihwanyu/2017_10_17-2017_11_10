package nsc.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		int num = 0;
		num = sc.nextInt();
		sc.nextLine();
		try {
			
			if(num<2||num>5){
				throw new InvalidException("�Է� ���� ������ �ֽ��ϴ�.");
			} else {
				System.out.println("����� : " + c.getSum(num));
			}
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}

}
