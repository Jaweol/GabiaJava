package chapter09;

public abstract class Notebook extends Computer {

	// 상속받은 두개의 추상메서드중 하나만 정의할 경우 Notebook도 추상
	@Override
	public void display() {
		System.out.println("Notebook Display()");

	}

}
