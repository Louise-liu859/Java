package test;

class Truck extends Vehicle{
public Truck(String type, String brand, double price) {
		super(type, brand, price);
		// TODO Auto-generated constructor stub
	}
private int numOfSeat;
public Truck(String type, String brand, double price, int numOfSeat) {
super(type, brand, price) ;
this. numOfSeat=numOfSeat;
}
public void printInfo() { //��д�����е�printInfo���� ����
super. printInfo() ; //���ø����еĸ÷���
System. out. println("��λ��:" + numOfSeat) ;
}
}
