package chapter09;

public class GameMain {

	public static void main(String[] args) {
		System.err.println("=====전사전투======");
		GameCharacter warr=new Warrior();
		warr.fight();
		System.err.println("=====마법사 전투======");
		GameCharacter wizard=new Warrior();
		wizard.fight();


		
	}

}
