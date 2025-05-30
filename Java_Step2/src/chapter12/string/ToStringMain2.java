package chapter12.string;

public class ToStringMain2 {

	static class Book {

		String title;
		String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

		@Override
		public String toString() {
			return title + "," + author;

		}

	}// Book

	public static void main(String[] args) {

		Book book = new Book("JAVA", "솔데스크");
		System.out.println(book);
		System.out.println(book);
		// 멤버변수로 직접 호출하여 확인
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println();
		System.out.println(book.toString());

	}

}
