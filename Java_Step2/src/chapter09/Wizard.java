package chapter09;

public class Wizard extends GameCharacter {

	@Override
	protected void attack() {
		System.out.println("마법가가 파이어볼을 발사합니다");

	}

	@Override
	protected void UseUItimate() {
		System.out.println("마법사가 메테오 스톰을 시전합니다");

	}

}
