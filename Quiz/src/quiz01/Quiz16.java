package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		/*
		 * 정수형태로 입력을 2개 받는다.
		 * 첫번째=가로길이 . 두번째 = 세로길이
		 * 
		 * 입력받은 가로,세로 길이의 사각형을 출력함. 
		 * 단,윤곽만출력. hint 1행 마지막행, 1열 마지막열만 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 > ");
		int j = scan.nextInt();
		System.out.print("세로 > ");
		int i = scan.nextInt();

		for (int a = 1; a <= i; a++) {
			System.out.println();

			for (int b = 1; b <= j; b++) {
				if (b == 1 || b == j || a == 1 || a == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
