package chapter05;

import javax.swing.JOptionPane;

public class FunctionTest_03 {

	// Display1(static), Display2

	public static void Display1(String[] A) { // Static area 정적영역 **Static은 DATA영역에 있다**
		String res = "";

		// A 배열변수방의 요소를 모두 res에 저장하는 메서드method
		for (int i = 0; i < A.length; i++) {
			res += A[i] + " ";

		}
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n" + res);

	}

	public void Display2(String[] A) {
		String res = "";

		// A 배열변수방의 요소를 모두 res에 저장하는 메서드method
		for (int i = 0; i < A.length; i++) {
			res += A[i] + " ";

		}
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소\n" + res);

	}

	public static void main(String[] args) {
		String str[] = { "Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot" };// ->배열이기에 heap영역

		// DATA영역에서 호출(static 매서드 호출)
		Display1(str);

		System.out.println();
		// Stack 에서 호출되는 메서드
		FunctionTest_03 obj = new FunctionTest_03();
		obj.Display1(str);

	}

}

//DATA 영역(Static Area)->프로그램이 실행될때 미리 할당되는 메모리(즉 JVM에 미리 로딩됨)
//->static 메서드는 클래스에 소속되기 때문에 객체없이도 사용
//HEAP 영역(동적 메모리) -> new등을 통해서 생성된 객체나 배열 (예;scanner.scan-heap영역에있음) heap메모리
//STACK 영역(함수Method 호출/종료) -> (블럭내에서 사용하는게 지역변수)지역변수, 매게변수, 일반함수
