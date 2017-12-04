package part2.model.vo;

public class Run3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
	
		s1 = new Student("이순신", 20, '남', "100", "의정부", 5.5, "1", 1, "1");
		System.out.println(s1);
		
		Student s2 = (Student) s1.clone();
		System.out.println(s2);
	}

}
