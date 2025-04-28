package chapter03.fortest;

public class ForTest_01 {

	public static void main(String[] args) {
		// 1~10까지의 합

		// **누적(=계속 더함)의 개념을 보여주기 위한 예시
		int sum = 0;
		// 누적 변수방
		sum = sum + 1;

		sum += 2; // => sum = sum+2 **

		System.out.println(sum);

		// for (초기식; 조건식; 증감식) {
		// 반복 실행 블록
		// }

		// for문에서는 전위연산보단 후위연산을 주로 사용한다(결과적으로 차이가 없는 것처럼 동작. 값을 사용하지 않고 그냥 증가만 시키는 목적이기
		// 때문에)
		int i; // index 변수방
		System.out.println("1부터 10까지의 수 출력");
		for (i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.println("----------------");
		int k; // index 변수방
		System.out.println("1부터 10까지의 수 출력");
		for (k = 0; k < 10; ++k) {
			System.out.print((k + 1) + " ");
		}

	}

}
