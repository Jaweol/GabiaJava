package chapter06;

public class CarMain {

	public static void main(String[] args) {

		Car_04 mycar = new Car_04();

		System.out.println(mycar.company);
		mycar.company = "현대";
		System.out.println(mycar.model);
		mycar.model = "k5";
		System.out.println(mycar.color);
		mycar.color = "흰색";
		System.out.println(mycar.maxSpeed);
		mycar.maxSpeed = 280;
		System.out.println(mycar.speed);

		mycar.speed = 60;

		System.out.println(mycar.speed);

	}

}
