package quiz;

public class Q6_20 {

	public static int[] shuffle(int[] arr) {
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random() * 9);
			System.out.println(ran);
			temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
