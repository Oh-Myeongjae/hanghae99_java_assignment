package test;

public class Bus extends Transport{
	
	public Bus() {
		number = (int)(Math.random()*900+100);	
		maxPassenger = 30;
		fee = 1000;
		State = "������";
	}
	
	void busInfo() {
		System.out.println("********************");
		System.out.println(number + "�� ����");
		System.out.println("ž�� �°� �� : "+Passenger + "��");
		System.out.println("�ܿ� �°� �� : "+(maxPassenger-Passenger) + "��");
		System.out.println("���Ȯ�� : "+ fee*Passenger +"��");
		System.out.println("������ : "+fuel);
		System.out.println("���� : "+State);	
	}

	@Override
	public void changefuel(int fuel) {
		this.fuel += fuel;
    	if(fuel<10) {
    		this.changeState("��������");
    		System.out.println("********************");
    		System.out.println("���� �ʿ�");
    	}
	}
}
