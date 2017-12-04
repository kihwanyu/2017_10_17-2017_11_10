package byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChar {

	public static void main(String[] args) {
		//�⺻ ��Ʈ���� byte ��Ʈ���̰�,
		//������Ʈ���� char ��Ʈ�� �� ��� ����Ѵ�.
		input();
		//output();
	}
	public static void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ� �Է� : ");
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
