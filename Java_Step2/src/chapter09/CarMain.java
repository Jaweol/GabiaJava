package chapter09;

public class CarMain {

	public static void main(String[] args) {
		mehod(new ManualCar());
		mehod(new AICar());

		System.out.println("---------자율주행-----------");
		Car mycar = new AICar();
		mycar.run();

		System.out.println("--------사람이 운전하는 자동차------------");
		Car hiscar = new ManualCar();
		hiscar.run();

	}

	public static void mehod(Car car) {
		car.drive();
		car.stop();

	}

}
