package chapter03.fortest;

import java.util.Scanner;

public class ForTest_03 {

	public static void main(String[] args) {

		// 합계가 입력받은 수를 초과하면 반복문을 멈춤

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = scan.nextInt();
		int i, sum = 0;

		// (i = 1;; i++)여기서 ;; 이건 "; 이사이에 ;" 조건이 들어가야하는데 비어둠 왜냐 조건없이 무한반복하기위해.
		// 그리고 멈추는 조건은 if문으로 (sum > num)을 입력해서 sum이 사용자가 입력한 num보다 크면 break;로 반복 종료
		for (i = 1;; i++) { // i는 1부터 시작해서 1씩 계속 증가
			if (sum > num) { // sum이 num보다 크면 멈춤
				break;
			} // if
			sum += i; // i값을 sum에 더함
			System.out.print(i + " "); // i출력
		} // for
		System.out.println();
		// 후위연산 사용시 전위연산으로 -1 해줘야함
		System.out.println("1~" + (i - 1) + "까지의 총합:" + sum);

	}

}
