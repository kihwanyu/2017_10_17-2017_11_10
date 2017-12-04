package week4.io.silsub;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestSilsub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileSave();
		fileRead();
	}
	public static void fileSave(){
		BufferedReader br = null;
		FileWriter fw = null;
		String value = null;
		
		try {
			fw = new FileWriter("test.txt");
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				System.out.println("파일에 저장할 내용을 입력하시오.");
				
				value = br.readLine();
				
				if(value.equals("exit")) {
					System.out.println("파일에 성공적으로 저장되었습니다.");
					return;
				}
				fw.write(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}
	/*>> main() 포함
	=> fileSave() 메소드 실행함

	>> 메소드 추가함
	+ fileSave() : void
	=> 키보드로 사용할 파일명을 입력받음
		BufferedReader의 readLine() 사용함
	=> 파일출력용 스트림 객체 생성함
		FileWriter 사용함
	=> 화면에 "파일에 저장할 내용을 입력하시오." 출력
		입력값을 읽어들여서 바로 파일에 기록 저장처리
		반복실행함
	=> "exit"가 입력되면, 반복은 종료하고
		화면에 "파일에 성공적으로 저장되었습니다." 출력하고
	=> 파일출력 스트림을 닫음.*/
	static void fileRead() {
		FileReader fr = null;
		StringBuilder sb = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("읽을 파일 이름을 입력하세요. = ");
			String fileName = br.readLine();
			
			fr = new FileReader(fileName);
			
			int value;
			sb = new StringBuilder();
			
			while((value = fr.read())!= -1){
				sb.append((char)value);
				//System.out.print((char)value);
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 	/*>> 메소드
	+ fileRead() : void
	=> 키보드로 읽을 대상파일명을 입력받음
	=> 파일 읽기용 스트림 객체 생성함 : FileReader 사용
	=> 파일 안의 내용을 읽어서, StringBuilder 에 보관함
	=> 다 읽은 다음, StringBuilder 에 보관된 값을 
	   String으로 바꾸어 화면에 출력함*/


}
