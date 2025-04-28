package chapter08;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();

		child.method1(); // 부모꺼
		child.method2(); // 내꺼
		child.method3(); // 내꺼

		Parent parent1 = child;// 자바에서는 부모 타입으로 자식을 참조하더라도, 오버라이딩된 메서드는 자식의 것이 호출돼 이게 다형성(Polymorphism)
		parent1.method1();
		parent1.method2();

		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();
	}

}
