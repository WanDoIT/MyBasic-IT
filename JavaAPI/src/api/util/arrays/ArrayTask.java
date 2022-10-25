package api.util.arrays;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		//문자열 배열 생성.
		String[] arr = {"카리나", "윈터", "조이", "슬기", "웬디"};
		
		//배열을 순회하면서 출력
//		for(String singer : arr) {
//			System.out.println(singer);
//		}
		
		//문자열의 크기 비교하는 메서드 : compareTo, compareToIgnorecase
		//System.out.println(arr[1].compareTo(arr[2])); //앞에문자가 더 크면 양수
		
		//선택정렬 - 실무에서 잘 사용하지 않음.
		String[] copyArr = Arrays.copyOf(arr, arr.length);
		
		//첫번째 부터 n-1 번째 데이터까지 자신의 뒤에 있는 모든 데이터와 비교해서 뒤에있는 데이터가 더 크다면 교환
		for(int i=0; i<copyArr.length; i++) {
			
			for(int j = 0; j<copyArr.length;j++) {
				if(copyArr[i].compareTo(copyArr[j])<0) {
					String temp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = temp;	
				}
			}
		}
		System.out.println(Arrays.toString(copyArr));
		
		
	}
}
