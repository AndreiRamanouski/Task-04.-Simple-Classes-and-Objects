package by.htp.less07.Task3;

import by.htp.less07.Task3.logic.MainForTest3Logic;

public class Test3 {
	public static void main(String[] args) {
		MainForTest3 counter1 = new MainForTest3();
		MainForTest3 counter2 = new MainForTest3(11);
		MainForTest3Logic logic = new MainForTest3Logic();
		
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		
		counter1.increaseBy(15.5);
		counter2.decreaseBy(5.2);
		
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		
		logic.sum(counter1.getCount(), counter2.getCount());
		System.out.println(logic.getSum());
		
		System.out.println(logic.decrease(counter1.getCount(), 15.5));
	}

	
}



/* 3. ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение на
единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и
произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод
позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса. */