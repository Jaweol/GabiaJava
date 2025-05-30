package chapter13;

public class GenericContainerMain {

	public static void main(String[] args) {

		// 문자열 아이템을 저장하는 객체
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);

		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItem();

		// 타입제한으로 사용 불가능
		// String[] StringArray = { "1", "2", "3", "4", "5" };
		// stringContainer.sum(StringArray);

		// 정수 아이템을 저장하는 객체
		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);

		// 숫자 아이템을 저장하는 객체
		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		integerContainer.printItem();

		Integer[] IntArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of in array: " + integerContainer.sum(IntArray));

		// 실수 아이템을 저장하는 객체
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);

		// 숫자 아이템을 저장하는 객체
		doubleContainer.addItem(10.1);
		doubleContainer.addItem(20.1);
		doubleContainer.addItem(30.1);
		doubleContainer.printItem();

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Sum of in array: " + doubleContainer.sum(doubleArray));

	}

}
