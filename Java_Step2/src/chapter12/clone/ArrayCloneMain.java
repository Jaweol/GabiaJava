package chapter12.clone;

public class ArrayCloneMain {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		arr2 = arr1.clone();

		System.out.println("복사된 arr2 배열");
		for (int num : arr2) {
			System.out.println(num + " ");
		}
		System.out.println();

		arr2[3] = 0;
		System.out.println("변경 후 arr1 배");
		for (int num : arr1) {
			System.out.println(num + " ");
		}
		System.out.println();
		arr2[3] = 0;
		System.out.println("변경 후 arr1 배");
		for (int num : arr1) {
			System.out.println(num + " ");
		}
	}
}
