package quizAtcorder;

import java.util.Scanner;

public class 슬라임 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		long A = scan.nextLong();
		long B = scan.nextLong();
		long K = scan.nextLong();
		int i = 1;
		if(A==B) {
			i=0;
		} else {
		while(true) {
		
			if(A*Math.pow(K, i)>=B) {
				break;
			}
			
			i++;
		}
	}
		System.out.println(i);
}
}
