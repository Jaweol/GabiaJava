package chapter03.fortest;

public class ForTest_10 {

	public static void main(String[] args) {
		System.out.println("▶3행 4열 숫자 그리드 만들기");

		int num = 1;

		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(num + "\t");
				num++;
			} // in for
			System.out.println();
		} // out for

		// num은 1부터 시작해서 계속 1씩 증가하며 출력됨.
		// in for는 3번 반복 → 행 (줄 수)
		// out for는 4번 반복 → 열 (한 줄에 4개 숫자)
		// \t는 탭(tab) → 숫자 사이 간격을 일정하게 해줌

	}// m

}// c
