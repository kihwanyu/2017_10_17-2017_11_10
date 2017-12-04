package board.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4362218927502303303L;
	
	private int boardNo;	//게시글 번호
	private String boardTitle;	//게시글 제목
	private String boardWriter;	//작성자아이디
	private Date boardDate;	//작성날짜
	private String boardContent;	//글내용
	private String readCount;	//조회수
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
		1> 기본생성자, 매개변수 있는 생성자 작성
		2> 각 필드에 대한 getter and setter 추가
		3> toString() 메소드 오버라이딩 : 필드값 문자열 합치기 후 리턴함*/
}
