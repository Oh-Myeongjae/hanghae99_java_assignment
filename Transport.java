package test;

import java.util.UUID;

public class Transport { //�θ�
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
    		System.out.println("���� �ʿ�");
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
    		System.out.println("*�ִ� �°� �� �ʰ�*");
    		System.out.println("**************");    
    		return;
    	}
    	if(this.State == "������"||this.State == "�Ϲ�") {
    		Passenger = num;
    		State = "������";
    	}else {
    		System.out.println("********************");
    		System.out.println("ž�ºҰ�");
    	}
    }
}
