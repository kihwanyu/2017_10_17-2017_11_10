package myException;

public class MyExceptionTest {
	public void checkAge(int age){
		try {
			if(age < 19){
				throw new MyException("���� �Ұ�");
			} else {
				System.out.println("��");
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
