package chapter03.switchiftest;

import java.util.Scanner;

public class SwitchCase_03 {

	public static void main(String[] args) {

		int month;
		int day;

		Scanner scan = new Scanner(System.in);

		System.out.println("월을 입력하세요(1~12):");
		month = scan.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12: {
			day = 31;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		case 2: {
			day = 28;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		case 4: {
			day = 30;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		case 6: {
			day = 30;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		case 9: {
			day = 30;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		case 11: {
			day = 30;
			System.out.println(month + "월음 " + day + "일 까지 있습니다.");
			break;
		}
		default: {
			day = 0;
			System.out.println("존재하지 않는 달입니다.");
		}

		}// switch
	}// main
}// class
