package quiz01;

import java.util.Arrays;

public class Quiz23 {
	public static void main(String[] args) {
		char[] arr = {'a','b','c'};
		String a = method6(arr);
		System.out.println(a);
		
		int[] arr2 = {1,2,3,4};
		System.out.println(method7(arr2));
		
		String[] arr3 = method8("ab","cd");
		System.out.println(Arrays.toString(arr3));
	}
	static String method6 (char[] arr) {
		String sum = "";
		for(int i=0; i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	static int method7 (int[] arr) {
		int sum=0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];	
		}
		return sum;
	}
	
	static String[] method8 (String a, String b) {
		String[] arr  = {a,b};
		
		return arr;
	}
	
	
}
