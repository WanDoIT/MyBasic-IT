package day12.this_;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); //부모
		System.out.println(p.info());
		
		Person p3 = new Person("lee");
		System.out.println(p3.info());
		
		Person p2 = new Person("honggildong", 20);
		System.out.println(p2.info());
		
		Teacher t = new Teacher("이순신",20,"프로그래밍");
		System.out.println(t.info());
		
		

		
		
		
		
	}
}
