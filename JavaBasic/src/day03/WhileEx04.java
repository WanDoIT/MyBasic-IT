package day03;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {

		// 정수를 입력받는다.
		// 입력받은 정수까지의 합.
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 1;
		int sum = 0;
		
		while (b <= a) {
			sum += b;
			b++;
		}
		System.out.println(a+"까지의 합 :"+sum);

	}
}
