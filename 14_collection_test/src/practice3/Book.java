package practice3;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5983973208358732002L;
	
	private String bNo;
	private int cartegory;
	private String title;
	private String author;
	
	public Book(){
		super();
	}
	
	public Book(String bNo, int cartegory, String title, String author) {
		super();
		this.bNo = bNo;
		this.cartegory = cartegory;
		this.title = title;
		this.author = author;
	}
	
	
	
	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCartegory() {
		return cartegory;
	}

	public void setCartegory(int cartegory) {
		this.cartegory = cartegory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", cartegory=" + cartegory + ", title=" + title + ", author=" + author + "]";
	}
	
	
	/*- bNo : String	//도서번호
	- category : int   //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	- title : String	//책제목
	- author : String	//저자
*/}
