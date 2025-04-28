package chapter08;

public class Paprika extends Vegetable_02 {

	private String color;
	private int price;
	private String name;

	public void Set2(String a, int b, String c) {
		color = a;
		price = b;
		name = c;
	}

	public void Disp1() {
		System.out.println("----------------");
		System.out.println("분류: " + sort);
		System.out.println("계절: " + season);
		System.out.println("이름: " + super.name);// 부모 클래
	}

	public void Disp2() {
		System.out.println("----------------");
		System.out.println("색깔: " + sort);
		System.out.println("가격: " + price);
		System.out.println("이름: " + name);

	}

}
