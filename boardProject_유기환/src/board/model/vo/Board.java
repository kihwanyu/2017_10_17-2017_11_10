package board.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4362218927502303303L;
	
	private int boardNo;	//�Խñ� ��ȣ
	private String boardTitle;	//�Խñ� ����
	private String boardWriter;	//�ۼ��ھ��̵�
	private Date boardDate;	//�ۼ���¥
	private String boardContent;	//�۳���
	private String readCount;	//��ȸ��
	public Board() {
		super();
	}
	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent,
			String readCount) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		this.readCount = readCount;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getReadCount() {
		return readCount;
	}
	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", boardDate=" + boardDate + ", boardContent=" + boardContent + ", readCount=" + readCount + "]";
	}
		/*
		1> �⺻������, �Ű����� �ִ� ������ �ۼ�
		2> �� �ʵ忡 ���� getter and setter �߰�
		3> toString() �޼ҵ� �������̵� : �ʵ尪 ���ڿ� ��ġ�� �� ������*/
}
