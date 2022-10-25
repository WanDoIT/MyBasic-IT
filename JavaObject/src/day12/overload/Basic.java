package day12.overload;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 만드는 것
	 * 규칙
	 * 1. 반환유형 or 접근제어자는 영향을 미치지 않는다.
	 * 2. 매개변수 타입 or 종류 or 순서 한개만 다르면 된다.
	 */
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
//	int input(int a) {
//		return 0;
//	}  반환유형은 달라도 되지만 매개변수가 동일하여 오버로딩 불가.

	void input(String s) {
		System.out.println("문자열 1개 입력");
	}

	void input(String s, int a) {
		System.out.println("문자열 1개, 정수 1개 입력");
	}

	void input(int a, String s) {
		System.out.println("정수 1개 입력, 문자열 1개 ");
	}
	
	void input(double a, double b, int c) {
		System.out.println("실수 2개, 정부 1개 입력");
	}
	
}
