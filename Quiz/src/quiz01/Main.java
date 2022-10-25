package quiz01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		for(int i=1; i<=10;i++) {
			for(int j =1; j<10; j++) {
				if(i==5) {
					break;
				}
			}
			a += i;
		}
		System.out.println(a);
	}
}
