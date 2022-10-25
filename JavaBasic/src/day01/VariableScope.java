package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		// 변수 이어서 선언 가능
		int num1 = 10, num2 = 20;
		int num4 = 0; //초기값
		//중괄호 하나 열고 엔터치면 짝꿍 자동 생성
		if(true) {
			
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num4 = 200; // 변경가능
		}
		
		int num3 = 100;
		System.out.println(num3);
		
		System.out.println(num4); //200
		
		/* System.out.println(num3); -> 에러남
		 * 변수는 해당 중괄호 안에서만 사용할 수 있다.
		 * main 안에서 만들어진 변수를 지역변수라고 부른다.
		 * 변수를 한번 쓰고 사라지게 하고 싶으면 안에다 선언, 변수를 지속적으로 사용하고 싶으면 밖에다 선언
		 */
		
		/* 정수 타입 : byte, short, int, long
		 * 크기 : 1byte, short = 2byte, int = 4byte, long = 8byte
		 * byte 범위 -2^7 ~ 2^7-1
		 * short 범위 -2^15 ~ 2^15-1
		 * int 범위 -2^31 ~ 2^31-1
		 * long 범위 -2^63 ~ 2^63-1
		 * 8bit => 1byte
		 * 1024 byte => 1 KB
		 * 1024 KB => 1 MB...
		 * 
		 * 실수 타입 : float, double
		 * 크기 : float = 4byte, double = 8byte
		 * 정수 부분보다 소수점 부분에서 문제가 자주 발생
		 * float : 소수부 7자리까지 신뢰성 있음
		 * double : 소수부 15자리까지 신뢰성 있음
		 * 실수는 연산 작업 시 오차가 발생할 수 있음
		 * int double이 기본으로 채택된 타입
		 * 
		 * 논리 타입 : boolean
		 * true, false 두개만 저장 가능
		 * 
		 * 문자 타입 : char, String
		 * ex) char = 'a'
		 * char = 2byte, 16칸, 2^16개
		 * String = "abc"
		 * 
		 */
		
	}

}
