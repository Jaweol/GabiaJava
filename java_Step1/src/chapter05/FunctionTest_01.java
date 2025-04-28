package chapter05;

import javax.swing.JOptionPane;

public class FunctionTest_01 {

	// 메서드 (함수)
	// (int num1, int num2)->매개변수
	// static=어디서나 가져다 사용할수있다 but static이 없다면 객체를 만들어서 써야한다
	public static void sum(int num1, int num2) { // 객수랑 타입이 반드시 일치해야함
		int sum = num1 + num2;
		System.out.println("두수의합: " + sum);

	}

	public static void main(String[] args) {

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));

		// int sum = a + b;
		// System.out.println("두수의합: " + sum);

		sum(a, b); // 호출시 사용되는 매개변수 a와b는 실 값이 정의 되어 있으므로 실매개변수

	}

}
