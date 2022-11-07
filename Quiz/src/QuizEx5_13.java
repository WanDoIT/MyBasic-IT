import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QuizEx5_13 {
	public static void main(String args[]) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			/*
			 * (1) . 알맞은 코드를 넣어 완성하시오 char question . 배열 에 담긴 문자의 위치를 임의로 바꾼다
			 */
			Set<Character> a = new HashSet<>();
			for(int j=0;j<question.length;j++) {
				a.add(question[j]);		
			}
			int c = 0;
			for(char b : a) {
				question[c]=b;
				c++;
			}
			int[] arr=new StringBuilder().append(123).reverse().chars().map(Character:: getNumericValue ).toArray();
			System.out.println(Arrays.toString(arr));
			System.out.printf("Q%d. %s 의 정답을 입력하세요 .>", i + 1, new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다 .%n%n");
			else
				System.out.printf("틀렸습니다 .%n%n");
		}
	} // main의 끝
}
