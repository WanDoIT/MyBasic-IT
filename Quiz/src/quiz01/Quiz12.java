package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		// 1. 7~100까지 정수 중의 7의 배수를 가로로 출력
		// 2. 1~200까지 정수 중의 9의 배수의 개수를 출력
		// 3. 50~100까지 두 수 사이의 합
		// 4. char 변수를 활용해서 A~Z까지 출력 A=65, Z=90
		// 5. 어떤 수를 입력받아서 입력받은 수의 구구단 출력

		for (int i = 7; i <= 100; i+=7) { //7씩 띄어도 가능
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");

		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println(count);

		int sum = 0;
		for (int i = 50; i <= 100; i++)
			sum += i;
		System.out.println(sum);
		
		for (char j = 'A';  j <='Z';j++ ) {
			System.out.print(j+" ");
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for( int i = 1; i<=9; i++) {
			System.out.println(num+" X "+i+" = "+i*num);
		}
		
	}
		

}
