package chapter03.whiletest;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0; // 예금(+) 출금(-)

		Scanner scan = new Scanner(System.in);
		// 1.예금 | 2.출금 | 3.잔고 |4.종료
		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = scan.nextInt();

			// 선택한 값으로 은행업무 수행
			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				int money = scan.nextInt();
				balance += money; // (입력한)예금액만큼 잔고를 증가시킴
				break;
			case 2:
				System.out.println("출금액> ");
				int money2 = scan.nextInt();
				balance -= money2; // 출금액만큼 잔고를 감소시킴
				break;

			case 3:
				System.out.println("잔액> ");
				System.out.println(balance); // 현재 잔고 출력
				break;

			case 4:
				run = false; // run을 false로 바꾸면 while문 종료(4번 선택시)
				break;

			}// switch
			System.out.println();
		} // while
		System.out.println("프로그램 종료");

	}

}
/*
 * 나이 int age=scan.nextInt(); 성별 String gen=scan.nextLine();
 * 
 * 나이>29 enter 성별>enter
 * 
 * system.out.print("나이: ");
 * 
 * 
 * 
 * 
 */
