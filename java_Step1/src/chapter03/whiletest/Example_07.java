package chapter03.whiletest;

import java.util.Scanner;

public class Example_07 {

	public static void main(String[] args) {
		// 숫자 암호(3자리) 해제
		// 1.컴퓨터가 100~999 사이의 무작위 암호를 설정
		// 2.사용자가 맞출때까지 입력
		// 3.틀릴경우 "틀렸습니다. 다시 입력하세요"
		// 4.맞추면 "성공! 암호 해제 완료"
		// 5.몇번만에 맞췄는지 count 출력

		Scanner scan = new Scanner(System.in);
		int password = (int) (Math.random() * 900) + 100; // PC //(Math.random()은 0 이상 1 미만의 실수 값을 생성. 이를 900배 한 뒤, 100을
															// 더하여 100 이상 999 이하의 3자리 수를 랜덤하게 생성합니다. 이것이 암호가 됨.)
		int userinput;
		int count = 0;

		System.out.println("암호해제게임->3자리수");

		do {
			System.out.println("암호를 입력하세요");
			userinput = scan.nextInt();
			count++;

			if (userinput < password) {
				System.out.println("더 큰 수를 입력");
			} else if (userinput > password) {
				System.out.println("더 작은 수 입력");
			}

		} while (password != userinput);

		System.out.println("성공! 암호 해제 완료(시도 횟수:" + count + "번)");

	}

}
