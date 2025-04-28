package chapter02;

public class Example01 {

	public static void main(String[] args) {
		//534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
		
		int books=534;
		int students=30;
		
		//double result=(double)books/students;
		int result=(books/students);
		System.out.println("학생당:" +result);
		
		int result2=(books%students);
		System.out.println("학생당:" +result2);
		
		
		
	}

}
