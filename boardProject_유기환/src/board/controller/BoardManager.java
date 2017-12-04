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
		
		String boardTitle;	//�Խñ� ����
		String boardWriter;	//�ۼ��ھ��̵�
		Date boardDate;	//�ۼ���¥
		String boardContent; //�۳���
		
		/*arrayList.add(new Board(0, "a�ȳ��ϼ���?", "����ȯ", new Date(), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(1, "d�ȳ��ϼ���?", "����ȯ", new Date(3000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(2, "b�ȳ��ϼ���?", "����ȯ", new Date(2000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(4, "c�ȳ��ϼ���?", "����ȯ", new Date(1000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(3, "4�ȳ��ϼ���?", "����ȯ", new Date(5000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(5, "1�ȳ��ϼ���?", "����ȯ", new Date(6000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(7, "2�ȳ��ϼ���?", "����ȯ", new Date(7000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));
		arrayList.add(new Board(6, "3�ȳ��ϼ���?", "����ȯ", new Date(8000L), "�ݰ����ϴ�, ����ȯ�Դϴ�.", "0"));*/
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.print("�� ���� : ");
		boardTitle = sc.nextLine();
		System.out.print("�ۼ��� : ");
		boardWriter = sc.nextLine().replace(" ", ""); // ���ڿ��� ������ �����Ѵ�.
		
		boardDate = new Date();
		System.out.println("�۳��� : ");
		do{
			boardContent = sc.nextLine();
			if(!boardContent.equals("exit")){
				sb.append(boardContent);
				sb.append('\n');
			}
		} while (!boardContent.equals("exit"));
		arrayList.add(new Board(arrayList.size(), boardTitle, boardWriter, boardDate, sb.toString(), "0"));
		/*
		>> ��������
		1> "�� �Խñ� ���� �Դϴ�." ���
		2> "������ : " >> �Է¹���(��������)
		3> "�ۼ��� : " >> �̸� �Է¹��� (�������)
		4> �ۼ���¥�� ���� ��¥�� �Է�ó����
		5> "�۳��� : " >> ���� �ٷ� �Է¹���
				"exit" �Է��ϸ� �Է�����
		6> Board ��ü ������ �ʱⰪ���� �����
		7> list�� �߰���*/
	}

	public void displayAllList() {
		for(Board b : arrayList ){
			System.out.println(b);
		}
		/*>> ��������
		1> list �� ��ϵ� ������ ��� ȭ�鿡 ��½�Ŵ*/
	}

	public void displayBoard() {
		int boardNo;	//�Խñ� ��ȣ
		Board temp;
		int count;
		System.out.print("��ȸ�� �۹�ȣ : ");
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
		/*>> ��������
		1> "��ȸ�� �۹�ȣ : " >> �Է¹���
		2> �ش� �۹�ȣ�� ���� �Խñ��� ȭ�鿡 ��½�Ŵ
		3> �ش� �ۿ� ���� ��ȸ�� 1���� ó����*/
	}

	public void modifyTitle() {
		int boardNo;	//�Խñ� ��ȣ
		String boardTitle;
		Board temp;
		System.out.print("������ �۹�ȣ : ");
		boardNo = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.println("������ ���� : ");
				boardTitle = sc.nextLine();
				temp = arrayList.get(i);
				temp.setBoardTitle(boardTitle);
				arrayList.set(i,temp);
			}
		}
		/*1> "������ �۹�ȣ : " >> �Է¹���
		2> �ش� �۹�ȣ�� ���� �Խñ��� ȭ�鿡 ��½�Ŵ
		3> "������ ���� : " >> �� ���� �Է¹��� >> ���񺯰�
		4> ����� ��ü ������ list�� �ش� ��ȣ ��ü�� ������*/
	}

	public void modifyContent() {
		StringBuilder sb = new StringBuilder();
		
		int boardNo;	//�Խñ� ��ȣ
		String boardContent;	//�۳���
		Board temp;
		System.out.print("������ �۹�ȣ : ");
		boardNo = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.println("������ ���� : ");
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
		/*>> ��������
		1> "������ �۹�ȣ : " >> �Է¹���
		2> �ش� �۹�ȣ�� ���� �Խñ��� ȭ�鿡 ��½�Ŵ
		3> "������ ���� : " >> �� ���� �Է¹��� >> ���뺯��
		4> ����� ��ü ������ list�� �ش� ��ȣ ��ü�� ������*/

	}

	public void deleteBoard() {
		int boardNo;	//�Խñ� ��ȣ
		
		System.out.print("������ �۹�ȣ : ");
		boardNo = sc.nextInt();
		char option; 
		sc.nextLine();
		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardNo()==boardNo){
				System.out.println(arrayList.get(i));
				System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N)");
				option = sc.next().charAt(0);
				sc.nextLine();
				if(option=='y'||option=='Y'){
					arrayList.remove(i);
					System.out.println(i+" �� ���� �����Ǿ����ϴ�.");
				} else {
					System.out.println("������ ��ҵǾ����ϴ�.");
				}
			}
		}
		/*>> ��������
		1> "������ �۹�ȣ : " >> �Է¹���
		2> �ش� �۹�ȣ�� ���� �Խñ��� ȭ�鿡 ��½�Ŵ
		3> "������ �����Ͻðڽ��ϱ�? (y/n) : " 
		    >> 'Y'�Է½� list���� �ش� ��ü ������
		4> "oo�� ���� �����Ǿ����ϴ�." ���*/
	}

	public void searchBoard() {
		String boardTitle;	//�Խñ� ����
		
		System.out.print("�˻��� ���� : ");
		boardTitle = sc.nextLine();

		for(int i = 0 ; i < arrayList.size(); i++){
			if(arrayList.get(i).getBoardTitle().equals(boardTitle)){
				System.out.println(arrayList.get(i));
			}
		}
		/*>> ��������
		1> "�˻��� ���� : " >> �˻��� ���ڸ� �Է¹���
		2> �Էµ� ���ڸ� �������� �����ϰ� �ִ� ��ü���� list����
		   ã��
		3> ȭ�鿡 �˻��� ��ü���� �����*/
	}

	public void saveListFile() {
		try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			for(int i = 0; i < arrayList.size(); i++){
				object.writeObject(arrayList.get(i));
			}
			object.flush();
			System.out.println("board_list.dat�� ���������� ����Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*>> ��������
		1> list�� ����� ������ board_list.dat ���Ͽ� 
		   ObjectOutputStream Ŭ���� ����Ͽ� ��� ������
		   try with resource �� ����� ��
		2> "board_list.dat �� ���������� ����Ǿ����ϴ�." ���*/
	}

	public void sortList(int item, boolean isDesc) {
		
		System.out.println(item+","+isDesc);
		switch (item) {
		case 1: // ��ȣ
			if(isDesc==true){ // ��������
				System.out.println("��ȣ : �������� ����");
				arrayList.sort(new DescBoardNo());
			}else{ // ��������
				System.out.println("��ȣ : �������� ����");
				arrayList.sort(new AscBoardNo());
			}
			break;
		case 2: // ��¥
			if(isDesc==true){ // ��������
				arrayList.sort(new DescBoardDate());
			}else{ // ��������
				arrayList.sort(new AscBoardDate());
			}		
			break;
		case 3: // ����
			if(isDesc==true){ // ��������
				arrayList.sort(new DescBoardTitle());
			}else{ // ��������
				arrayList.sort(new AscBoardTitle());
			}
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		/*>> ��������
		1> item �� 1�̸� ��ȣ�� ����
		    item �� 2�̸� ��¥�� ����
		    item �� 3�̸� ����� ���� �۵��ǰ� ���Ŀ� Ŭ���� �����
		2> isDesc �� true �̸� ������������ �۵�
		    isDesc �� false �̸� ������������ �۵��ǰ� ��*/
	}

	

}
