package day16.static_.basic;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	

	int[] arr = {1,2,3};
	System.out.println(PrintArray.toArray(arr));	
	
	char[] arr2 = {'a','b','c'};
	System.out.println(PrintArray.toArray(arr2));
	
	String[] arr3 = {"가나","다라","마바"};
	System.out.println(PrintArray.toArray(arr3));
	
	System.out.println(Arrays.toString(arr3));
}
}
