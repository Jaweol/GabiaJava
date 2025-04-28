package chapter13;

public class GenericContainer<T> {

	private T[] items; // int[i]
	private int count;

	// 기본 생성자 생략

	public GenericContainer(int size) {
		items = (T[]) new Object[size];
		count = 0;
	}

	// 아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		if (count < items.length) {
			items[count++] = item;
		} else {
			System.out.println("Container is full");
		}
	}// add item

	public void printItem() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i] + " ");
		}
		System.out.println();
	}

	public <E extends Number> double sum(E[] numbers) {
		double total = 0;
		for (E number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}
}
