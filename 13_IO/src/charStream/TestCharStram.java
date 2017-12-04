package charStream;

import java.io.*;

public class TestCharStram {

	public static void main(String[] args) {
		fileSave();
		fileOpen();
	}
	public static void fileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("sample2.txt");
			fw.write("우리나라 대한민국");
			fw.write('A');
			char[] arr = {'a','b','c','d','e'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			int value;
			while ((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
