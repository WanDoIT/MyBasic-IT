package day17.inter.basic;

public interface Inter1 {

	//인터페이스는 객체생성이 불가하다.
	//상수, 추상메서드 +@(default메서드, static메서드)
	//주된 사용은 상수와 추상메서드
	
	double PI=3.14; //인터페이스에 변수를 선언 -> public 상수로 선언됨
	void method01(); //인터페이스에 메서드를 선언 ->public 추상메서드가 된다.

	
	
}
