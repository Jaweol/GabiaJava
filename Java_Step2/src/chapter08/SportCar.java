package chapter08;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}

	// final메소드 이므로 재정의 안됨
	@Override
	public final void stop() {
		System.out.println("스포츠카가 멈춤");
		speed = 0;
	}

	public static void main(String[] args) {

		SportCar ac = new SportCar();
		ac.speedUp();
		ac.stop();

	}

}
