package test;

public class Taxi extends Transport{
	int plusfee = 1000;
	int basicDist = 1;
	String destination = "����";
	int arriveDist= 0;
	int payment = 0;
	int totalPrice = 0;
	
	public Taxi() {
		number = (int)(Math.random()*9000+1000);	
		maxPassenger = 4;
		fee = 3000;
		State = "�Ϲ�";
	}
	
	void taxiInfo() {
		System.out.println("********************");
		System.out.println(number + "�� �ý�");
		System.out.println("ž�� �°� �� : "+Passenger + "��");
		System.out.println("�ܿ� �°� �� : "+(maxPassenger-Passenger) + "��");
		System.out.println("�⺻ ��� Ȯ�� : "+ fee +"��");
		System.out.println("������ : "+ destination);
		System.out.println("���������� �Ÿ�: "+ arriveDist+"KM");		
		System.out.println("������ ��� : "+ payment +"��");
		System.out.println("������ : "+fuel);
		System.out.println("���� : "+State);	
		System.out.println("�����ݾ� : "+totalPrice+"��");	
	}
	
	@Override
	public void changefuel(int fuel) {
		this.fuel += fuel;
    	if(this.fuel<10) {
    		this.changeState("����Ұ�");
    		System.out.println("********************");
    		System.out.println("���� �ʿ�");
    	}
	}

	
	public void Board(int num,String dest, String dist) {
		this.Passenger = num;
		destination = dest;
		arriveDist = Integer.parseInt(dist.replaceAll("[^0-9]", ""));
		payment = plusfee*(arriveDist-basicDist) + fee;
		totalPrice += payment;
		State = "������";
	}
	
}
