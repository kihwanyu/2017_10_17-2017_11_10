package byteStreamTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	public static void fileOpen(){
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("sample.txt");
			//대상 파일이 없으면 예외 발생함.
			/*int value;
			while((value = fin.read()) != -1){
				System.out.println(value);
			}*/
			int fileSize = (int) new File("sample.txt").length();
			
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			//fin.read(bar,1,3);
			for(int i = 0; i < bar.length ; i++){
				System.out.println("bar["+i+"]"+bar[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void fileSave(){
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt");
			// 대상 파일이 존재하지 않으면 자동으로 파일을 만듬.

			fout.write(120);
			byte[] bar = {10, 20, 30 ,40 ,50};
			fout.write(bar);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		fileSave();
		fileOpen();
	}

}
