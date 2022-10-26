package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
	public static void main(String[] args) {
		// 현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();

		System.out.println(currentTime);

		// 원하는 날짜를 가지고 생성

		//원하는 날짜를 가지고 생성 : 1986년 5월 5일 13:00:00로 설정
		Date firstMeetingTime = new Date(94,9-1,6,13,0,0);
		System.out.println(firstMeetingTime);
		
		//년도만 추출해서 출력		
		
		System.out.println(firstMeetingTime.getYear()+1900);
		System.out.println(firstMeetingTime.getMonth()+1);
		
		//원하는 포맷으로 출력
		// 1986년 5월 5일 ? 요일 이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일 H시 m분");
		System.out.println(sdf.format(firstMeetingTime));
		
		//연습해볼만한 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력.
		Date firstMeetingTime2 = new Date(95,9-1,6,13,0,0);
		System.out.println(firstMeetingTime.equals(firstMeetingTime2));
		if(firstMeetingTime2.equals(firstMeetingTime)) {
			System.out.println(sdf.format(firstMeetingTime2));
		} else {
		 sdf = new SimpleDateFormat("yyyy년 M월 d일 ");
				 System.out.println(sdf.format(firstMeetingTime2));
		}
		
	}
}
