package api.util.generic;

import api.util.generic.Test.Algorithm;

class Generics <T>{
	private T[] data;
	
	// ...은 variable args 로 개수에 상관없이 매개변수를 받고자 할 때 사용
	// 받은 매개변수들은 배열로 만들어진다.
	public Generics(T ... n) {
		this.data = n;
	}
	// 배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display(){
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}

public class TemplateProgramming {
	
	public static void main(String[] args) {
		// 제너릭이 적용된 클래스의 인스턴스를 만들 때는 자료형을 기재해야 한다.
		// 자료형을 기재하지 않으면 경고가 발생하고 Object 타입으로 간주한다.
		
		Algorithm<Object> algorithm = new Algorithm<>();
		Object n1 = "20";
		Object n2 = "30";
		algorithm.swap(n1,n2);
		System.out.println(n1);
		System.out.println(n1+"/"+n2);
		
		
		//제너릭이 적용된 클래스의 인스턴스 만들기
		Generics<String> g1 = new Generics<String>("karina","Suzi","iu");
		g1.display();
		Generics<Integer> g2 = new Generics<>(100,300,200,400);
		g2.display();
		
	}

}
