package quizAtcorder;

import java.util.Scanner;

public class 앳코더퀴즈3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N<10) {
			System.out.print("AGC");
			System.out.print(0);
			System.out.print(0);
			System.out.print(N);
			
		} else if(N>=42) {
			System.out.print("AGC");
			System.out.print(0);
			System.out.print(N+1);
			
		} else {
			System.out.print("AGC");
			System.out.print(0);
			System.out.print(N);
		}
	}
}
