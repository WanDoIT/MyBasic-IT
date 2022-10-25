package day03;

import java.util.Scanner;

public class WhileEx05 {
	public static void main(String[] args) {
		/*
		 * 반복문 안에서의 입력 1개의 정수를 받아서 반복의 횟수를 결정
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("반복횟수 >");
		int num = scan.nextInt();

		int sum = 0;

		int i = 1;
		while (i <= num) {
			System.out.print(">");
			int a = scan.nextInt();
			sum += a;
			i++;
		}
		System.out.println(sum);

	}
}
