package chapter11;

class Outter {

	// 외부 클래스 멤버변수
	int outNum = 100;
	static int sNum = 200;

	// 익명의 클래스
	Runnable getRunnable(int i) {

		int num = 100; // final

		class MyRunnable implements Runnable {
			int localNum = 10;// 내부 클래스 멤버변수

			@Override
			public void run() {
				// num=200; //final
				// i=100; //final
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("OutNum=" + outNum);

				System.out.println("Outter.sNum(외부 Data영역): " + Outter.sNum);

			}// run

		}// Runnable

		return new MyRunnable();

	}// getRunnable

}// Outter class

public class LocalInner {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Runnable runner = outter.getRunnable(10);
		runner.run();

	}

}
