package methodTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest test = new MethodTest();
		MethodTest test1 = new MethodTest();
		test.method1();
		test.method2(1);
		String str = test.method4("�ȳ��ϼ���.\n", "�ݰ����ϴ�.");
		System.out.println("���α׷� ����");
		System.out.println(str);
	}

}
