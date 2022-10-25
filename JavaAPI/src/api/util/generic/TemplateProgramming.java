package api.util.generic;

	//로직은 같은데 매개변수의 자료형이 달라서 Overloading을 이용해서 구현
	
	//자료형의 이름을 임시로 만들어 두고 내부에서 임시로 만든 자료형을 사용한 후
	//인스턴스를 생성할 때 자료형을 결정하는 방식을 이용
	//단 인스턴스를 만들때 또는 메서드를 호출할 때 실제 자료형을 기재해야한다.
	//이때 사용되는 자료형은 Object로 부터 상속받은 클래스의 자료형만 가능하다.
	//int와 primitive type의 경우는 Integer 와 같은 Wrapper클래스를 이용해야 한다.
	//미지정 자료형의 개수는 제한이 없다.
	//인스턴스를 만들때 자료형을 설정하지 않으면 경고가 발생한다.

//class Algorithm<T>{
//	//2개의 데이터를 받아서 내용을 변경하는 메서드
//	public void swap(T n1, T n2) {
//		T imsi = n1;
//		n1 = n2;
//		n2 = imsi;
//	}
//
//}

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
//		Algorithm<Integer> algorithm = new Algorithm<>();
//		Integer n1 = 20;
//		Integer n2 = 30;
//		algorithm.swap(n1, n2);
//		System.out.println(n1+"/"+n2);
		
		//제너릭이 적용된 클래스의 인스턴스 만들기
		Generics<String> g1 = new Generics<String>("karina","Suzi","iu");
		g1.display();
		Generics<Integer> g2 = new Generics<>(100,300,200,400);
		g2.display();
		
	}

}
