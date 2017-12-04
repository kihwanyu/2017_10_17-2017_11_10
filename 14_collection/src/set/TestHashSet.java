package set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Object> hset = new HashSet<>();
		hset.add("hello");
		//다형성 적용하여 상위 레퍼런스 사용 가능함.
		hset.add(new String("java"));
		hset.add(123);
		hset.add(new Double(45.67));
		hset.add(new Date());
		hset.add(123);
		System.out.println(hset.toString());
		//toStirng 오버라이딩 메소드
		//저장 순서가 유지 안된다.
		
		//중복 허용 하지 않음
		hset.add(123);
		hset.add("java");
		System.out.println("저장된 객체수 : " + hset.size());
		System.out.println("포함 확인 : " + hset.contains(new Integer(123)));
		
		//저장된 객체를 하나씩 꺼내는 기능이 없음
		//1. toArray()로 배열로 바꾸고 for loop 사용
		
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		hset.remove(123);
		
		System.out.println("hset : " + hset.toString());
		
		hset.clear();
		
		System.out.println("hset : " + hset.toString());
	}

}
