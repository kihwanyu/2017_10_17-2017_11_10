package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book b1 = new Book("Àè°úÄá³ª¹°", "À¯±âÈ¯", 50000);
		Book b2 = new Book("¼±³à¿Í³ª¹«²Û", "À¯±âÈ¯", 40000);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
		
		b2 = (Book) b1.clone();
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
	}

}
