package test;

public class BusMain {
	public static void main(String[] args) {		
		Bus aBus = new Bus();
		Bus bBus = new Bus();
		System.out.println("1���ó�����");
		aBus.busInfo();
		bBus.busInfo();
	
		System.out.println();
		System.out.println("2���ó�����");
		aBus.Board(2);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("3���ó�����");
		aBus.changefuel(-50);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("4���ó�����");
		aBus.changeState("��������");
		aBus.busInfo();

		System.out.println();
		System.out.println("5���ó�����");
		aBus.changefuel(10);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("6���ó�����");
		aBus.changeState("������");
		aBus.busInfo();

		System.out.println();
		System.out.println("7���ó�����");
		aBus.Board(45);

		System.out.println();
		System.out.println("8���ó�����");
		aBus.Board(5);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("9���ó�����");
		aBus.changefuel(-55);
		aBus.busInfo();
	}

}
