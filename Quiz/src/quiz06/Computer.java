package quiz06;

public class Computer extends Calculator {

	double circle(int r) {
		double a = Math.PI*r*r;
		return a;
	}
	
	double rect(double r) {
		double a = r*r;
		return a;
	}
	

	double rect(double r, double r2) {
		double a = r*r2;
		return a;
	}
	
	double rect(double r, double r2, double r3) {
		double a = r*r2*r3;
		return a;
	}
	
	
}
