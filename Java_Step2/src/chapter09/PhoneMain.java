package chapter09;

public class PhoneMain {

	public static void main(String[] args) {

		// Phone phone=new phone() -> 추상클래스이므로 객체 생성 안됨
		SmartPhone smartphone = new SmartPhone("김자바");

		System.out.println(smartphone.owner + "님");
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.intersearch();

	}

}
