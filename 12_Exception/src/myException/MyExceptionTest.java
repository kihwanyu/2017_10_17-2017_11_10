package myException;

public class MyExceptionTest {
	public void checkAge(int age){
		try {
			if(age < 19){
				throw new MyException("입장 불가");
			} else {
				System.out.println("즐감");
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
