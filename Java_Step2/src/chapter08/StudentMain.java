package chapter08;

public class StudentMain {

	public static void main(String[] args) {

		Student s = new Student("홍길동", "01040517651", 1000);
		System.out.println("name: " + s.name);
		System.out.println("ssn: " + s.ssn);
		System.out.println("number: " + s.studentNo);

	}

}
