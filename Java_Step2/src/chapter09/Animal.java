package chapter09;

public abstract class Animal {

	public String kind;

	public void breath() {
		System.out.println("숨을 쉽니다");

	}

	// 추상메서드
	public abstract void sound();

}
