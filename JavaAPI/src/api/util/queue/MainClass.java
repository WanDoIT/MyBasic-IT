package api.util.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import api.util.stack.PersonVO;

public class MainClass {
	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스.
		
		//정수를 저장하는 PriorityQueue 를 만들어서 출력
		PriorityQueue<Integer> intQueue= new PriorityQueue<>();
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);

		//데이터 꺼내기 poll-크기순으로 꺼내기
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());

		//PersonVO클래스를 저장하는 우선순위 큐
		//이상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 떄문에 예외 발생.
//		PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//PersonVO 클래스에 Comparable 인터페이스에 implements하고 
		//compareTo 라는 메서드 재정의하여 해결가능.
		
		//Comparator 인터페이스를 대입 받을 수 있는 경우에는 Comparator 인터페이스를 
		//구현한 클래스의 인스턴스를 이용해서 생성해도 된다.

		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {
			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getBithday().compareTo(o2.getBithday());
			}
		});
		
		persons.offer(new PersonVO(1,"가나",new Date(100,9,10), "01011111234"));
		persons.offer(new PersonVO(2,"다라",new Date(101,1,2), "01012345678"));
		persons.offer(new PersonVO(3,"마바",new Date(103,3,3), "01033331234"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
		
	}
}
