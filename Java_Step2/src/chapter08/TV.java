package chapter08;

public class TV extends Appliance {

	public TV(String brand) {
		super(brand);

	}

	@Override
	void turnOn() {
		super.turnOn(); // 부모 동작 유지
		System.out.println("TV화면을 킴니다");

	}

}
