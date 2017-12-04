package list.listSort;

import java.util.ArrayList;

public class CustomerManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("홍길동",25,'남',1250.42));
		list.add(new Customer("황진이",30,'여',2250.42));
		list.add(new Customer("이순신",35,'남',1750.42));
		
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" 이름 : 오름차순");
		// 이름 오름차순 정렬
		list.sort(new AscendingName());
		

		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" 이름 : 내림차순");
		// 이름 내름차순 정렬
		list.sort(new DescendingName());
		

		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" 나이 : 오름차순");
		// 나이 오름차순 정렬
		list.sort(new AscendingAge());
	
		for(Customer c : list){
			System.out.println(c);
		}
		System.out.println(" 나이 : 내림차순");
		// 나이 오름차순 정렬
		list.sort(new DescendingAge());
	
		for(Customer c : list){
			System.out.println(c);
		}
	}

}
