package stringTest;

public class WrapperTest {

	public static void main(String[] args) {
		//���� 2����  String ������Ʈâ�� ���� �Է¹޾� 
		//���θ޼ҵ��� args�� �����Ͽ�
		//���� �и��� �� �� 
		//pasing ó�� +, -, *, /, % �������� ����Ѵ�.
		
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
