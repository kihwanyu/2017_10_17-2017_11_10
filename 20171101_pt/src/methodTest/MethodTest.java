package methodTest;

import java.util.Scanner;

public class MethodTest {
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void method1(){
		System.out.println("�޼ҵ� ���� �׽�Ʈ");
	}
	public void method2(int num){
		if(num%2==0) {System.out.println("¦��"); }
		else {System.out.println("Ȧ��"); return; }
		System.out.println("�޼ҵ� ����");
		return;
	}
	public int method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���. = ");
		int num1 = sc.nextInt();
		
		System.out.print("�� �� ���� �ϳ� �Է��ϼ���. = ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		return sum;
	}
	public String method4(String a, String b){
		String result = a + b;
		return result;
	}
}
