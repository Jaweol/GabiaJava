package chapter08;

public class Company {

	public static void main(String[] args) {

		Employee emp = new Employee("김지원", 4000);
		emp.work();
		emp.getInfo();

		Manager mgr = new Manager("박관리자", 5000, "영업");
		mgr.work();
		mgr.getInfo();
		mgr.approveLeave("김지원");

		Employee emp2 = new Manager("최팀장", 5500, "개발");
		emp2.work();
		emp2.getInfo();
		// emp2.approveLeave("김지원");-> 컴파일 에러(객체가 Employee타입 Manager고유
		// emp2는 Employee 타입이기 때문에, Manager에만 있는 approveLeave() 메서드는 사용할 수 없음!
		// Employee 클래스에 선언된 메서드만 사용 가능.

	}
}
