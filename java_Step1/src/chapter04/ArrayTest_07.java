package chapter04;

public class ArrayTest_07 {

	public static void main(String[] args) {

		char[] alpha = new char[26];
		char ch = 'A';// 65

		// for문 이용해서 초기화 하기
		// for(int i = 0; i < alpha.length; i++)
		// { alpha[i] = ch;
		// ch++;
		// System.out.println(alpha[i] + " ");

		for (int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
			System.out.println(alpha[i] + " ");
		}

	}

}
