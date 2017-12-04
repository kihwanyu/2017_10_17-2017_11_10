package tryCatchWithResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchWithResouceTest {
	public void method(){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print(" 숫자 한개 입력 : ");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			num*=2;
			System.out.println(num);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
