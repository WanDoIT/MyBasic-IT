package day04;

public class WhileEx06 {

	public static void main(String[] args) {

		// 배열과 반복문
		// 시작은 0 ~ 길이 미만

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int i = 0;
		while( i < arr.length) {
			
			sum+= arr[i];
			System.out.println(arr[i]);
			i++;
			
		}
		System.out.println(sum);
		
	}

}
