package chapter07;

public class Student_03 {

	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student_03() {
		serialNum++;
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		return serialNum;
	}

}
