package by.htp.less07.Task4;

public class MainForTest4 {
	private int hours;
	private int minutes;
	private int seconds;
	
	
	public MainForTest4() {
		hours = 0;
		minutes = 0;
		seconds = 0; 
	}
	
	public MainForTest4(int x, int y, int t) {
		if ( x < 24 && x >= 0 ) {
		hours = x; }
		else hours = 0 ;
		if ( y < 60 && y >= 0 ) {
		minutes = y; }
		else minutes = 0 ;
		if ( t < 60 && t >= 0 ) {
		seconds = t; }
		else seconds = 0 ;
	}
	
	public void setSeconds( int seconds) {
		if ( seconds < 60 && seconds >= 0 ) {
		this.seconds = seconds;}
		else this.seconds = 0 ;
	}
	public void setMinutes( int minutes ) {
		if ( minutes < 60 && minutes >= 0 ) {
			this.minutes = minutes;}
		else this.minutes = 0 ;
	}
	
	public void setHours( int hours) {
		if ( hours < 24 && hours >= 0 ) {
			this.hours = hours;
		} else this.hours = 0 ;
	}
	
	
	public String getClock() {
		return hours + ":" + minutes + ":" + seconds;
	}
	

}
