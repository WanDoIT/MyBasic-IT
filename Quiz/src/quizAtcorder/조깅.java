package quizAtcorder;

import java.util.Scanner;

public class 조깅 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int F = scan.nextInt();
		int X = scan.nextInt();

		int t = 0;
		int ao = 0;
		for(int i =0; i <=X; i+=A+C) {
			if(X-i < A) {
				t += (X-i)*B;
			} else {
			t += B*A;
			}
		}
	
		for(int j =0; j <=X; j+=D+F) {
			if(X-j <D) {
				ao += (X-j)*E;
			} else {
			ao += E*D;
			}
		}
		
		String result = "";
		if(t==ao) {
			result = "Draw";
		} else if (t>ao) {
			result = "Takahashi";
		} else { result = "Aoki";}

		System.out.println(result);
	}
}
