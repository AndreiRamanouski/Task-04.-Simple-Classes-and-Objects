package by.htp.less07.Task3;

public class MainForTest3 {
	private double counter;
	
	
	public MainForTest3(double counter) {
		this.counter = counter;
	}
	
	public MainForTest3() {
		counter = 10;
	}
	
	public double getCount() {
		return counter;
	}
	public double increaseBy(double x) {
		this.counter += x;
		return counter;
		
	}
	public double decreaseBy(double x) {
		this.counter -= x;
		if ( counter > 0 ) {
		return counter;}
		else
			counter = 0;
		return counter;
	}

}
