package chapter03.whiletest;

public class Example_02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘

		/*
		 * 5! -> 5X4X3X2X1 =>n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		 */

		int number = 5;
		int factorial = 1; // 누적변수이므로 초기화 해줘야함 (곱셈에 대한 누적변수는 1로 초기화)

		while (number > 0) {
			factorial *= number;// factorial=factorial*number;
			number--;
		} // while
		System.out.println("팩토리얼 결과: " + factorial);

	}

}
