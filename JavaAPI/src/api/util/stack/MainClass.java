package api.util.stack;

import java.util.Date;
import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 stack을 생성
		Stack<PersonVO> stack = new Stack<>();
		//Stack에 데이터 저장 = push
		stack.push(new PersonVO(1,"카리나",new Date(100,10,26),"01011112222"));
		stack.push(new PersonVO(2,"윈터",new Date(101,1,2),"01033334444"));
		
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//데이터가 2개 존재하여 2번 pop하면 모두 제거된 상태인데
		//pop를 한번 더 수행하여 UnderFlow 발생 - 프로그램에서는 예외 발생
		//System.out.println(stack.pop()); - 언더플로우 
		
		
		
	}
}
