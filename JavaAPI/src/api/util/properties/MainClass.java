package api.util.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MainClass {
	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null이 리턴됨.
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("카카오", "불나서 서버터진 회사");
		properties.setProperty("네이버", "서버 한번 터졌으면 좋겠다");
		properties.setProperty("내주식", "카카오 네이버 반토막");
		
		//예외처리 필수 1. 파일 처리할때 2. 웹서버 처리할떄 3. 데이터베이스 작업할때.
		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git에 연결된 사람은 workspace 가 아니고
			//c 드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있음.
//			properties.store(new FileOutputStream("./myproject.properties"),"텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myproject.xml"),"xml로 저장");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
