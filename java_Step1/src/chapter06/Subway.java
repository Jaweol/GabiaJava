package chapter06;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;

	// 생성자 초기화
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;

	}

	// take 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;

	}

	public void showinfo() {
		System.out.println("지하철" + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "만원 입니다.");

	}

}
