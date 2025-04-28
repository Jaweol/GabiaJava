package chapter03.fortest;

public class ForTest_09 {

	public static void main(String[] args) {
		System.out.println("▶ 역삼각형 별 출력");

		for (int i = 5; i >= 1; i--) { // 줄 수
			for (int j = 1; j <= i; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println();// 줄바꿈

			// 바깥 for: 총 5줄 출력 (위에서 아래로)
			// 안쪽 for: 각 줄마다 별 개수를 i에 맞춰서 출력
			// 결과적으로 별이 점점 줄어드는 역삼각형 모양이 완성됨!

		}

	}

}
