package quiz14;

public class DropShip extends Unit {

	public DropShip() {
		super(150);

	}

	public void location() {
		System.out.println("νμ¬μμΉ : ["+this.x+", "+this.y+"]");
	}

	public void move(int x, int y) {
		this.x= x;
		this.y= y;
	}

	public void stop() {

	}

	}


		



	
	

