package quizAtcorder;

import java.util.Scanner;

public class 십엔짜리우표 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int result = 0;

		while (true) {
			if (X < Y) {
				result++;
				X += 10;
			} else {
				break;
			}
		}
		System.out.println(result);
	}
}