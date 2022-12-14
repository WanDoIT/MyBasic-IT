package day01;

public class SystemOut {

	public static void main(String[] args) {

		//문자와 숫자
		// ctrl + s 저장 , ctrl + f11 실행
		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");

		//sysout 적고 ctrl + space 출력문을 자동생성
		//자주 쓰게 될 출력문은 println
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		//형식을 지정하는 출력문 printf : 형식 지정 출력문
		//문자형식을 미리 지정하고, 필요한 출력값을 지정하는 형태

		/*
		 * 서식문자
		 * %s - 문자열을 입력받음
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음 (%.2f - 소수부 자릿수를 의미함, 두 자리까지 표현)
		 * \n은 줄바꿈
		 * \t은 8칸 들여쓰기
		 */
		System.out.printf("안녕하세요. 제 이름은 %s 입니당~!\n", "홍길동");
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9, 20);
		System.out.printf("파이의 값은 %f입니다.\n", 3.14);
		System.out.printf("파이의 값은 %.2f입니다.\n", 3.14);
		System.out.printf("%d x %d = %d\t%d x %d = %d", 2, 1, 2, 2, 2, 4);

		/*
		 * 단축키
		 * ctrl + x 잘라내기
		 * end or home으로 커서를 마지막 혹은 처음으로 이동시킴
		 * shift end or shift home으로 빠른 블록 지정 가능
		 * 
		 * 정렬키
		 * ctrl + a, ctrl + i
		 * 
		 * 행 삭제
		 * ctrl + d
		 * 
		 * 행 복사
		 * ctrl + alt + 방향키
		 * 
		 * 코드 이동
		 * alt + 방향키
		 * 
		 * 빠른 주석
		 * ctrl + /
		 */
	}

}
