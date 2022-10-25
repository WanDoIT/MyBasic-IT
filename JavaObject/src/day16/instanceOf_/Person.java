package day16.instanceOf_;

public class Person { //부모클래스로 사용
	
	String name;
	int age;
	
	Person(String name) {
		this(name,10);
	
	}
	
	Person(String name,int age) {
		this.name = name.toUpperCase();
		this.age = age;

	
	}

	String info() {
		return "이름:" + name +", 나이:"+age;
	}
}

