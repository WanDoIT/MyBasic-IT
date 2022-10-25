package quizAtcorder;

import java.util.Scanner;

public class 이상한함수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int t = scan.nextInt();
		int result = a(a(a(t)+t)+a(a(t)));
		System.out.println(result);
		
	}
	public static int a(int a) {
		int b = a*a+2*a+3;
		
		return b;
	}
	
}
