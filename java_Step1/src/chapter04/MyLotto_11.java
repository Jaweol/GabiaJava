package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto_11 {

	public static void main(String[] args) {
		// 로또 추첨기 프로그램

		int number;
		int cnt = 0;
		int[] lotto = new int[6];

		System.out.println("===이번주 로또 예상번호====");

		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟수를 입력"));

		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "]: ");

			outer: for (int i = 0; i < lotto.length;) { // i++을 여기에 사용시
				lotto[i] = new Random().nextInt(45) + 1;

				// 중복성 제거
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						continue outer;// 분기점으로 이동//i--로 마이너스해주는 방법으로도 사용도 가능
					} // if
				} // for
				System.out.print(lotto[i] + " ");
				i++;
			}
			cnt++;
			System.out.println();
		} // while

	}

}
