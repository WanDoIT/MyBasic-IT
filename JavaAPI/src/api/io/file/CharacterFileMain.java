package api.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//파일에 문자단위로 기록하고 읽어오기
public class CharacterFileMain {
	public static void main(String[] args) {
		//파일에 문자열을 문자 단위로 기록하기 : FileWriter와 PrintWriter 이용
		try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 인스턴스를 생성
			//한번 기록하고 두번째 기록할 때 이어서 기록하는 인스턴스
			//true를 생략하고 false를 설정하면 파일의 내용을 항상 새로 작성한다.
			PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
			//문자열 기록 시 ,나 공백 및 탭 등으로 구분이 가능한데 이렇게 만들어진 텍스트를 csv라고 한다.
			//이 방식은 변하지 않는 고정적인 데이터를 기록할 때 주로 이용
			pw.print("이어서 기록\n");
			pw.print("이어서기록2\n");
			pw.print("이어서, , 기록3\n");
			pw.write("write로 쓰기\n");
			pw.write("write로 쓰기2\n");
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		try {
			//문자 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
			BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
			//줄 단위로 읽어서 출력하기
			while(true) {
				//한줄 읽기
				String line= br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				String[] ar = line.split(",");
				System.out.println(ar[0]);
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		// 파일에서 문자열을 문자 단위로 읽어오기 : FileReader와 BufferedReader 이용
		
		
	
		
		
		
	}
}
