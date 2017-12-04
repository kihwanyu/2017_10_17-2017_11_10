package practice2;

import java.util.Comparator;

public class AscCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getCartegory() == o2.getCartegory()){
			return 0;
		}
		if(o1.getCartegory() > o2.getCartegory()){
			return 1;
		}
		if(o1.getCartegory() < o2.getCartegory()){
			return -1;
		}
		return 0;
	}

}
