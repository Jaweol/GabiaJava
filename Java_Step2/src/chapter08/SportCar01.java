package chapter08;

public class SportCar01 extends Car01 {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed:" + speed);
	}

	@Override
	public final void stop() {
		speed = 0;
		System.out.println("멈춤");
	}

	public static void main(String[] args) {

		SportCar01 ac = new SportCar01();
		ac.speedUp();
		ac.stop();

	}

}
