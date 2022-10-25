package quiz02;

public class Person {
	
	int age;
	String name;
	
	//생성자를 인위적으로 생성하면, 기본생성자는 자동생성하지 않는다.
	//name, age를 매개변수로 받는 생성자.
	Person() {
		age= 0;
		name = null;
	}
	
	Person(int pAge, String pName) {
		age = pAge;
		name = pName;	

		
	}
	
	String info() {
		String a = "회원정보 - 이름: "+name+" "+"/ 나이: "+age;
		return a;
	}
}
