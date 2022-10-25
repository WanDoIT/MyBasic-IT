package api.util.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {
	public static void main(String[] args) {
		//날짜와 시간을 다른 형태로 사용하는 클래스
		
		Calendar calendar = new GregorianCalendar();
		//date 보다 많은 정보 출력
		System.out.println(calendar);
		
		//특정한 데이터를 조회-년도 추출
		System.out.println(calendar.get(calendar.YEAR));
		
		//최근에 많이 사용하는 날짜타입 //월에서 1 안빼도 됨.
		LocalDateTime meetingTime = LocalDateTime.of(2022, 10,27,18,50);
		System.out.println(meetingTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(meetingTime)); //에러
		
	}
}
