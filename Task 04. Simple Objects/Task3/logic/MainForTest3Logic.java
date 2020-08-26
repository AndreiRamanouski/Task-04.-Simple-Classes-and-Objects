package by.htp.less07.Task3.logic;



public class MainForTest3Logic {
	private double sum;
	public void sum(double x, double y) {
		sum = x + y ;
	}
	
	public double getSum() {
		return sum;
	}
	
	public double decrease(double x, double y) {
		double New = x - y;
		if(New>0) {
		return New ;}
		else return 0;
	}

	
}
