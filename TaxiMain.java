package test;

public class TaxiMain {
	public static void main(String[] args) {
		Taxi aTaxi = new Taxi();
		Taxi bTaxi = new Taxi();
		
		System.out.println("1번시나리오");
		aTaxi.taxiInfo();
		bTaxi.taxiInfo();
		
		System.out.println();
		System.out.println("2번시나리오");
		aTaxi.Board(2, "서울역", "2km");
		aTaxi.taxiInfo();	
		
		System.out.println();
		System.out.println("3번시나리오");
		aTaxi.changefuel(-80);
		aTaxi.taxiInfo();	

		System.out.println();
		System.out.println("4번시나리오");
		aTaxi.Board(5);
		
		System.out.println();
		System.out.println("5번시나리오");
		aTaxi.Board(3, "구로디지털단지역", "12KM");
		aTaxi.taxiInfo();
		
		System.out.println();
		System.out.println("6번시나리오");
		aTaxi.changefuel(-20);
		aTaxi.taxiInfo();
	}
}
