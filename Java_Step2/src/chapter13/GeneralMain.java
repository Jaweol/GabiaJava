package chapter13;

public class GeneralMain {

	public static void main(String[] args) {

		// general
		General g = new General();

		// 정수형 배열
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		g.printArr(iArr);

		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		g.printArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		g.printArr(cArr);

	}

}
