package chapter04;

public class ArrayTest_01 {

	public static void main(String[] args) {

		// 배열 선언 방식, 초기화 방법, 그리고 배열 값 출력

		// 1
		int[] number = new int[5];
		// 2(권장)
		int[] number2;
		number2 = new int[10];

		// 초기화
		// int[] number3=new int[] {1,2,3,4,5,6,7,8,9,10};//방법1
		int[] number3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 방법2 new int[]->이부분 삭제해서 사용해도 됨
		int number4[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 방법3

		for (int i = 0; i < number3.length; i++) {
			System.out.println(number3[i]);// int i가 number3의 첨자처럼 사용 가능

		}

	}

}
