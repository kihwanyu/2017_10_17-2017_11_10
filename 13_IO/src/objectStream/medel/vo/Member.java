package objectStream.medel.vo;

// MVC ������ ���� : Model View Controller
// Model �� vo(value object)�� �ش��ϴ� Ŭ����
// vo : �� ��� ����� Ŭ����
// vo == dto(data transfer object) == bean == do(domain object) == entity

//bean Ŭ������ �Ǳ� ���� ����
//1.��� �ʵ尡 �ݵ�� private �̾���Ѵ�.
//2. �ݵ�� �⺻�����ڿ� �Ű����� �ִ� ������(����ʵ�)�� ������ �־����.
//3. ��� �ʵ忡 ���ؼ� getter�� setter�� �ۼ� �Ǿ� �־��� ��
//4. �ݵ�� ����ȭó�� �� �־���� implements java.io.Serializable
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
