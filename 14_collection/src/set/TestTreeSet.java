package set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		//TreeSet test
		//�ڵ� �������� ���� ������ �Ǿ� ����
		
		TreeSet tset = new TreeSet();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("html");
		tset.add("css");
		
		System.out.println(tset);
		
		//��� ���� �ϳ��� ������ �빮�ڷ� �����ؼ� ���
		
		Iterator tIter = tset.iterator();
		
		while(tIter.hasNext()){
			System.out.println((String)tIter.next().toString().toUpperCase());
		}
		
		Object[] arr = tset.toArray();
		
		for(Object o : arr){
			System.out.println((String)o.toString().toUpperCase());
		}
	}
}
