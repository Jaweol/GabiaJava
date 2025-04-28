package chapter12.string;

public class StudentMain {

	public static void main(String[] args) {

		String studentLee = new String("이상우");
		String studentLee2 = studentLee;
		String studentSang = new String("이상우");

		System.out.println("-----동일한 주소의 두 인스턴스 비교--------");
		if (studentLee == studentLee2) { // 물리적인 주소
			System.out.println("studentLee 와 studentLee2의 주소는 같습니다");
		} else {
			System.out.println("studentLee 와 studentLee2의 주소는 다릅니다");
		}
		if (studentLee.equals(studentLee2)) { // 논리적인 주소
			System.out.println("studentLee 와 studentLee2의 주소는 같습니다");
		} else {
			System.out.println("studentLee 와 studentLee2의 주소는 다릅니다");
		}

		System.out.println("-----서로 다른 주소의 두 인스턴스 비교--------");
		if (studentLee == studentSang) { // 물리적인 주소
			System.out.println("studentLee 와 studentSang의 주소는 같습니다");
		} else {
			System.out.println("studentLee 와 studentSang의 주소는 다릅니다");

		}
		if (studentLee.equals(studentSang)) { // 논리적인 주소
			System.out.println("studentLee 와 studentSang의 주소는 같습니다");
		} else {
			System.out.println("studentLee 와 studentSang의 주소는 다릅니다");
		}
		System.out.println("-----데이터 값 출력--------");
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
		System.out.println("studentSange의 hashCode: " + studentSang.hashCode());

		System.out.println("-----hash코드 값 재정의--------");
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSange의 실제 주소값: " + System.identityHashCode(studentSang));
		System.out.println();

		System.out.println("----String클래스-----");
		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println("str1의 hashcode: " + str1.hashCode());
		System.out.println("str2의 hashcode: " + str2.hashCode());

	}

}
