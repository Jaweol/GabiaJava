package chapter12.wrapper;

public class StringEquals {

	public static void main(String[] args) {
		String strValue1 = new String("홍길동");
		String strValue2 = "홍길동";

		// strVar1==strVar2
		if (strValue1 == strValue2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		// ------------------------------------
		// 내부값 비교(strVar1.equals(strVar2))
		if (strValue1.equals(strValue2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");

		}
	}

}
