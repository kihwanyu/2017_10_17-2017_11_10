package part2.controller;

import part2.model.vo.Book;
import part2.model.vo.Galluxy;
import part2.model.vo.Product;
import part2.model.vo.SmartPhone;

public class Run2 {

	public static void main(String[] args) {
		//��ü �迭���� ������ ������ �����ϴ�.
		Object[] arr = new Object[10];
		
		arr[0] = new String("���ڿ� ��ü");
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
