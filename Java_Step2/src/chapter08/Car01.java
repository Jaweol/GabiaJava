package chapter08;

public class Car01 {

	public int speed;

	public void speedUp() {
		speed += 1;
	}

	public void stop() {
		System.out.println("자동차가 멈춤니다");
		speed = 0;
	}

}
