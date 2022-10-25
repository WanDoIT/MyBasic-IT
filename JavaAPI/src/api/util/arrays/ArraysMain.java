package api.util.arrays;

import java.util.Arrays;

public class ArraysMain {
	public static void main(String[] args) {
		//문자열 배열 생성
		String[] singers = {"장원영", "카리나", "지젤", "민지", "태연", "아이유", "수지"};
		
		//이분 검색 - sort하지않으면 잘못된 결과 리턴됨.
		int result = Arrays.binarySearch(singers, "태연"); //sort부터 해주어야 함.
				
		System.out.println(result);
		Arrays.sort(singers);
		result = Arrays.binarySearch(singers, "태연"); //sort부터 해주어야 함.
		System.out.println(Arrays.toString(singers));
		if(result >=0) {
			System.out.printf("%s 는 %d 번째 존재\n", "태연", result);
		} else {
			System.out.printf("%s 는 존재하지 않음\n","태연");
		}
		
		System.out.println(result);
		
		
	}
}
