package io.silsub1;

import java.util.Scanner;

public class TestMyNote {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		MyNote mn = new MyNote();
		//mn.fileSave();
		//mn.fileOpen();
		//mn.fileEdit();
		while(true){
			
			int key = 0;
			System.out.println("******   MyNote  *******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("메뉴 선택 : ");
			System.out.println(sc.hasNext());
			if (sc.hasNext()) {
				key = sc.nextInt();
			}
			switch (key) {
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileEdit();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
	
			default:
				System.out.println("잘못된입력입니다.");
				break;
			}
		}
		/*******   MyNote  *******
		1. 노트 새로 만들기		//MyNote의 fileSave()
		2. 노트 열기		//MyNote의 fileOpen()
		3. 노트 열어서 수정하기	//MyNote의 fileEdit()
		4. 끝내기		//main() 으로 리턴

		메뉴 선택 : 번호입력

		입력된 번호에 따라, MyNote 의 메소드 실행시킴
		메뉴 반복 실행*/
	}

}
