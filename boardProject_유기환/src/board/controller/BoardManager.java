package board.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

public class BoardManager {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Board> arrayList = new ArrayList<Board>();
	
	public void writeBoard() {
		StringBuilder sb = new StringBuilder();
		
		String boardTitle;	//게시글 제목
		String boardWriter;	//작성자아이디
		Date boardDate;	//작성날짜
		String boardContent; //글내용
		
		/*arrayList.add(new Board(0, "a안녕하세요?", "유기환", new Date(), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(1, "d안녕하세요?", "유기환", new Date(3000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(2, "b안녕하세요?", "유기환", new Date(2000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(4, "c안녕하세요?", "유기환", new Date(1000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(3, "4안녕하세요?", "유기환", new Date(5000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(5, "1안녕하세요?", "유기환", new Date(6000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(7, "2안녕하세요?", "유기환", new Date(7000L), "반갑습니다, 유기환입니다.", "0"));
		arrayList.add(new Board(6, "3안녕하세요?", "유기환", new Date(8000L), "반갑습니다, 유기환입니다.", "0"));*/
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글 제목 : ");
		boardTitle = sc.nextLine();
		System.out.print("작성자 : ");
		boardWriter = sc.nextLine().replace(" ", ""); // 문자열의 공백을 제거한다.
		
		boardDate = new Date();
		System.out.println("글내용 : ");
		do{
			boardContent = sc.nextLine();
			if(!boardContent.equals("exit")){
				sb.append(boardContent);
				sb.append('\n');
			}
		} while (!boardContent.equals("exit"));
		arrayList.add(new Board(arrayList.size(), boardTitle, boardWriter, boardDate, sb.toString(), "0"));
		/*
		>> 구현내용
		1> "새 게시글 쓰기 입니다." 출력
		2> "글제목 : " >> 입력받음(공백포함)
		3> "작성자 : " >> 이름 입력받음 (공백없이)
		4> 작성날짜는 현재 날짜로 입력처리함
		5> "글내용 : " >> 여러 줄로 입력받음
				"exit" 입력하면 입력종료
		6> Board 객체 생성시 초기값으로 사용함
		7> list에 추가함*/
	}

	public void displayAllList() {
		for(Board b : arrayList ){
			System.out.println(b);
		}
		/*>> 구현내용
		1> list 에 기록된 정보를 모두 화면에 출력시킴*/
	}

	public void displayBoard() {
		int boardNo;	//게시글 번호
		Board temp;
		int count;
		System.out.print("조회할 글번호 : ");
		boardNo = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				temp = arrayList.get(i);
				count=Integer.parseInt(temp.getReadCount());
				count++;
				temp.setReadCount(String.valueOf(count).toString());
				arrayList.set(i, temp);
				System.out.println(arrayList.get(i));
			}
		}
		/*>> 구현내용
		1> "조회할 글번호 : " >> 입력받음
		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
		3> 해당 글에 대한 조회수 1증가 처리함*/
	}

	public void modifyTitle() {
		int boardNo;	//게시글 번호
		String boardTitle;
		Board temp;
		System.out.print("수정할 글번호 : ");
		boardNo = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.println("변경할 제목 : ");
				boardTitle = sc.nextLine();
				temp = arrayList.get(i);
				temp.setBoardTitle(boardTitle);
				arrayList.set(i,temp);
			}
		}
		/*1> "수정할 글번호 : " >> 입력받음
		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
		3> "변경할 제목 : " >> 새 제목 입력받음 >> 제목변경
		4> 변경된 객체 정보를 list의 해당 번호 객체에 적용함*/
	}

	public void modifyContent() {
		StringBuilder sb = new StringBuilder();
		
		int boardNo;	//게시글 번호
		String boardContent;	//글내용
		Board temp;
		System.out.print("수정할 글번호 : ");
		boardNo = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.println("변경할 내용 : ");
				do{
					boardContent = sc.nextLine();
					if(!boardContent.equals("exit")){
						sb.append(boardContent);
						sb.append('\n');
					}
				} while (!boardContent.equals("exit"));
				temp = arrayList.get(i);
				temp.setBoardContent(sb.toString());
				arrayList.set(i,temp);
			}
		}
		/*>> 구현내용
		1> "수정할 글번호 : " >> 입력받음
		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
		3> "변경할 내용 : " >> 새 내용 입력받음 >> 내용변경
		4> 변경된 객체 정보를 list의 해당 번호 객체에 적용함*/

	}

	public void deleteBoard() {
		int boardNo;	//게시글 번호
		
		System.out.print("삭제할 글번호 : ");
		boardNo = sc.nextInt();
		char option; 
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.print("정말로 삭제하시겠습니까?(Y/N)");
				option = sc.next().charAt(0);
				sc.nextLine();
				if(option=='y'||option=='Y'){
					arrayList.remove(i);
					System.out.println(i+" 번 글이 삭제되었습니다.");
				} else {
					System.out.println("삭제가 취소되었습니다.");
				}
			}
		}
		/*>> 구현내용
		1> "삭제할 글번호 : " >> 입력받음
		2> 해당 글번호에 대한 게시글을 화면에 출력시킴
		3> "정말로 삭제하시겠습니까? (y/n) : " 
		    >> 'Y'입력시 list에서 해당 객체 삭제함
		4> "oo번 글이 삭제되었습니다." 출력*/
	}

	public void searchBoard() {
		String boardTitle;	//게시글 제목
		
		System.out.print("검색할 제목 : ");
		boardTitle = sc.nextLine();

		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardTitle().equals(boardTitle)){
				System.out.println(arrayList.get(i));
			}
		}
		/*>> 구현내용
		1> "검색할 제목 : " >> 검색할 글자를 입력받음
		2> 입력된 글자를 제목으로 포함하고 있는 객체들을 list에서
		   찾음
		3> 화면에 검색된 객체들을 출력함*/
	}

	public void saveListFile() {
		try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			for(int i = 0; i < arrayList.size(); i++){
				object.writeObject(arrayList.get(i));
			}
			object.flush();
			System.out.println("board_list.dat에 성공적으로 저장되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*>> 구현내용
		1> list에 저장된 정보를 board_list.dat 파일에 
		   ObjectOutputStream 클래스 사용하여 기록 저장함
		   try with resource 문 사용할 것
		2> "board_list.dat 에 성공적으로 저장되었습니다." 출력*/
	}

	public void sortList(int item, boolean isDesc) {
		
		System.out.println(item+","+isDesc);
		switch (item) {
		case 1: // 번호
			if(isDesc==true){ // 내림차순
				System.out.println("번호 : 내림차순 정렬");
				arrayList.sort(new DescBoardNo());
			}else{ // 오름차순
				System.out.println("번호 : 오름차순 정렬");
				arrayList.sort(new AscBoardNo());
			}
			break;
		case 2: // 날짜
			if(isDesc==true){ // 내림차순
				arrayList.sort(new DescBoardDate());
			}else{ // 오름차순
				arrayList.sort(new AscBoardDate());
			}		
			break;
		case 3: // 제목
			if(isDesc==true){ // 내림차순
				arrayList.sort(new DescBoardTitle());
			}else{ // 오름차순
				arrayList.sort(new AscBoardTitle());
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		/*>> 구현내용
		1> item 이 1이면 번호순 정렬
		    item 이 2이면 날짜순 정렬
		    item 이 3이면 제목순 정렬 작동되게 정렬용 클래스 사용함
		2> isDesc 가 true 이면 내림차순정렬 작동
		    isDesc 가 false 이면 오름차순정렬 작동되게 함*/
	}

	

}
