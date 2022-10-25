package day03;

public class WhileEx02 {

	public static void main(String[] args) {

		// 100번 회전하는 반복문에서 짝수만 출력

		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(); // 위의 가로출력 후 줄바꿈
		
		// 100번 회전하는 반복문에서 짝수만 출력
		int j = 0;
		while ( j <= 99) {
			
			j += 2;
			System.out.print(j+" ");
		}
		
	}
}
