package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book b1 = new Book("����ᳪ��", "����ȯ", 50000);
		Book b2 = new Book("����ͳ�����", "����ȯ", 40000);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
		
		b2 = (Book) b1.clone();
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
	}

}
