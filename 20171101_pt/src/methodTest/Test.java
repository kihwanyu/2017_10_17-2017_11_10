package methodTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest test = new MethodTest();
		MethodTest test1 = new MethodTest();
		test.method1();
		test.method2(1);
		String str = test.method4("안녕하세요.\n", "반갑습니다.");
		System.out.println("프로그램 종료");
		System.out.println(str);
	}

}
