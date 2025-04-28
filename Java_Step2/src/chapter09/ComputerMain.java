package chapter09;

public class ComputerMain {

	public static void main(String[] args) {

		// 추상클래스는 객체를 만들수 없다
		// Computer c1 = new Computer();
		// Computer c2 = new Notebook();

		Computer c3 = new Desktop();
		Computer c4 = new MyNoteBook();

		c3.typing(); // Desktop
		c3.display(); // Desktop
		c4.display(); // Notebook
		c4.typing(); // MyNoteBook

	}

}
