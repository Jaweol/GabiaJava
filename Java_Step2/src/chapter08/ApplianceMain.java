package chapter08;

public class ApplianceMain {

	public static void main(String[] args) {

		// override되거를 찾아야하기에 앞에 부모를입력(Appliance)
		Appliance a1 = new Washer("LG");
		Appliance a2 = new TV("Samsung");
		// ERROR-> TV tv=new Appliance();

		a1.turnOn();
		a2.turnOn();

		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new TV("Samsung");
		list[2] = new Washer("Daewoo");

		for (Appliance a : list) {
			a.turnOn();
		}

	}

}
