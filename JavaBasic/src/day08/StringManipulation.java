package day08;

import java.util.Arrays;



public class StringManipulation {
	public static void main(String[] args) {

		// 문자열 다루기
		// String str = new String(new char[] {'A','B','C'});
		// System.out.println(str);

		String str = "안녕녕하세요~";

		// 문자열의 길이를 확인 length
		// System.out.println(str.length());
		int len = str.length();
		System.out.println(len);

		// 문자열을 한글자 자르기 charAt
		char c = str.charAt(5);
		System.out.println(c);
	
		// 문자열의 위치 확인 indexOf(탐색처음부터) , lastIndexOf(문자열의 끝부터)
		// - 찾은 문자의 위치 반환
		int d = str.indexOf("녕");
		System.out.println("찾는위치:" + d);
		int e = str.lastIndexOf("녕");
		System.out.println("찾는위치:" + e);
		int f = str.indexOf("s");
		System.out.println("찾는문자가없다면" + f);

		// 문자열 변경 - replace
		String g = str.replace("녕", "뇽"); // 녕 -> 뇽 바뀜 (전부 다)
		System.out.println(g);
		System.out.println(str); // 원본 문자는 안바뀜.

		// 대소문자 변경 toUpperCase toLowerCase
		str = "abcDeFg";
		String h = str.toUpperCase();
		System.out.println(h);

		// 공백제거 trim or replace
		str = "    010-1234-5678   ";
		String i = str.trim();
		System.out.println(i); // 앞 뒤 공백만 제거

		str = " 안 녕 하 세 요 개 천 절 날 은 쉽니다   ";
		String j = str.trim();
		System.out.println(j);
		String k = str.replace(" ", ""); // replace로 공백제거
		System.out.println(k);

		// String.valueOf() -> 기본타입을 문자로 변경
		System.out.println("" + 10 + 20);
		System.out.println(String.valueOf(10) + 20);
		
		// 문자열 자르기★
		// substring : 인덱스 기준으로 자름
		str = "010-123334-5678";
		String l = str.substring(3); // 인덱스 미만 절삭
		System.out.println(l);

		String m = str.substring(3, 5); // 인덱스 이상~인덱스 미만 추출
		System.out.println(m);

		// split : 특정 문자 기준으로 잘라서 배열로 담아줌
		String[] o = str.split("3");//-기준으로 자름 //str.split("");
		System.out.println(Arrays.toString(o));
		
		// toCharArray : 한 글자씩 잘라서 char배열에 저장.
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
	
		
		System.out.println(arr2);
		
	}

}
