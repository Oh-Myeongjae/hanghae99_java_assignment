package test;

public class TaxiMain {
	public static void main(String[] args) {
		Taxi aTaxi = new Taxi();
		Taxi bTaxi = new Taxi();
		
		System.out.println("1���ó�����");
		aTaxi.taxiInfo();
		bTaxi.taxiInfo();
		
		System.out.println();
		System.out.println("2���ó�����");
		aTaxi.Board(2, "���￪", "2km");
		aTaxi.taxiInfo();	
		
		System.out.println();
		System.out.println("3���ó�����");
		aTaxi.changefuel(-80);
		aTaxi.taxiInfo();	

		System.out.println();
		System.out.println("4���ó�����");
		aTaxi.Board(5);
		
		System.out.println();
		System.out.println("5���ó�����");
		aTaxi.Board(3, "���ε����д�����", "12KM");
		aTaxi.taxiInfo();
		
		System.out.println();
		System.out.println("6���ó�����");
		aTaxi.changefuel(-20);
		aTaxi.taxiInfo();
	}
}
