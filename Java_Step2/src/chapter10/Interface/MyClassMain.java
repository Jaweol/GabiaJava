package chapter10.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();

		X xClass = mClass; // X클래스 타입
		xClass.x();

		Y yClass = mClass;
		yClass.y();

		MyInterface iClass = mClass; // MyInterface클래스 타입
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
