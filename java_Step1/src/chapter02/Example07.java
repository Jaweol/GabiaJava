package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 한 자릿수 숫자를 입력받아 (scan)
		//숫자가 짝수인지 홀수인지 출력하는 프로그램(삼함 연산자 사용)
        
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num=scan.nextInt();
		
		String result=(num%2==0) ? "짝수" : "홀수";
		System.out.println(result);
		
		System.out.println("------");
		
		int remainder=num & 2;
		boolean isOdd=remainder == 1;//true or false
		
		String result2=isOdd ? "홀수":"짝수";
		System.out.println(result2);
		
	}

}
