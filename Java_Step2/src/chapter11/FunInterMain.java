package chapter11;

public class FunInterMain {

	public void test() {

		// 익명의 클래스
		new FunInter() { // FunInter funinter=new FunInter();-> funinter.printData() //이렇게 하는것과 같은 (앞부분
							// 생략 가능)

			@Override
			public void printData() {
				System.out.println("목요일!");

			}
		}.printData();// 객체 생성후 호출
	}// test

	public static void main(String[] args) {
		FunInterMain funinter = new FunInterMain();
		funinter.test();

	}

}
