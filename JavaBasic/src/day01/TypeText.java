package day01;

public class TypeText {

	public static void main(String[] args) {

		//단일문자를 저장하는 char, " 안됨, ' 로 저장해야 함
		char c1 = 'A';
		char c2 = 65; //유니코드?
		
		System.out.println(c1);
		System.out.println(c2);
		//아스키코드는 영어만 사용 가능, 유니코드의 등장으로 2byte로 확장되고 부호없는 비트값 65536개의 문자를 표기
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; // 백슬래쉬u는 유니코드임을 알려줌
		
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		//문자열을 저장하는 String, " 로 저장 권장
		String s1 = "hello";
		String s2 = " world"; //공백도 하나의 문자로 인식됨
		
		//문자열은 +로 연결하면 붙인 결과를 가져옴
		System.out.println(s1 + s2);
		
		//문자열은 길이를 확인할 수 있는 메소드 length()가 있음
		System.out.println(s1.length()); // 5 
		
		//문자열과 다른 타입의 + 연산
		System.out.println(100 + 200); // 300
		System.out.println("100" + 200); // 100200, 문자열에 다른 타입이 붙으면 결과는 무조건 문자열임
		System.out.println(100 + 200 + "world"); //300world
		System.out.println("hello" + 100 + 200); //hello100200 문자열 hello에 100이 붙어 100도 문자열로 인식됨
		
		//int double boolean String 자주씀
		
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //char + int = int이므로 75
		
		
		
		
		
	}

}
