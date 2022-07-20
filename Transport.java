package test;

import java.util.UUID;

public class Transport { //부모
    int number;
    int fuel = 100;
    int speed = 0;
    int speedChange = 0;
    int Passenger = 0;
    int maxPassenger;
    String State;
    int fee;
    
    public boolean Start() {
    	return fuel>=10 ? true : false;
    }
    
    public void changeSpeed(int speed) {
    	if(Start()) {
    		this.speed = speed;
    	}else {
    		System.out.println("********************");
    		System.out.println("주유 필요");
    	}	 
    }
    
    public void changeState(String state) {
       this.State = state;
    }
    
    public void changefuel(int fuel) {
    	
     }

    public void Board(int num) {
    	if(Passenger+num>maxPassenger) {
    		System.out.println("**************");
    		System.out.println("*최대 승객 수 초과*");
    		System.out.println("**************");    
    		return;
    	}
    	if(this.State == "운행중"||this.State == "일반") {
    		Passenger = num;
    		State = "운행중";
    	}else {
    		System.out.println("********************");
    		System.out.println("탑승불가");
    	}
    }
}
