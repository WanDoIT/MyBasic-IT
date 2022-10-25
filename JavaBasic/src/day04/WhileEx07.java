package day04;

public class WhileEx07 {
	public static void main(String[] args) {
		// 최대값을 찾아라.

		int[] arr = { 50, 30, 40, 60, 70, 90, 100, 110, 20 };

		int i = 0;
		int max = arr[0]; // 최대값을 저장할 변수
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];

			}
			// 조건 -> arr[i]가 max보다 크면 arr[i]를 max에게 저장
			i++;
		}
		System.out.println("최대값은 " + max);
		System.out.println("--------------------------");
		int j = 0;
		int min = arr[0];
		while (j < arr.length) {
			if (arr[j] < min) {
				min = arr[j];
			}
			j++;
		}
		System.out.println("최소값은 "+min);
	}
}
