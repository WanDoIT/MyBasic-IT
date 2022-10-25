package quizAtcorder;

import java.util.Scanner;

public class 마지막카드 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int A = scan.nextInt();
		int result = 0;
		while(true) {
			K--;
			if(K==0) {
				break;
			}
			if(A==N) {
				A=1;
			} else {
				A++;		
			}
		}
		System.out.println(A);
	}
}
