package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension_10 {

	public static void main(String[] args) {

		int n = 0;

		int javaScore[][] = new int[2][3];

		for (int i = 0; i < javaScore.length; i++) { // 2행
			for (int j = 0; j < javaScore[i].length; j++) {// 3열
				// 입력
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("점수입력"));
				// 입력받은 점수를 대입연산을 이용하여 javascore에 저장
				System.out.println("javaScore[" + i + "][" + j + "] : " + (javaScore[i][j] = jumsu));
			}
			System.out.println();

		}

	}

}
