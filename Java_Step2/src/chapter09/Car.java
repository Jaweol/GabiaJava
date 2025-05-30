package chapter09;

public abstract class Car {

	// 추상 메서드
	public abstract void drive();

	public abstract void stop();

	// 일반 메서드
	public void startCar() {
		System.out.println("시동을 켭니다");
	}

	public void turnOff() {
		System.out.println("시동을 끔니다");
	}

	// 템블릿 메서드 (재정의가 안되게 구현)
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
