package quizAtcorder;

import java.util.Scanner;

public class 샴푸 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int V = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		
		while(true) {
			if(V>=A) {
				V -= A;
			} else { System.out.println("F");
			break;
			}
			
			if(V>=B) {
				V -= B;
			} else { System.out.println("M");
			break;
			}
			
			if(V>=C) {
				V -= C;
			} else { System.out.println("T");
			break;
			}
			
		}	
	}
}
