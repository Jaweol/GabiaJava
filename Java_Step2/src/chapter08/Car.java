package chapter08;

public class Car {

	public int speed;

	public void speedUp() {
		speed += 1;
	}

	// override가 불가능한 메소드
	public void stop() {
		System.out.println("자동차가 멈춤니다");
		speed = 0;

	}
}
