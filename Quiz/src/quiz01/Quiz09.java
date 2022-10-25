package quiz01;
import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {

		// 두 수를 입력받습니다.
		// 두 수 사이의 합을 구하세요.
		// 10,13 -> 10+11+12+13
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;

		int max = a > b ? a : b;
		int min = a > b ? b : a;

		while (min <= max) {
			sum += min;
			min++;
		}
		System.out.println(sum);

//		if (a == b) {
//			System.out.println(a);
//		} else if (a < b) {
//			while (a <= b) {
//				sum += a;
//				a++;
//			}
//			System.out.println(sum);
//		} else if (a > b) {
//			while (b <= a) {
//				sum += b;
//				b++;
//			}
//			System.out.println(sum);
//		}

	}
}
