package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p; // 선언만

		// Person객체들만 저장할 ArrayList생성
		ArrayList<Person> personarr = new ArrayList<Person>();

		while (true) {
			System.out.print("(1)회워가입, (2)정보삭제, (3)정보검색, (4)종료:");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt(); // int select= 하고 이때 선언해도 됨

			switch (select) {
			case 1: {// 회원가입
						// personarr객체에 Person클래스 객체의 정보 추가
				p = new Person();
				System.out.println("==정보를 추가합니다==");

				System.out.println("이름: ");
				p.setName(scan.next());

				System.out.println("나이: ");
				p.setAge(scan.nextInt());

				System.out.println("번호: ");
				p.setTel(scan.next());

				// ArrayListdp 추가
				personarr.add(p);
				System.out.println("회원가입 완료");
				break;

			}
			case 2: {
				System.out.println("==정보를 삭제합니다==");
				System.out.println("탈퇴할 사람 이름: ");
				String name = scan.next();

				for (int i = 0; i < personarr.size(); i++) {
					if (personarr.get(i).getName().equals(name)) {
						personarr.remove(i);
						System.out.println(name + "님의 정보가 삭제되었습니다");
						break;
					} else {
						if (i + 1 == personarr.size()) {
							System.out.println(name + "님의 정보는 존재하지 않습니다");

						}
					} // if

				} // for

				break;

			}
			case 3: {
				System.out.println("==정보를 출력합니다==");
				System.out.println("등록인원은 " + personarr.size() + "명");

				Iterator<Person> it = personarr.iterator();
				while (it.hasNext()) {
					p = it.next();
					System.out.println("이름: " + p.getName());
					System.out.println("나이: " + p.getAge());
					System.out.println("번호: " + p.getTel());
					System.out.println("--------------------");

				} // while
				break;

			}

			default:
				System.out.println("프로그램 종료: ");
				return;
			}// switch

		} // while

	}// 메서드
}// 클래스
