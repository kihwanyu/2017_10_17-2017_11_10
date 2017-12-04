package list.listTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;


public class TestArrayList {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(10);
		
		
		//ArrayList는 저장 순서가 유지됨 : index(순번)적용
		
		arrayList.add("apple");
		arrayList.add("123"); // 값 -> 객체 : boxing (Auto boxing)
		//중복 저장을 허용함.
		arrayList.add(new Integer(123));
		arrayList.add(45.67);
		//원하는 위치에 추가를 할 수 있다.
		//추가를 하는 경우에는 인데스 위치에 덮어쓰는 것이 아니고, 하나씩 인덱스가 뒤로 밀린다.
		arrayList.add(1, "바나나");
		System.out.println(arrayList);
		//인덱스가 저장되기 때문에 for문을 이용해서 출력할 수 있다.
		
		//저장된 객체를 삭제
		arrayList.remove(2);
		//저장된 객체를 수정
		arrayList.set(0, "수박");
		for(int i = 0 ; i < arrayList.size(); i++){
			System.out.println(i+" : "+arrayList.get(i));
		}
		
		ArrayList list = new ArrayList();
		
 		
 		list.add("goguma");
 		list.add("apple");
 		list.add("banana");
 		
 		
 		
 		for(int i = 0 ; i < list.size(); i++){
			System.out.println(i+" : "+list.get(i));
		}
		//오름차순 정렬
 		Collections.sort(list);
 		
 		for(int i = 0 ; i < list.size(); i++){
			System.out.println(i+" : "+list.get(i));
		}
 		//내림차순 정렬
 		Iterator iter = new LinkedList(list).descendingIterator();
 		while(iter.hasNext()){
 			System.out.println(iter.next());
 		}
	}

}
