package quiz01;

public class Quiz10 {
	public static void main(String[] args) {

		// 금액을 가장 큰 금액부터 나누어서 각 동전별로 몇개가 나와야도 하는지 출력.

		int[] arr = { 1000, 500, 100, 50, 10 };
		int money = 17780;
		int a = 0;

//		while (a < arr.length) {
//			if (money % arr[a] < arr[a]) {
//				System.out.println(arr[a] + "원 : " + money / arr[a]);
//			}
//			money = money % arr[a];
//			a++;
		while (a < arr.length) {
			System.out.println(arr[a] + "원 : " + money / arr[a]);
			money = money % arr[a];
			a++;
		}
		

	}
}
