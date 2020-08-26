package by.htp.less07.main;

public class MainForTest2 {
	private int no1;
	private int no2;
	
	public MainForTest2() {
		no1 = 2;
		no2 = 0;
	}
	
	public MainForTest2(int x, int y) {
		this.no1 = x;
		this.no2 = y;
	}
	
	public void setNo1(int x) {
		no1 = x;
	}
	public void setNo2(int x) {
		no2 = x;
	}
	public int getNo1() {
		return no1;
	}
	public int getNo2() {
		return no2;
	}
	
	public void Print() {System.out.println(no1 + "  " + no2);}
}
