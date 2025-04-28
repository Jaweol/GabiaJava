package chapter05;

import java.util.Scanner;

public class FunctionTest_06 {

	public static String EduStep(int edu) { // void가 있음 타입선언을 못함(String등)

		// switch

		String step = " ";

		switch (edu) {
		case 1:
			step = "초급";
			break;

		case 2:
			step = "중급";
			break;

		case 3:
			step = "고급";
			break;

		default:
			System.out.println("해당하는 스터디 단계없음");
			step = "0";
			break;

		}// switch

		return step;

	}// method

	public static void main(String[] args) {

		// 입력받아서 number방에 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계입력: ");
		int number = scan.nextInt();

		// 1:초급 2:중급 3:상급
		String step = EduStep(number);
		System.out.println("현재 수업 단계 " + step + "단계 입니다");

	}

}
