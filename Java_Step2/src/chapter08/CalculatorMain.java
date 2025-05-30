package chapter08;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 방법1
		Example[] calculators = { new CalPlus(), new CalMinus() };

		System.out.println("점수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.println("점수B를 입력하세요: ");
		int b = s.nextInt();

		for (Example ca : calculators) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
		}

		System.out.println();

		// 방법2
		// Example e=new CalPlus();->이렇게 한것과 같음
		int plus = calc(new CalPlus(), a, b);
		System.out.println(plus);
		int minus = calc(new CalMinus(), a, b);
		System.out.println(minus);

		// 방법3
		System.out.println(calc(new CalPlus(), a, b));
		System.out.println(calc(new CalMinus(), a, b));

	}

	public static int calc(Example c1, int a, int b) {
		return c1.getResult(a, b);

	}

}
