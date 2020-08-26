package by.htp.less07.Task4;

import by.htp.less07.Task4.logic.Task4Print;

public class Test4 {

	public static void main(String[] args) {
		MainForTest4 clock = new MainForTest4();
		MainForTest4 clockSet = new MainForTest4(10,56,34);
		Task4Print print = new Task4Print();
		
		
		System.out.println(clock.getClock());
		System.out.println(clockSet.getClock());
		
		clock.setSeconds(-77);
		clock.setMinutes(7718575);
		clock.setHours(33);
		System.out.println(clock.getClock());
		
		clockSet.setSeconds(44);
		clockSet.setMinutes(32);
		clockSet.setHours(23);
		System.out.println(clockSet.getClock());
		
		print.PrintClock(clockSet.getClock());
	}

}
/* ��������� �������� ������ ��� ������������� �������. ������������ ����������� ��������� ������� �
��������� ��� ��������� ����� (���, ������, �������) � ��������� ������������ �������� ��������. � ������
������������ �������� ����� ���� ��������������� � �������� 0. ������� ������ ��������� ������� �� ��������
���������� �����, ����� � ������ **/