package part2.controller;

import part2.model.vo.Book;
import part2.model.vo.Galluxy;
import part2.model.vo.Product;
import part2.model.vo.SmartPhone;

public class Run2 {

	public static void main(String[] args) {
		//객체 배열에도 다형성 적용이 가능하다.
		Object[] arr = new Object[10];
		
		arr[0] = new String("문자열 객체");
		arr[1] = new java.util.Date();
		//arr[2] = new Product();
		arr[3] = new Book();
		arr[4] = new Galluxy();
		arr[5] = new SmartPhone();
		
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i] instanceof Galluxy){
				((Galluxy) arr[i]).printGalluxy();
			}
			else if(arr[i] instanceof SmartPhone){
				((SmartPhone) arr[i]).printSmartPhone();
			}
			else if(arr[i] instanceof Book){
				((Book) arr[i]).printBook();
			}
			else if(arr[i] instanceof Product){
				((Product) arr[i]).printProduct();
			}
		}
	}

}
