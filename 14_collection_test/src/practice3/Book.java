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
	
	
	/*- bNo : String	//������ȣ
	- category : int   //�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ)
	- title : String	//å����
	- author : String	//����
*/}
