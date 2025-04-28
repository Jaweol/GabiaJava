package chapter03.iftest;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		char grade = ' ';
		int jumsu;
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("java평가점수"));

		if (jumsu >= 90) {
			System.out.println('A');
		} else if (jumsu >= 80) {
			System.out.println('B');
		} else if (jumsu >= 70) {
			System.out.println('C');
		} else {
			System.out.println('F');
		}

		if (jumsu > 100 || jumsu < 0) {
			System.out.println("없는점수");
		} else if (jumsu >= 90) {
			grade = 'A';
			System.out.println("최우수");
		} else if (jumsu >= 80) {
			grade = 'B';
			System.out.println("우수");
		}

	}

}
