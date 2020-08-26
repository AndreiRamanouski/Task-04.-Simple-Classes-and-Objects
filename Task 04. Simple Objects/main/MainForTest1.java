package by.htp.less07.main;

public class MainForTest1 {
	
	private int digit1;
	private int digit2;
	
	public MainForTest1() {
	}
	
	public void setDigit1(int digit3) {
		digit1 = digit3;
	}
	public void setDigit2(int digit4) {
		digit2 = digit4;
	}
	public int getDigit1() {
		return digit1;
	}
	public int getDigit2() {
		return digit2;
	}
	
	public int SummOfDigits() {
		int sum = digit1 + digit2;
		return sum;
	}
	public void TheBiggest() {
		if (digit1 == digit2) {System.out.println("Draw");}
		else if (digit1 > digit2) {
			System.out.println("Digit1 is bigger than Digit2");
		}
		else {System.out.println("Digit2 is bigger than Digit1");}
		
		
	}
	
	
}
