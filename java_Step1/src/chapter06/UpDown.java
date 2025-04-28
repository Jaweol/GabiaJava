package chapter06;

import java.util.Random;

public class UpDown {

	private int pcnum = new Random().nextInt(50) + 1;
	private int count;
	private String result = "FALSE";

	public String check(int mynumber) {
		count++;
		if (mynumber > pcnum) {
			System.out.println("DOWN");
		} else if (mynumber < pcnum) {
			System.out.println("UP");
		} else {
			System.out.println(count + "회 만에 정답");
			result = "SUCCESS";
		}
		return result;
	}

}
