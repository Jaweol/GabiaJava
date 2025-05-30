package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		// 기본 생성자를 이용한 student1 객체 생성
		Student_07 student1 = new Student_07();
		// 기본 생성자를 이용한 student1 객체 생성
		student1.studentName = "김자월";
		student1.address = "응암";
		student1.showStudentInfo();

		// 생성자를 이용한 초기화
		System.out.println();
		Student_07 student2 = new Student_07("김자월", "응암");
		student2.showStudentInfo();

		// getter / setter
		Student_07 student3 = new Student_07();
		student3.setStudentName("김자월");
		student3.setAddress("응암");
		student3.showStudentInfo();

		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());

	}

}
