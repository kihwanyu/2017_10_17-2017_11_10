package nsc.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		do{
		System.out.print("ù���� 1~9���� ������ �Է����ּ���. = ");
		num1 = sc.nextInt();
		sc.nextLine();
		}while(num1<1||num1>9);
		
		do{
		System.out.print("�ι��� 1~9���� ������ �Է����ּ���. = ");
		num2 = sc.nextInt();
		sc.nextLine();
		}while(num2<1||num2>9);
		
		System.out.println("��:"+cal.sum(num1, num2));
		System.out.println("��:"+cal.subtract(num1, num2));
		System.out.println("��:"+cal.multiply(num1, num2));
		System.out.println("������:"+cal.divide(num1, num2));
	}

}
