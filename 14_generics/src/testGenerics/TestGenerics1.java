package testGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics1 {

	public static void main(String[] args) {
		//�÷��ǿ����� (List, Set, Map) ���� ������ ��ü�� ������
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

