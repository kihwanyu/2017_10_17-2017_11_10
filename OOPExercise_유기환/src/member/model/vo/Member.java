package member.model.vo;

public class Member {
	private String id;//아이디       
	private String pw;//패스워드     
	private String name;//이름   
	private int age;//나이 
	private char gender;//성별   
	private String email;//이메일
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Member(String id, String pw, String name, int age, char gender, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email="
				+ email + "]";
	}
	
}
