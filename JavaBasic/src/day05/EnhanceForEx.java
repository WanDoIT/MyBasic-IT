package day05;

public class EnhanceForEx {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
//		//일반 for
//		for (int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//향상된 for
		for( int a : arr  ) {
			System.out.println(a);
		}
		System.out.println("----------------");
		
		String[] sArr = {"월","화","수","목","금","금","금"};
		for(String s : sArr) {
			System.out.println(s);	
		}
		System.out.println("----------------------");

		int[] score = {34,54,23,53,65};
		int sum = 0;
		for (int j : score) {
			sum+=j;
		}
		System.out.println("합계 > "+sum);
		double aver= (double)sum/score.length;
		System.out.printf("평균 > %.2f",aver);

	}
}
