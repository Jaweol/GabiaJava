package chapter10.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println();
		// Remote 클래스에 정의 되어 있는 메서드만 오버라이딩된 메소드 대입
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		// rc.search(); X
		System.out.println();

		// Searchable클래스에 정의 되어 있는 메서드만 오버라이딩된 메소드 대입
		Searchable sc = tv;
		sc.search("www.daum.net");

	}

}
