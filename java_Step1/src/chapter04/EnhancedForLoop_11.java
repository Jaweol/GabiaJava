package chapter04;

public class EnhancedForLoop_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArray[] = { "Java", "Oracle", "HTML5", "CSS", "JSP", "Spring", "Python" };

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();

		// (향상된)확장for문
		for (String lang : strArray) { // .length한것과 같음
			System.out.println(lang + " ");
		}

	}

}
