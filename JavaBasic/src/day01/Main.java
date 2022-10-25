package day01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = a.toUpperCase();

		char[] alp2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};		
		char[] arr = b.toCharArray();
		char[] alp = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};	

		for (char i = 0; i < 26; i++) {
			char count = 48;
			for (char j = 0; j < b.length(); j++) {
				if (arr[j] == alp[i]) {
					count++;
				}
				}
			alp[i] = count;
			}
		int max2 = 0;
		for (int k=0;k<=25; k++) {
			if (alp[k] > alp[max2]) {
				max2 = k;
			} 
		}
		int max3 =25;
		for (int k=25;k>=0; k--) {
			if (alp[k] > alp[max3]) {
				max3 = k;
			} 
		}
		if (alp2[max2]!=alp2[max3]) {
			System.out.println("?");
		} else {
			System.out.println(alp2[max3]);			
		}
		}
	}


//		Scanner scan = new Scanner(System.in);
//		
//		int[] arr= new int [10];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt()%42;
//		
//		String[] arr2 = new String[10];
//	//	arr[0]=String.ValueOf(arr[0]);
//		
//	//	Hashset<int> hashset= new Hashset<>(Arrays.asList(arr));
//			
//		}
//		System.out.println(Arrays.toString(arr));
