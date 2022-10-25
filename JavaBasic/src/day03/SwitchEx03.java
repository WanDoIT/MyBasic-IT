package day03;

public class SwitchEx03 {
public static void main(String[] args) {
	
	String[] arr = {"안녕","hello","사요나라","@#$"};
	
	//System.out.println(arr[0]);
	/*
	 * math.random()을 사용해서 배열의 인덱스 범위(0~3)까지 랜덤수를 만듭니다.
	 * 랜덤수를 배열의 index의 적용해서 출력된 단어가 한국어,영어,일본어,알수없는언어
	 * 인지 처리를 해보세요.
	 */
	int a = (int) (Math.random()*4);
	String[] hi = {"안녕","hello","사요나라","@#$"};

	switch (hi[a]) {
	case "안녕":
		System.out.println("한국어");
		break;
	case "hello":
		System.out.println("영어");
		break;
	case "사요나라":
		System.out.println("일본어");
		break;
	case "@#$":
		System.out.println("알 수 없는 언어");
		break;
	}
	
	
	System.out.println(hi[a]);
}
}

