package chapter12.clone;

//Cloaneable:복제가 가능한 클래스로 선언 
//Cloaneable 선언시 반드시 clone()메서드 오버라이딩 
public class Circle implements Cloaneable {

	Point point;
	int radius;

	public Circle(Point point, int radius) {
		// 생성자의...
		this.point = point;
		this.radius = radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {

		return "Circle [point="+point+     ];
	}
}
