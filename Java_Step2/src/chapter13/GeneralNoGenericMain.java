package chapter13;

public class GeneralNoGenericMain {

	public static void main(String[] args) {

		// general
		GeneralNoGeneric g = new GeneralNoGeneric();

		// 정수형 배열
		Integer[] iArr = { 10, 20, 30, 40, 50 };
		g.printIntArr(iArr);

		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		g.printDoubleArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		g.printCharArr(cArr);

	}

}
