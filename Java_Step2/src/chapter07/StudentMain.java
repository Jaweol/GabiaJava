package chapter07;

public class StudentMain {

	public static void main(String[] args) {

		// studentLee 이수정으로 설정 후 serialNum와 studentName 출력

		Student_03 studentLee = new Student_03();

		// student.studentName = "이수정";
		studentLee.setStudentName("이수정");
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentID);
		// studentLee.serialNum++;

		// Scanner scan = new Scanner(System.in);
		// System.out.println("이름을 입력하세요: ");
		// studentLee.studentName = scan.nextLine();
		// String studentName = JOptionPane.showInputDialog("학번");

		Student_03 studentKim = new Student_03();
		studentKim.setStudentName("김우성");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.serialNum); // 10001

		Student_03 studentPark = new Student_03();
		studentPark.setStudentName("박정우");
		System.out.println(studentPark.studentName);
		System.out.println(studentPark.serialNum); // 10002
	}

}
