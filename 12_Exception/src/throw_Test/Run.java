package throw_Test;

import java.io.IOException;

public class Run {
	public static void main(String[] args) {//throws IOException {
		// TODO Auto-generated method stub
		ThrowTest tt = new ThrowTest();
		try {
			tt.methodA();
			System.out.println("���α׷� ���� ����");
		} catch (IOException e) {
			System.out.println("IOException �߻�...");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			System.out.println("finally ������");
		}
	}
}
