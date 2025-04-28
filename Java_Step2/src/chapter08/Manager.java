package chapter08;

public class Manager extends Employee {

	String department;

	// 생성자
	public Manager(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	// Override work

	@Override
	public void work() {

	}

	public void approveLeave(String employeeName) {
		System.out.println(name + "관리자가" + employeeName + "의 휴가를 승인");

	}

}
