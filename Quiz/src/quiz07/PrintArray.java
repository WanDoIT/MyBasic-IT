package quiz07;

public class PrintArray {

	String toArray(int[] arr) {
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

	String toArray(char[] arr) {
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

	String toArray(String[] arr) {
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
