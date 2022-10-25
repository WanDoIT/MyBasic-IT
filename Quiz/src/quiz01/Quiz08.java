package quiz01;

public class Quiz08 {

	public static void main(String[] args) {

		// 1. 1~100까지 정수 중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 || i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		// 2. 1~200까지 정수 중에서 6의 배수의 합계
		int sum = 0;
		int j = 1;
		while (j <= 200) {
			if (j % 6 == 0) {
				sum += j;
			}
			j++;
		}
		System.out.println(sum);


		// 3. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌수의 개수
		int a = 1;
		int count = 0;

		while (a <= 100) {
			if (a % 4 == 0 && a % 8 != 0) {
				count++;
			}
			a++;
		}
		System.out.println(count);

		// 4. 1000의 약수의 개수의 {약수의 나누어 떨어지는 수)
		int b = 1;
		int count2 = 0;
		while (b <= 1000) {
			if (1000 % b == 0) {
				count2++;
			}
			b++;
		}
		System.out.println(count2);
	}
}
