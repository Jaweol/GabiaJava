package chapter07;

public class Guide_04 { // 관광 가이드 관리자
	// 멤버변수
	static String point;// 모든 관광객이 공유하는 여행 목적지 (예: "발리")
	Guest[] guest;// 관광객 여러 명을 담는 배열 (여러 명이니까 배열 형태)

	// 생성자
	public Guide_04(int n) {
		// 목적지
		point = "발리";
		// 관객객수 만큼 메모리 확보
		guest = new Guest[n]; // 배열

		for (int i = 0; i < n; i++) {
			guest[i] = new Guest();// 각각의 관광객 생성
		} // for

	}// 생성자
		// 메서드

	public static String getPoint() {
		return point;
	}

}
