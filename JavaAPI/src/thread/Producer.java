package thread;

public class Producer extends Thread {
	//공유자원 속성
	private Product myList;
	
	//생성자
	public Producer(Product myList) {
		this.myList = myList;
		
	}
	
	@Override
	public void run() {
		for(char ch='A'; ch <= 'Z'; ch++) {
			myList.put(ch);
		}
	}
	
	
}
