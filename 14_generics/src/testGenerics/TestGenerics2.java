package testGenerics;

import java.util.ArrayList;

public class TestGenerics2 {

	public static void main(String[] args) {
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		//컬렉션에 한가지 종류의 객체만 저장할 떄 사용함
		//꺼내서 ㅅ용할 때 객체 레퍼런스의 형변환을 하지 않아도 됨
		
		ArrayList<Book> list_b = new ArrayList<Book>();
		
		list_b.add(new Book());
		list_b.add(new Book());
		
		
	}

}
