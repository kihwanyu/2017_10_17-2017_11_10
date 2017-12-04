package testGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics1 {

	public static void main(String[] args) {
		//컬렉션에서는 (List, Set, Map) 여러 종류의 객체를 저장함
		List list = new ArrayList();
		
		list.add(new String("Object saved"));
		list.add(new Book());
		list.add(new Car());
		list.add(new Score());
		
		for(int i = 0; i < list.size(); i++){
			Object obj = list.get(i);
			if(obj instanceof Book){
				
			} else if(obj instanceof Score){
				
			} else if(obj instanceof Car){
				
			}
		}
	}
	
}

