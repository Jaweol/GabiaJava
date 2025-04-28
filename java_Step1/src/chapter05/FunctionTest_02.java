package chapter05;

import javax.swing.JOptionPane;

public class FunctionTest_02 {

	// 메서드 (함수)
	// (int num1, int num2)->매개변수
	public void sum(int num1, int num2) { // 객수랑 타입이 반드시 일치해야함
		int sum = num1 + num2;
		System.out.println("두수의합: " + sum);

	}

	public static void main(String[] args) {

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));

		// int sum = a + b;
		// System.out.println("두수의합: " + sum);

		// FunctionTest_02의 객체 생성
		FunctionTest_02 obj = new FunctionTest_02();
		obj.sum(a, b); // 호출시 사용되는 매개변수 a와b는 실 값이 정의 되어 있으므로 실매개변수

	}

}
