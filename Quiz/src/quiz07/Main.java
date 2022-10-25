package quiz07;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	
	PrintArray pa = new PrintArray();
	int[] arr = {1,2,3};
	System.out.println(pa.toArray(arr));	
	
	char[] arr2 = {'a','b','c'};
	System.out.println(pa.toArray(arr2));
	
	String[] arr3 = {"가나","다라","마바"};
	System.out.println(pa.toArray(arr3));
	
	System.out.println(Arrays.toString(arr3));
}
}
