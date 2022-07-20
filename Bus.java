package test;

public class Bus extends Transport{
	
	public Bus() {
		number = (int)(Math.random()*900+100);	
		maxPassenger = 30;
		fee = 1000;
		State = "운행중";
	}
	
	void busInfo() {
		System.out.println("********************");
		System.out.println(number + "번 버스");
		System.out.println("탑승 승객 수 : "+Passenger + "명");
		System.out.println("잔여 승객 수 : "+(maxPassenger-Passenger) + "명");
		System.out.println("요금확인 : "+ fee*Passenger +"원");
		System.out.println("주유량 : "+fuel);
		System.out.println("상태 : "+State);	
	}

	@Override
	public void changefuel(int fuel) {
		this.fuel += fuel;
    	if(fuel<10) {
    		this.changeState("차고지행");
    		System.out.println("********************");
    		System.out.println("주유 필요");
    	}
	}
}
