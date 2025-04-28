package chapter03.iftest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 놀이공원에서는 12세 이상이거나 키가 140cm 이상이어야 놀이기구를 탈 수 있다. 사용자에게 나이와 키를 입력받아, 놀이기구를 탈 수
		 * 있는지 출력하는 프로그램을 if문으로 작성하세요
		 * 
		 * 나이를 입력하세요: 10 키를 입력하세요(cm): 145 => 탑승 가능합니다!
		 * 
		 * 나이를 입력하세요: 9 키를 입력하세요(cm): 130 => 탑승 불가입니다.
		 */
		// #1
		/*
		 * int age; int height;
		 * 
		 * 
		 * age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		 * height=Integer.parseInt(JOptionPane.showInputDialog("키를 입력하세요")); if(age>=12
		 * || height>=140) { System.out.println("탑승 가능합니다!"); } else {
		 * System.out.println("탑승 불가입니다.");
		 */

		// #2
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를입력");
		int age = scan.nextInt();

		System.out.println("키를 입력");
		int height = scan.nextInt();

		if (age >= 12 || height >= 140) {
			System.out.println("탑승 가능합니다!");
		} else {
			System.out.println("탑승 불가입니다.");
		}
		scan.close();

		/*
		 * 여기서 System.in은 **표준 입력(키보드)**이고, 이건 운영체제가 제공하는 **자원(Resource)**이야. 자원은 한정되어
		 * 있어서 다 쓰고 나면 반드시 닫아주는 게 좋은 습관이야. 🔒 scan.close();의 역할 입력 스트림을 닫음으로써 메모리 누수 방지
		 * 다른 입력 작업에서 충돌 방지 코드가 더 깔끔하고 안정적으로 동작
		 */

	}

}
