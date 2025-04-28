package chapter05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyLotto_14 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력"));
		int cnt = 0;
		System.out.println();

		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "]");
			int[] lotto = new int[6];
			int index = 0;

			while (index < 6) {
				int num = (int) (Math.random() * 45) + 1;
				if (!contains(lotto, num)) { // 중복체크
					lotto[index++] = num;
				} // if

			} // while 로또 번호 6개 뽑기

			Arrays.sort(lotto);

			for (int num : lotto) {
				System.out.println(num + " ");

			}
			System.out.println();
			cnt++;
		}
	}

//-------------------------------------------------------------------------------
	// 중복체크 접수하는 메소드
	public static boolean contains(int[] arr, int num) {
		for (int i : arr) { // 배열방에 없는 숫자==방금 받은 숫자
			if (i == num) { // 배열방
				return true; // 중복숫자 발견

			}
		}
		return false;

	}
}
