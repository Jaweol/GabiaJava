package chapter05;

public class FunctionTest_04 {

	// 반환값이 있음 ~ return
	public int channelUp(int volume) {
		System.out.println("현재소리" + volume + "입니다");
		System.out.println("소리를 높이겠습니다");

		return volume + 2;
	}

	public void channelDown(int volume) { // void는 반환값없음
		System.out.println("현재소리" + volume + "입니다");
	}

	public static void main(String[] args) {

		FunctionTest_04 tv = new FunctionTest_04();

		int volume = 5;
		// 반환값 있음 volume + 2;
		int v = tv.channelUp(volume);
		System.out.println("소리를 " + v + "로 올립니다");
		System.out.println("========================");
		System.out.println("소리를 " + tv.channelUp(volume) + "로 올립니다");
		System.out.println("========================");
		// 반환값 없음
		tv.channelDown(volume);

	}

}
