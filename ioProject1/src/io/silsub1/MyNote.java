package io.silsub1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	public void fileSave(){
		String str = null;
		FileWriter fw = null;
		StringBuilder sb = new StringBuilder();
		for(;;){
			System.out.print("파일에 저장할 내용을 입력해주세요.");
			
			str = sc.nextLine();
			sb.append(str);
			if(str.equals("exit")){
				char result;
				System.out.print("저장하시겠습니까?(y,n) = ");
				result = sc.next().charAt(0);
				sc.nextLine();
				if(result=='y'||result=='Y'){
					System.out.print("저장할 파일명 : ");
					String fileName = sc.nextLine();
					try {
						fw = new FileWriter(fileName+".txt");
						fw.write(sb.toString());
						System.out.println(sb.toString());
						System.out.println(fileName+".txt 파일에 성공적으로 저장되었습니다.");
					} catch (IOException e) {	
						e.printStackTrace();
					} finally {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				} else {
					System.out.println("잘못된 입력으로 종료됩니다.");
					return;
				}
			}
		}
	}
	public void fileOpen(){
		FileReader fr = null;
		StringBuilder sb = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("열기할 파일명 : ");
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
	public void fileEdit(){
		String str = null;
		FileWriter fw = null;
		StringBuilder sb = new StringBuilder();
		FileReader fr = null;
		
		String updateFileName = null;
		
		System.out.print("수정할 파일명 : ");
		updateFileName = sc.nextLine();
		
		try {
			fr = new FileReader(updateFileName);
			
			int value;
			sb = new StringBuilder();
			
			while((value = fr.read())!= -1){
				sb.append((char)value);
				//System.out.print((char)value);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(;;){
			System.out.print("파일에 추가할 내용을 입력해주세요.");
			
			str = sc.nextLine();
			sb.append(str);
			if(str.equals("exit")){
				char result;
				System.out.print("변경된 내용을 저장하시겠습니까?(y,n) = ");
				result = sc.next().charAt(0);
				
				if(result=='y' || result=='Y'){
					try {
						fw = new FileWriter(updateFileName);
						fw.write(sb.toString());
						System.out.println(sb.toString());
						System.out.println(updateFileName+" 파일의 내용이 변경되었습니다.");
					} catch (IOException e) {	
						e.printStackTrace();
					} finally {
						try {
							fw.close();
							fr.close();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					break;
				} else {
					System.out.println("잘못된 입력으로 종료됩니다.");
					return;
				}
			}
		}
	}
	/* fileEdit() 메소드 -----------------------------------------
	1. "수정할 파일명 : " 출력하고, 파일명 입력받음
	2. 파일 입력 스트림 생성
	3. 파일 출력 스트림 생성 : 단, 기존 내용 둔 상태로 생성할 것
	4. 파일의 내용을 읽어, StringBuilder 에 저장
	5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용 입력받음
	6. 추가내용을 StringBuilder 에 추가함 : 반복
	7. "exit" 입력하면 반복 종료함
	8. "변경된 내용을 파일에 추가하시겠습니까? (y/n) : " 출력
	9. 대소문자 상관없이 'Y'이면, 파일에 기록함
	10. "ooo.txt 파일의 내용이 변경되었습니다." 출력
	11. 스트림 반납하고 리턴함*/
}
