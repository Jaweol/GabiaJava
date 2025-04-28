package chapter03.whiletest;

import java.util.Scanner;

public class Example_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true; // 반복문을 계속 돌릴지 결정하는 변수
		int num, cnt; // num: 메뉴 선택 번호, cnt: 빵 개수
		String str; // str: 빵 종류

		while (run) { // run이 true일 때 계속 반복
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			// 번호입력 받기
			num = Integer.parseInt(scan.nextLine());// nextLine()으로 입력을 받고, Integer.parseInt()로 숫자로 바꿔줌

			switch (num) {

			case 1:// 빵의 개수 입력받기
				System.out.println("빵의 개수");
				cnt = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < cnt; i++) { // for (초기값; 조건; 변화)
					System.out.println("빵 " + (i + 1) + "개");
				}
				System.out.println("빵" + cnt + "개가 완성 되었");
				break;

			case 2:
				// 빵의 개수 입력받기
				System.out.println("빵의 개수");
				cnt = Integer.parseInt(scan.nextLine());
				// 빵의 종류 입력받기
				System.out.println("빵의 종류");
				str = scan.nextLine();

				for (int i = 0; i < cnt; i++) {
					System.out.println(str + "빵 " + (i + 1) + "개");
				} // for
				System.out.println("요청하신" + cnt + "개의" + str + "빵이 완성되었습니다");
				break;

			case 3:
				System.out.println("프로그램 종료");
				run = false; // 사용자가 3번(종료)을 누르면 run = false가 돼서 반복문이 멈춤
				break;

			default:
				System.out.println("다시입력");
				break;

			}// s

		} // w

	}// m

}// c
