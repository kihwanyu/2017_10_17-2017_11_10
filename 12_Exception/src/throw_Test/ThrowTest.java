package throw_Test;

import java.io.IOException;


public class ThrowTest {
	public void methodA() throws IOException {
		methodB();
	}
	public void methodB() throws IOException{
		methodC();
		
		}
	public void methodC() throws IOException{
		//Exception �߻� ��Ű�� ����
		
		throw new IOException();
	}
}
