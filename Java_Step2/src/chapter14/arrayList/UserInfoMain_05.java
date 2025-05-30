package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoMain_05 {

	public static void main(String[] args) {

		// UserInfo타입의 ArrayList -> arr

		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();

		outer: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 생생(exit입력 시 종료): ");

			String id = scan.next();

			UserInfo ui = new UserInfo();
			ui.setId(id); // (scan.next())이렇게 여기에 넣어줘도 가능

			// exit입력 시
			if (ui.getId().equals("exit")) {
				System.out.println("프로그램이 종료됩니다");
				break;

			}
			// 아이디 중복 입력시 메시지 출력 후 무시(continue outer) 후 다시 입력시도

			for (int i = 0; i < arr.size(); i++)
				if (ui.getId().equals(arr.get(i).getId())) {
					System.out.println("아이디가 중복됨.다른 아이디 다시입력");
					continue outer;

				}

			System.out.println("패스워드 입력: ");
			ui.setPwd(scan.nextInt());

			arr.add(ui);

			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println();
			}

		} // while

	}// main

}
