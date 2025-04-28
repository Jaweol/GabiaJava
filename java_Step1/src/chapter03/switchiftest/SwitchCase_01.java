package chapter03.switchiftest;

public class SwitchCase_01 {

	public static void main(String[] args) {
		//

		int ranking = 1;
		char medalColor;

		// Jump Table로 분기

		switch (ranking) {
		case 1: {
			medalColor = 'G';
			break;
		}
		case 2: {
			medalColor = 'S';
			break;
		}
		case 3: {
			medalColor = 'B';
			break;
		}
		default: {
			medalColor = 'A';
		}

		}// switch

		System.out.println(ranking + "등 메달은" + medalColor + "입니다.");

		System.out.println("-------------------------------------------------");

		if (ranking == 1) {
			medalColor = 'G';
		} else if (ranking == 1) {
			medalColor = 'G';
		}
		if (ranking == 1) {
			medalColor = 'G';
		}
		if (ranking == 1) {
			medalColor = 'G';
		}

		System.out.println(ranking + "등 메달은" + medalColor + "입니다.");

		{

		}

	}// main

}// class
