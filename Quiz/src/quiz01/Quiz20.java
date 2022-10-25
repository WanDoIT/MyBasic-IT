package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
public static void main(String[] args) {
	
	/*
	 * 첫번째 입력받은 값을 한글자씩 공백을 사이에 두고 char형으로 출력
	 */ 
	
	/*
	 * 두 문자열을 입력받습니다.
	 * 첫 입력에 알파벳이 주어집니다.
	 * 두번째 입력에는알파벳으로 만들어진 문자열이 주어집니다.
	 * -> B
	 * -> SDAASFDBASDF
	 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어 있는지 출력.
	 */
	Scanner scan = new Scanner(System.in);
	String a = scan.next();
	String b = scan.next();
	
	char c = a.charAt(0);
	char[] arr = b.toCharArray();
	System.out.println(Arrays.toString(arr));
	int count=0;
	for (int i =0; i<b.length(); i++) {

		if (c==arr[i]) {
			count++;
		}
	}
	System.out.println(count);
	
	
	

	

	
	
}
}
