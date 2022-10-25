package day05;

public class MultiForEx02 {
	public static void main(String[] args) {
		
		// 회전할때마다 횟수가 변화하는 중첩반복문
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */   
		int star = 5;
		for (int i = 1; i <= star; i++) {

			for (int k = 1; k <= star - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * ********* 
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		System.out.println("----------------");
		
		for (int i =1; i<=star; i++) {
			
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<= 2*(star-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for (int i = star; i >= 1; i--) {

			for (int j = 1; j <= star - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
}
