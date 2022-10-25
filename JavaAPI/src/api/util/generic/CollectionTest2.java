package api.util.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CollectionTest2 {
	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList<String> a1 = new ArrayList<>();
		//샘플데이터
		a1.add("One");
		a1.add("Three");
		
		
		long start = System.currentTimeMillis();
		//두번째에 데이터를 1000000 추가.
		for(int i=0; i<5; i++) {
			a1.add(1, "Two");
			
		}
		System.out.println(a1);
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		LinkedList<String> l1 = new LinkedList<>();
		//샘플데이터
		l1.add("One");
		l1.add("Three");

		 start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			l1.add(1, "Two");
			
		}
		 end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}
}
