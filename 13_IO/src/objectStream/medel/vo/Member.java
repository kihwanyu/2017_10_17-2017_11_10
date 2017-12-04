package objectStream.medel.vo;

// MVC 디자인 패턴 : Model View Controller
// Model 의 vo(value object)에 해당하는 클래스
// vo : 값 기록 저장용 클래스
// vo == dto(data transfer object) == bean == do(domain object) == entity

//bean 클래스가 되기 위한 조건
//1.모든 필드가 반드시 private 이어야한다.
//2. 반드시 기본생성자와 매개변수 있는 생성자(모든필드)를 가지고 있어야함.
//3. 모든 필드에 대해서 getter와 setter가 작성 되어 있어햐 함
//4. 반드시 직렬화처리 해 주어야함 implements java.io.Serializable
public class Member implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3942431933341802976L;
	
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	private transient double point;
	
	
	
	public Member() {
		super();
	}
	
	public Member(String userId, String userPwd, String userName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public Member(String userId, String userPwd, String userName, String email, int age, char gender, double point) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", point=" + point + "]";
	}
	
	
}
