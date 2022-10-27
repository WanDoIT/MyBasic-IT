package api.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StreamMain {
	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./sample.txt");
			
			//기록할 메세지 생성
			String msg = "0abcdh";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일 닫기
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage());
		}
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./sample.txt");
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인
			System.out.println(Arrays.toString(b));
			System.out.println(new String(b));
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
