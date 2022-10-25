package day15.poly.basic2;

public class Employee extends Person {
	
	
	String department; // 부서
	Employee(String name, int age, String department) {
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.department = department;
	}
	String info() {
		String result = super.info();
		// super.메서드() - 오버라이딩된 메서드에서 부모님의 원형메서드가 필요할때 사용.
		return result+"부서:"+department;
	}
	
}
