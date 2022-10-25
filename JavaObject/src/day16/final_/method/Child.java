package day16.final_.method;

public class Child extends Parent{


	public void method01() {
	}
//	public void method02() {} final로 오버라이딩 금지됨 
	
	public static void main(String[] args) {
		Child c= new Child();
		c.method02();
	}
}
