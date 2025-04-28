package chapter05;

import java.util.Scanner;

public class FunctionTest_05 {

	public static void EduStep(int step) {

		if (step == 1) {
			System.out.println("해당하는 스터디 단계 step1");
		} else if (step == 2) {
			System.out.println("해당하는 스터디 단계 step2");
		} else if (step == 3) {
			System.out.println("해당하는 스터디 단계 step3");
		} else {
			System.out.println("해당하는 스터디 단계없음");

		}

	}

	public static void main(String[] args) {

		// 입력받아서 number방에 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계입력: ");
		int number = scan.nextInt();

		EduStep(number);

	}

}
