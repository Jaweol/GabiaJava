package chapter12.wrapper;

public class StringEquals2 {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println(str1 == str2); // heap메모리가 같은지 반환
		System.out.println(str1.equals(str2)); // heap메모리가 같은지 반환

		// 상수풀 (JVM에서 특별관리하는 메모리 영역->Constant pool)
		String str = "abc";
		String str3 = "abc";

		System.out.println(str == str3);// true

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // true

	}

}
