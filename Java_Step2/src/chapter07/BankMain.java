package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		// 일산점 031-123-5678 이자율 5.3f
		// 종로점 02-852-9856

		String point = JOptionPane.showInputDialog("지점명");
		String tel = JOptionPane.showInputDialog("전화번호");

		Bank02 bank = new Bank02(point, tel);

		Scanner scan = new Scanner(System.in);
		System.out.println(point + "지점의 퇴직연금의 이자를 입력하세요");
		Bank02.interest = scan.nextFloat(); // 클래스 이름 or bank.interest = scan.nextFloat();
		bank.getBank();

	}

}
