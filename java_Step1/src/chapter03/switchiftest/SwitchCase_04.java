package chapter03.switchiftest;

import java.util.Scanner;

public class SwitchCase_04 {

	public static void main(String[] args) {
		// A,a -> 최우수고객
		// A,b -> 우수고객
		// 나머지 -> 일반고객

		Scanner scan = new Scanner(System.in);

		// charAt(0):String ->char
		char grade = scan.nextLine().charAt(0);

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("최우수고객");
			break;
		case 'B':
		case 'b':
			System.out.println("우수고객");
			break;
		default:
			System.out.println("일반고객");
			break;
		}

	}

}
