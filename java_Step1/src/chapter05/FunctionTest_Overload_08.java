package chapter05;

public class FunctionTest_Overload_08 {

	// 멤버변수=피드=속성
	// int a;
	// String s; //class의 블럭안에

	// 생성자(디폴트 생략)
	// public FunctionTest_Overload_08() {
	// }

	// 메서드
	public void getresult(int n) {
		System.out.println(n + "은 int입니다");
	}

	public void getresult(char n) {
		System.out.println(n + "은 char입니다");
	}

	public void getresult(String str) {
		System.out.println(str + "은 str입니다");
	}

	public void getresult(int n, String str) {
		System.out.println(n + "은 int이고, " + str + "은 String입니다");
	}

}
