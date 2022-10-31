package lamda;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class LoopingMain {
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");
		
		//전체 데이터 출력 - 실행속도는 가장 빠르지만 list 의 데이터 개수가 변경되면 수정을 해야 함.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		//변하지 않는 메서드의 호출결과를 반복문에서 여러번 호출하는 것은 자원의 낭비
		int len = list.size();
		for(int i =0; i<len; i++) {
			System.out.println(list.get(i));
		}
		
		//반복문 이용 - 모든데이터를 순회하는 경우라면 빠른 열거를 이용하는것이 효율적.
		for(String a : list) {
			System.out.println(a);
		}
		
		//빠른 열거는 반복자를 외부에 만들어서 사용하는데 스트림 API는 내부 반복자를 사용
		//데이터가 많을 때 효율적.
		list.stream().forEach(a -> {System.out.println(a);});
		
	}
}
