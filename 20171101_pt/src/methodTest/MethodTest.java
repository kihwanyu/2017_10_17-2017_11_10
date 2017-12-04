package methodTest;

import java.util.Scanner;

public class MethodTest {
	//1. 매개변수가 없고 리턴값이 없는 메소드
	public void method1(){
		System.out.println("메소드 실행 테스트");
	}
	public void method2(int num){
		if(num%2==0) {System.out.println("짝수"); }
		else {System.out.println("홀수"); return; }
		System.out.println("메소드 종료");
		return;
	}
	public int method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. = ");
		int num1 = sc.nextInt();
		
		System.out.print("더 할 수를 하나 입력하세요. = ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		return sum;
	}
	public String method4(String a, String b){
		String result = a + b;
		return result;
	}
}
