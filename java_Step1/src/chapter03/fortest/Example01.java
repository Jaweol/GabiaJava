package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수(cnt)를 입력 받고,
		// 총점(sum)과 평균(avg)을 구하시오.(단, 평균은 실수로 출력할 것)

		// 변수
		// 인원수 입력
		// for

		Scanner scan = new Scanner(System.in);
		int i, sum = 0, cnt = 0, score;
		double avg = 0;

		System.out.println("몇 명의 성적을 알고싶어?");
		cnt = scan.nextInt();

		for (i = 1; i <= cnt; i++) {
			System.out.println(i + " 번째 성적 입력");
			score = scan.nextInt();
			sum += score;
		}
		avg = (double) sum / cnt;
		System.out.println(cnt + "명의 점수 총점" + sum + "점,평균은" + avg + "점입니다");

	}

}
