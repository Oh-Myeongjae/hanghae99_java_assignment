package test;

public class Taxi extends Transport{
	int plusfee = 1000;
	int basicDist = 1;
	String destination = "없음";
	int arriveDist= 0;
	int payment = 0;
	int totalPrice = 0;
	
	public Taxi() {
		number = (int)(Math.random()*9000+1000);	
		maxPassenger = 4;
		fee = 3000;
		State = "일반";
	}
	
	void taxiInfo() {
		System.out.println("********************");
		System.out.println(number + "번 택시");
		System.out.println("탑승 승객 수 : "+Passenger + "명");
		System.out.println("잔여 승객 수 : "+(maxPassenger-Passenger) + "명");
		System.out.println("기본 요금 확인 : "+ fee +"원");
		System.out.println("목적지 : "+ destination);
		System.out.println("목적지까지 거리: "+ arriveDist+"KM");		
		System.out.println("지불할 요금 : "+ payment +"원");
		System.out.println("주유량 : "+fuel);
		System.out.println("상태 : "+State);	
		System.out.println("누적금액 : "+totalPrice+"원");	
	}
	
	@Override
	public void changefuel(int fuel) {
		this.fuel += fuel;
    	if(this.fuel<10) {
    		this.changeState("운행불가");
    		System.out.println("********************");
    		System.out.println("주유 필요");
    	}
	}

	
	public void Board(int num,String dest, String dist) {
		this.Passenger = num;
		destination = dest;
		arriveDist = Integer.parseInt(dist.replaceAll("[^0-9]", ""));
		payment = plusfee*(arriveDist-basicDist) + fee;
		totalPrice += payment;
		State = "운행중";
	}
	
}
