package chapter03.fortest;

public class ForTest_11 {

	public static void main(String[] args) {
		// 주사위 두개의 합계 데이터 출력

		System.out.println("두개의 주사의 합계 테이블(6X6)");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print((1 + j) + "\t");
			} // in
			System.out.println();

		} // out

	}// m

}// c
