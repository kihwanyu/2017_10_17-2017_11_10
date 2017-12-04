package byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChar {

	public static void main(String[] args) {
		//기본 스트림이 byte 스트림이고,
		//보조스트림이 char 스트림 인 경우 사용한다.
		input();
		//output();
	}
	public static void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 입력 : ");
		try {
			String value = br.readLine();
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	public static void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
			bw.flush();
			bw.write('c');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	
