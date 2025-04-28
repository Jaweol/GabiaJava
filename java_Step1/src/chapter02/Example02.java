package chapter02;

public class Example02 {

	public static void main(String[] args) {
		
		///*soldesk 과수원
		// * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다.
		// * 과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고,
		// * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		// * (단, 평균값을 담는 데이터 타입은 float)로 정의한다.*//
		
		
		int 배=5;
		int 사과=7;
		int 오렌지=5;
		
		int result=(배+사과+오렌지);
		System.out.println("총 과일 수:" +result);
		System.out.println("평균 생산 수:" +result/24f);
		
		

		
	}

}
