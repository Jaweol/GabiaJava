package chapter09;

public class Desktop extends Computer {

	// 추상 클래스를 상속받으면 추상 메소드는 반드시 구현해야한다
	@Override
	public void display() {
		System.out.println("Desktop Display()");

	}

	@Override
	public void typing() {
		System.out.println("Desktop Typing()");

	}

}
