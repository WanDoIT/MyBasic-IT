package quiz11;

public class MainClass {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.computerInfo();
		
		Monitor monitor = new Monitor();
		
		computer.setMonitor(monitor);
		
		Monitor m= computer.getMonitor();
		
		m.info();
	}
}
