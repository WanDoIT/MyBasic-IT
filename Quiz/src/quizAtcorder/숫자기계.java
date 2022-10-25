package quizAtcorder;

import java.util.Scanner;

public class 숫자기계 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int a0 = scan.nextInt();
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		int a5 = scan.nextInt();
		int a6 = scan.nextInt();
		int a7 = scan.nextInt();
		int a8 = scan.nextInt();
		int a9 = scan.nextInt();

		int[] arr = {a0,a1,a2,a3,a4,a5,a6,a7,a8,a9};
		int result = 0;
		for(int i = 0; i<3; i++) {
			result = arr[result];
		}
		System.out.println(result);
	}
}
