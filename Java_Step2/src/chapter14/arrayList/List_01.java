package chapter14.arrayList;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		// ArrayList<String> student=new ArrayList<String>();
		List<String> students = new ArrayList<String>();

		students.add("Alice");
		students.add("Fay");
		students.add("Sarah");
		students.add("Hazel");

		// 학생출력
		System.out.println("Student in the list: ");
		for (String student : students) {
			System.out.println(student);
		}

		// 특정 학생을 제거
		students.remove("Sarah");

		System.out.println("\nAfter removing Bob: ");
		for (String student : students) {
			System.out.println(student);
		}

	}

}
