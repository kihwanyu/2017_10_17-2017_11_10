package throw_Test;

import java.io.IOException;

public class Run {
	public static void main(String[] args) {//throws IOException {
		// TODO Auto-generated method stub
		ThrowTest tt = new ThrowTest();
		try {
			tt.methodA();
			System.out.println("프로그램 정상 종료");
		} catch (IOException e) {
			System.out.println("IOException 발생...");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			System.out.println("finally 블럭생성");
		}
	}
}
