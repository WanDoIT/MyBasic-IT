package day16.static_.basic;

public class PrintArray {

	private PrintArray() {} //객체생성 불가.
	
	
	static String toArray(int[] arr) {
		String a = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				a += arr[i] + "]";
				break;
			}
			a += arr[i] + ", ";
		}
		return a;
	}

	static String toArray(char[] arr) {
		String a = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				a += arr[i] + "]";
				break;
			}
			a += arr[i] + ", ";
		}
		return a;
	}

	static String toArray(String[] arr) {
		String a = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				a += arr[i] + "]";
				break;
			}
			a += arr[i] + ", ";
		}
		return a;
	}

}
