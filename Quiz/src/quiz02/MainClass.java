package quiz02;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * Person 클래스를 파일로 정의
		 * 멤버변수는 int age, String name
		 * 메서드 info() : String - 멤버변수를 문자열로 더해서 반환
		 * 
		 * 메인에서는 Person 객체를 2개 생성해서 각각 확인.
		 */
	   
		Person person = new Person();
		person.age = 20;
		person.name = "Lee";
		String a = person.info();
		System.out.println(a);
		
		Person person2 = new Person();
		person2.age = 25;
		person2.name = "Park";
		System.out.println(person2.info());
		
		Person person3 = new Person(30,"Kim");
		System.out.println(person3.info());
		
		//멤버변수, 메서드, 생성자를 사용해서 
		//현실에 찾아볼 수 있는 물건 생각해서 클래스 표현.
		//생성해서 사용
		
		
		
		}
}
