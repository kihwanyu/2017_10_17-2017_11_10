package stringTest;

public class WrapperTest {

	public static void main(String[] args) {
		//숫자 2개를  String 프롬프트창을 통해 입력받아 
		//메인메소드의 args로 전달하여
		//각각 분리를 한 뒤 
		//pasing 처리 +, -, *, /, % 연산결과를 출력한다.
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("a="+a+"\tb="+b);
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
	}

}
