package chapter08;

public class Employee {

	String name;
	int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void work() {
		System.out.println(name + "직원이 일하고 있음");

	}

	public void getInfo() {
		System.out.println("이름: " + name + ", 연봉: " + salary);
	}

}
