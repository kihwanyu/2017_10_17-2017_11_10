package try_Catch_Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {
	public void method(){
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}
		String s;
		try {
			while((s= in.readLine()) != null){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	
