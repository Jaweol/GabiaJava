package chapter03.switchiftest;

public class SwitchCase_06 {

	public static void main(String[] args) {

		int time = (int) (Math.random() * 10) + 9;
		System.out.println("[현재시간]: " + time + "시");
		System.out.print("할 일: ");

		switch (time) {
		case 9:
			System.out.println("백설이 산책하기~");
			break;
		case 10:
			System.out.println("백설이 밥주기~");
			break;

		default:
			System.out.println("휴식~~~");
		}

	}

}
