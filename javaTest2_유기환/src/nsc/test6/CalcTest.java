package nsc.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		do{
		System.out.print("첫번쨰 1~9까지 정수를 입력해주세요. = ");
		num1 = sc.nextInt();
		sc.nextLine();
		}while(num1<1||num1>9);
		
		do{
		System.out.print("두번쨰 1~9까지 정수를 입력해주세요. = ");
		num2 = sc.nextInt();
		sc.nextLine();
		}while(num2<1||num2>9);
		
		System.out.println("합:"+cal.sum(num1, num2));
		System.out.println("차:"+cal.subtract(num1, num2));
		System.out.println("곱:"+cal.multiply(num1, num2));
		System.out.println("나누기:"+cal.divide(num1, num2));
	}

}
