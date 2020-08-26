package by.htp.less07.main;

public class Test2 {

	public static void main(String[] args) {
		
		MainForTest2 task1 = new MainForTest2( 3 , 4 );
		MainForTest2 task2 = new MainForTest2();
		
		task1.Print();
		task2.Print();
		
		task1.setNo1(10);
		task1.setNo2(20);
		
		System.out.println(task1.getNo1() + "  " + task1.getNo2());
		
		task1.Print();
		
		/* 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
		инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса */

	}

}
