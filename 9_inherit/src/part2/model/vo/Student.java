package part2.model.vo;

public class Student extends Person {
	
	private double score;
	private String grade;
	private int rank;
	private String major;
	
	public Student(){
		super(); 
		// �����Ͻ� JVM�� �ڵ����� ��������,
		// �θ��� �⺻�����ڸ� ȣ��
		// �ݵ�� ù�ٿ� ����ؾ���.
		System.out.println("StudentŬ���� �⺻ ������ �����");
	}

	public Student(String name, int age, char gender, String phone, String address, double score, String grade,
			int rank, String major) {
		super(name, age, gender, phone, address);
		this.score = score;
		this.grade = grade;
		this.rank = rank;
		this.major = major;
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [ "+", toString()="+super.toString() +"score=" + score + ", grade=" + grade + ", rank=" + rank + ", major=" + major + 
				 "]";
	}
	@Override
	public Object clone() {
		return new Student(getName(), getAge(), getGender(), getPhone(), getAddress(), score, grade, rank, major);
	}
}
