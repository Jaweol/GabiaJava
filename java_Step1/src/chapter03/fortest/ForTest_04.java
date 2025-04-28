package chapter03.fortest;

public class ForTest_04 {

	public static void main(String[] args) {

		System.out.println("===0부터 100까지의 수 중 홀수의 합을 출력===");
		// #방법1 continue 문 사용
		int num;
		int total = 0;

		for (num = 1; num <= 100; num++) {

			if (num % 2 == 0) {
				continue; // continue는 무시라는 뜻(그냥 지나가라는 표시)(짝수를 출력할거니까 홀수를 무시해라)
			}
			System.out.print(num + " ");
			total += num;
		}
		System.out.println();
		System.out.println("0~100까지의 수 중 홀수의 합;" + total);
		System.out.println("====================================");

		// #방법2 홀수 조건을 직접 사용
		int sum = 0;
		// i를 for문 안에서 선언하면, i는 그 for문 안에서만 쓰일 변수라는 것
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("0~100까지의 수 중 홀수의 합;" + sum);
		System.out.println("=====================");

		// #방법3 k += 2를 입력해서 2씩 증가시키기(처음부터 홀수만 찍는=>k=1+2=3...5...7...9)
		int hap = 0;
		for (int k = 1; k <= 100; k += 2) {
			hap += k;
		}
		System.out.println("0~100까지의 수 중 홀수의 합:" + sum);

	}

}
