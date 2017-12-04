package silsub3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements java.io.Serializable {
	private String tilte;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	
	public Book() {
		super();
	}

	public Book(String tilte, String author, int price, Calendar dates, double discountRate) {
		super();
		this.tilte = tilte;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일"); 
		String formatDate = sdf.format(dates.getTime());
		//System.out.println(formatDate);
		return "Book [tilte=" + tilte + ", author=" + author + ", price=" + price + ", dates=" + formatDate
				+ ", discountRate=" + discountRate + "]";
	}
	
}
