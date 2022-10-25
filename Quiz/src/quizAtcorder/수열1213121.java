package quizAtcorder;

import java.util.Scanner;

public class 수열1213121 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String a = "1";
		for(int i = 2; i <= N; i++) {
			a = a+" "+Integer.toString(i)+" "+a;		
		}
		System.out.println(a);	
	}
}
