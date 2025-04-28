package chapter04;

public class EnhancedForLoop_12 {

	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40, 50 };
		// EnhancedFor
		for (int num : numbers) {
			System.out.println(num + " ");
		}

		System.out.println();

		int num[] = { 5, 10, 15, 20, 25 };
		int sum = 0;

		for (int num1 : num) {
			System.out.println(num1 + " ");
			sum += num1;
		}
		System.out.println("합계" + sum);

	}

}
