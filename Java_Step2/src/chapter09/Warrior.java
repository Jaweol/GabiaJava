package chapter09;

public class Warrior extends GameCharacter {

	@Override
	protected void attack() {
		System.out.println("전사가 검으로 공격을 합니다");

	}

	@Override
	protected void UseUItimate() {
		System.out.println("전사가 분노의 광란 스킬을 사용 합니다");

	}

}
