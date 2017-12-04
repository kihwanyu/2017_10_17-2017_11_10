package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	/*1. 필드 : Scanner 객체 생성
	2. 생성자 : 디폴트생성자
	3. public void mainMenu() 메소드 작성
	  >> 출력내용*/
	private static Scanner sc = new Scanner(System.in);
	public BoardMenu(){
		
	}
	public void mainMenu(){
		BoardManager bm = new BoardManager();
		while(true){
			System.out.println("******* 게시글 서비스 프로그램 *******");
			System.out.println("1. 게시글 쓰기 ");		//BoardManager의 writeBoard() 실행
			System.out.println("2. 게시글 전체 보기 ");		//		displayAllList()
			System.out.println("3. 게시글 한개 보기 ");		//		displayBoard()
			System.out.println("4. 게시글 제목 수정 ");		//		modifyTitle()
			System.out.println("5. 게시글 내용 수정 ");		//		modifyContent()
			System.out.println("6. 게시글 삭제 ");	//		deleteBoard()
			System.out.println("7. 게시글 검색 ");	//		searchBoard()
			System.out.println("8. 파일에 저장하기 ");		//		saveListFile()
			System.out.println("9. 정렬하기 ");		// boardMenu 의 sortSubMenu() 실행
			System.out.println("0. 끝내기	");	//main() 으로 리턴함
			System.out.print("메뉴 번호 : ");
			int key = sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:
				bm.writeBoard();
				break;
			case 2:
				bm.displayAllList();
				break;
			case 3:
				bm.displayBoard();
				break;
			case 4:
				bm.modifyTitle();
				break;
			case 5:
				bm.modifyContent();
				break;
			case 6:
				bm.deleteBoard();		
				break;
			case 7:
				bm.searchBoard();
				break;
			case 8:
				bm.saveListFile();
				break;
			case 9:
				sortSubMenu();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public static void sortSubMenu() {
		BoardManager bm = new BoardManager();
		System.out.println("****** 게시글 정렬 메뉴 ******");
		System.out.println("1. 글번호순 오름차순정렬 ");	//BoardManager 의 	sortList(1, false) 실행
		System.out.println("2. 글번호순 내림차순정렬 ");	//		sortList(1, true) 실행
		System.out.println("3. 작성날짜순 오름차순정렬 ");	//		sortList(2, false) 실행		
		System.out.println("4. 작성날짜순 내림차순정렬 ");	//		sortList(2, true) 실행
		System.out.println("5. 글제목순 오름차순정렬 ");	//		sortList(3, false) 실행
		System.out.println("6. 글제목순 내림차순정렬 ");	//		sortList(3, true) 실행
		System.out.println("7. 이전 메뉴로 이동 ");		//return 처리
		System.out.print("메뉴 번호 : ");
		int key = sc.nextInt();
		sc.nextLine();
		switch (key) {
		case 1:
			bm.sortList(1, false);
			break;
		case 2:
			bm.sortList(1, true);
			break;
		case 3:
			bm.sortList(2, false);
			
			break;
		case 4:
			bm.sortList(2, true);
			
			break;
		case 5:
			bm.sortList(3, false);
			
			break;
		case 6:
			bm.sortList(3, true);	
			break;
		case 7:
			System.out.println("이전메뉴로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
