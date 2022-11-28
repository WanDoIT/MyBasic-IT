package quiz01;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public static void main(String[] args) {
		int n = 32;
		int m = 990;
		int a;
		while(true) {
			a = m%n;
			if(m%n == 0) break;
			m = n;
			n = a;
		}
		System.out.println(n);
		
	    }
}
