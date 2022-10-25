package day15.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성을 적용한 배열
		Student s = new Student("홍길동",20,"123123");
		
		Teacher t = new Teacher("홍길자",30,"프로그램");
		
		Employee e = new Employee("홍길순",40,"취업지원팀");
		
		//Object[] arr = {s,t,e};
		Person[] arr = {s,t,e};
		
		for( Person p : arr ) {
			System.out.println(p.info()); //오버라이딩된 메서드
		}
		
		
		printInfo(s);
		printInfo(t);
		printInfo(e);
		
		
		House h = new House();
		h.setPerson(t);
		h.setPerson(e);
		h.setPerson(s);
		
		Person[] ar = h.getArr();
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void printInfo(Person p) { //부모타임 매개변수
		System.out.println(p.info());
	}
	

	
	
}
