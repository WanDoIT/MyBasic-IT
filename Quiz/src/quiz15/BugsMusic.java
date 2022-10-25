package quiz15;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		int a = (int) (Math.random()*count);
		
		System.out.println("랜덤재생:"+list[a]);
		
	}
	@Override
	public int playLength() {
		return count;
	}
	
	public void deleteList() { //마지막에 담긴 곡 제거.
		list[count] = null;
		count --;
	}
	
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
}
