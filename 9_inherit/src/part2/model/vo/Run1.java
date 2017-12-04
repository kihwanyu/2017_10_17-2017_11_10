package part2.model.vo;

public class Run1 {

	public static void main(String[] args) {
		/*Person p = new Person("홍길동",20,'남',"010-1424-2321","서울특별시");
		System.out.println(p.toString());*/
		Student s1 = new Student("홍길동",20,'남',"010-1424-2321","서울특별시",0.0,"1",1,"1");
		
		/*private double score;
		private String grade;
		private int rank;
		private String major;*/
		System.out.println(s1.toString());
	}

}
