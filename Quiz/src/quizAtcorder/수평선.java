package quizAtcorder;

import java.util.Scanner;

public class 수평선 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long H = scan.nextLong();
	
		double result = Math.sqrt(H*(12800000+H));
		
		System.out.println(result);

	}
}
