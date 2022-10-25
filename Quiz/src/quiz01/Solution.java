package quiz01;

import java.util.*;

class Solution {
	public int[] solution(int n) {

		int[] arr = new int[10000];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
			while (true) {
				if (n % i == 0) {
					n = n / i;
					arr[i] = i;
				} else {
					break;
				}
			}
		}
		Arrays.sort(arr);
		int[] answer = new int[count];
		for (int j = 0; j < answer.length; j++) {
				answer[j] = arr[9999-j];
		}
		Arrays.sort(answer);
		return answer;
	}
}