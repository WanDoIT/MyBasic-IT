package quiz14;

public class Tank extends Unit {
	private boolean mode;
	
	public Tank() {
		super(100);
		
	}

	@Override
	public void location() {
		System.out.println("현위치"+x+"/"+y);
		
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void stop() {
	}
	
	public void changeMode() {
		if(mode) {
			mode = false;
		} else {
			mode = true;
		}
		
	}
	
}
