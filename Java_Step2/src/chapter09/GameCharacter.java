package chapter09;

public abstract class GameCharacter {

	// 템플릿 메서드: 전투게임 순서 정의

	public final void fight() {
		enterBattlefield();// 전투게임 시작
		attack(); // 게임->하위 클래스의 구현
		UseUItimate(); // 아이템 사용->하위클래스의 구현
		leaveBattlefield();// 전투종료

	}

	// 공통 메서드
	private void enterBattlefield() {
		System.out.println("[입장] 캐릭터가 전장에 등장");
	}

	private void leaveBattlefield() {
		System.out.println("[퇴장] 캐릭터가 전장에 떠납니다");
	}

	// 하위 클래스가 반드시 구현해야하는 추상 매서드
	protected abstract void attack();

	protected abstract void UseUItimate();

}
