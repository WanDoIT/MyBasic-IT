package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		/*
		 * 첫 행의 입력값은 배열의 크기가 됩니다.
		 * 
		 * 배열의 크기만큼 반복을 돌면서, 입력받은 수들을 배열에 순서대로 저장.
		 * 
		 * 5 10 20 30 40 50 >> arr = {10,20,30,40,50}
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기 > ");
		int i = scan.nextInt();
		int[] arr = new int[i];

		int a = 0;
		while (a < arr.length) {
			System.out.print("배열 입력값["+a+"] > ");
			int j = scan.nextInt();
			arr[a] = j;
			a++;
		}
		System.out.println(Arrays.toString(arr));

	}
}
