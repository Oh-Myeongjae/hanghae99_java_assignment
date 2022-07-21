package test;

public class BusMain {
	public static void main(String[] args) {		
		Bus aBus = new Bus();
		Bus bBus = new Bus();
		System.out.println("1번시나리오");
		aBus.busInfo();
		bBus.busInfo();
	
		System.out.println();
		System.out.println("2번시나리오");
		aBus.Board(2);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("3번시나리오");
		aBus.changefuel(-50);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("4번시나리오");
		aBus.changeState("차고지행");
		aBus.busInfo();

		System.out.println();
		System.out.println("5번시나리오");
		aBus.changefuel(10);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("6번시나리오");
		aBus.changeState("운행중");
		aBus.busInfo();

		System.out.println();
		System.out.println("7번시나리오");
		aBus.Board(45);

		System.out.println();
		System.out.println("8번시나리오");
		aBus.Board(5);
		aBus.busInfo();
		
		System.out.println();
		System.out.println("9번시나리오");
		aBus.changefuel(-55);
		aBus.busInfo();
	}

}
