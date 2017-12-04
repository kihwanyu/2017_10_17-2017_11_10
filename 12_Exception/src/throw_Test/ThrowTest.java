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
		//Exception 발생 시키는 구문
		
		throw new IOException();
	}
}
