package chapter06;

public class StudentInfo {

	// 멤버변수
	int studentID;
	private String studenName;
	int grade;
	String address;

	// 생성자
	public StudentInfo() {

	}

	// 생성자 오버로딩
	public StudentInfo(int studentID, String studenName, int grade, String address) {
		this.studentID = studentID;
		this.studenName = studenName;
		this.grade = grade;
		this.address = address;

	}

	public String getStudenName() {
		return studenName;
	}

	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}

}
