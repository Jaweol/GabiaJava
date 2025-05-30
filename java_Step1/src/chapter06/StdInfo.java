package chapter06;

public class StdInfo {

	// 멤버변수=필드
	public String studentName;
	public int grade;
	public int money;

	public StdInfo() {

	}

	public StdInfo(String studentName, int money) {

		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1400);// 버스 회사의 수입
		this.money -= 1400;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void showinfo() {
		System.out.println(studentName + "님의 남은 잔액은 " + money + "원 입니다");
	}

}
