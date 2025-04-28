package chapter04;

public class ArgsTest_02 {

	public static void main(String[] args) {
		// 배열의 선언

		int a[] = new int[5]; // int형 값을 저장할 수 있는 배열 a

		int[] b; // b라는 이름의 배열을 먼저 선언만
		b = new int[50]; // 여기서 50칸짜리 배열로 초기화-> int[] b = new int[50]; 이거랑같음
//---------------------------------------------------------------------------------------------
		args = new String[2]; // 문자열 배열
		args[0] = "10"; // [0]첨자의 요소로 10
		args[1] = "20"; // [1]첨자의 요소로 20

		String sum = args[0] + args[1];
		System.out.println("문자열의 병합:" + sum);// 결과는 1020으로 나옴 합이 아닌 문자열로 읽음
		// ----------------------//
		// 문자열 → 정수로 변환 (Integer.parseInt()는 문자열을 숫자(int)로 바꿔주는 함수)

		int aVal;
		int bVal;

		if (args.length == 2) {
			aVal = Integer.parseInt(args[0]);// "10"->이게 ""으로 String문자열 형태이므로 Integer.parseInt로 형변환해줘야함.
			bVal = Integer.parseInt(args[1]);// "20"
		} else {
			aVal = 0;
			bVal = 0;
		}
		int Total = aVal + bVal;
		System.out.println("산술연산: " + Total);

	}

}
