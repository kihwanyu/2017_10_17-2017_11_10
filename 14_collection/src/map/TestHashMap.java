package map;

import java.util.Date;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Object, Object> hashMap = new HashMap<>(); 
		//키와 값(value) 쌍으로 저장한다.
		
		//키와 값 둘다 반드시 객체여야 한다.
		
		hashMap.put(2,new Date());
		hashMap.put(12, "red apple");
		hashMap.put(33,12);
		
		System.out.println(hashMap.toString());
		
		// 키는 중복 저장되지 않는다(set) : 최근 키로 override됨 (덮어씀)
		hashMap.put(12, "yello banana");
		
		System.out.println(hashMap.toString());
		
		// 값 객체는 중복 저장을 허용한다.
		hashMap.put(1, "yello banana");
		
		System.out.println(hashMap.toString());
		
		//값 객체의 내용을 가져올 때
		System.out.println("키 9에 대한 객체 : " + hashMap.get(2));
		
		//키 값을 가지고 삭제처리를 할 때
		hashMap.remove(2);
		
		System.out.println(hashMap.toString());
		
		//저장된 객체 수를 확인 할 때
		System.out.println("hmap에 저장된 객체 수 : " + hashMap.size());
	}

}
