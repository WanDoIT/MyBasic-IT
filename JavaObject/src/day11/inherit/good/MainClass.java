package day11.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); //부모
		p.age = 12;
		p.name = "부모님";
		System.out.println(p.info());
		
		Student s = new Student();
		s.age =20;
		s.name ="홍길자";
		s.studentId = "123132";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name="이순신";
		t.subject = "역사";
		System.out.println(t.info());
		
	}
}
