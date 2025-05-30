package chapter11;

import java.util.Scanner;

public class EnumMain {

	public enum Item {
		Start, Pause, Exit
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료]: ");

			int n = scan.nextInt();

			Item start = Item.Start; // start를 0정의
			Item pause = Item.Pause; // pause를 1정의
			Item exit = Item.Exit; // exit를 2정의

			if (n == start.ordinal()) {
				System.out.println("게임이 시작함");
			} else if (n == pause.ordinal()) {
				System.out.println("게임이 일시정지");
			} else if (n == exit.ordinal()) {
				System.out.println("게임종료");
			} else {
				System.out.println("잘못된선택");
				return;
			} // if

		} // while

	}

}
