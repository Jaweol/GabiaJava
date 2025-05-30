package practice01;

public class Test3 {

	// 메서드1 : 배열 받아서 출력
	public static void printScores(int[] scores) {
		for (int score : scores) {
			System.out.println(score);
		}
	}

	// 메서드2 : 배열 받아서 평균 계산
	public static double calculateAverage(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return (double) sum / scores.length;
	}

	public static int findMax(int[] scores) {
		int max = scores[0];
		for (int score : scores) {
			if (score > max) {
				max = score;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] scores = { 90, 80, 70, 100 }; // main에서 배열 생성!

		printScores(scores); // 배열 전달
		double avg = calculateAverage(scores); // 배열 또 전달
		System.out.println("평균: " + avg);

		int max = findMax(scores);
		System.out.println("최대값: " + max);
	}
}