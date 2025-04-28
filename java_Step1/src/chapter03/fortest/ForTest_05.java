package chapter03.fortest;

import java.util.Scanner;

public class ForTest_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i;
		System.out.println("0보다 크면서 11보다 작은 숫자를 입력: ");
		int a = scan.nextInt();

		if (a > 0 && a < 11)
			for (i = 1; i <= a; i++) {
				System.out.println("soldesk Java");
			} // for

	}

}
