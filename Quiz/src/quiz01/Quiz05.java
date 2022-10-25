package quiz01;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 각각 입력을 받습니다. 같은 정수는 없다고 가정을 합니다.
		 * 
		 * 가장 큰 값, 중간값, 가장 작은값을 구분해서 출력.
		 */
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = 0;
		int mid = 0;
		int min = 0;

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println("Max > " + max);

		if ((a > b && a < c) || (a < b && a > c)) {
			mid = a;
		} else if ((b > a && b < c) || (b < a && b > c)) {
			mid = b;
		} else {
			mid = c;
		}
		System.out.println("Mid > " + mid);

		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}
		System.out.println("Min > " + min);
	}
}
