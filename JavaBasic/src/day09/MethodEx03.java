package day09;

public class MethodEx03 {
	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입.
		 * 2. 반환유형이 있는 메서드는 호출 구문이 값이 되기 때문에 메서드의 매개값으로 사용될 수 있다.
		 * ex) println(메서드 호출)
		 * 3. 모든 메서드는 return을 만나면 강제종료된다.
		 * 4. 리턴문 아래에는 코드를 작성할 수 없다.
		 */
		
//	    int result = add(3,5);
//	    System.out.println("결과:"+result);
//		System.out.println(add(3,5));
		int result = add(add(1, 2), add(2, 3));
		System.out.println(result);
		
		// int r = sub(1,2); 안됨
		// System.out.println(sub(1,2)); 안됨
		sub(1,2); // 호출만 가능.
		
		noReturn("hello");
		noReturn("bbye");
		
	}

	// 반환있고 매개변수도 있는 메서드
	static int add(int a, int b) {
		return a + b;
	}

	// 반환없고, 매개변수 있는 메서드 - 리턴이 없음(단순 실행)
	static void sub(int a, int b) {
		System.out.println("a-b = " + (a - b));
		
	}
	
	//void 형에서 return - 종료
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return; // 종료
		}
		System.out.println(s);
		
	}
}
