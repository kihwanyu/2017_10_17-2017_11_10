package part2.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String address;

	public Person() {
		super();
		//�⺻ �����ڸ� ���� �ۼ����� ������ ��ӽ� ���� �߻�
		System.out.println("PersonŬ���� �Ű������� ���� �⺻ ������ �����..");
	}

	public Person(String name, int age, char gender, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;System.out.println("PersonŬ���� �Ű������� �ִ� �⺻ ������ �����..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + ", address="
				+ address + "]";
	}
	@Override
	public Object clone() {
		return new Person(name, age, gender, phone, address);
	}
}
