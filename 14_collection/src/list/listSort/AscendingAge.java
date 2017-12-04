package list.listSort;

import java.util.Comparator;

public class AscendingAge implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		int result = 0;
		if(o1.getAge() == o2.getAge()){
			result = 0;
		}
		if(o1.getAge() > o2.getAge()){
			result = 1;
		}
		if(o1.getAge() < o2.getAge()){
			result = -1;
		}
		return result;
	}

}
