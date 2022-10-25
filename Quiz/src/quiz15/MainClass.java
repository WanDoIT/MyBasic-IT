package quiz15;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //밖에 생성
		SongList m = new MelonMusic();
		
		while(true) {
			System.out.println("메뉴[1.추가, 2.재생, 3.개수, 4.종료]");
			System.out.print(">");
			
			int num = scan.nextInt();
			if(num==1) {
				System.out.print("노래>");
				String name = scan.next();
				m.insertList(name);
			} else if(num==2) {
				m.playList();
			}else if(num ==3) {
				int len = m.playLength();
				System.out.println("재생곡개수:"+len);
			} else if(num==4) {
				System.out.println("종료");
				return;
			}
			
		}
	
		
	
		
	}
}
