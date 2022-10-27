package api.io.file;

import java.io.File;
import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		//파일에 대한 정보 확인
		
		try {
			//File 인스턴스 생성
			//Windows에서는 디렉토리 구분기호가 \인데 프로그래밍 언어에서는 \ 뒤에 문자가오면 제어문자로 인식하므로
			//\를 입력하고자 할 때는 \\ 이렇게 두번 입력해야 함.
			File f = new File("C:\\Users\\user\\Desktop\\1026.txt");
			
			//파일의 존재 여부 확인
			System.out.println(f.exists());
			//마지막 수정 날짜
			System.out.println(new Date(f.lastModified()));
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
