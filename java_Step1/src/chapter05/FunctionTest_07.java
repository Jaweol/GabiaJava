package chapter05;

public class FunctionTest_07 {

	public static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

		System.out.println("swap() 결과값: X=" + x + ",y");

	}//

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("swap()호출전 a: " + a + ",b: " + b);

		swap(a, b); // call by reference
		System.out.println("swap()호출후 a: " + a + ",b: " + b);

	}

}
