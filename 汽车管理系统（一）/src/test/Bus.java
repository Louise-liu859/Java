package test;

class Bus extends Vehicle{
private int numOfSeat; //���ڴ�ų���λ���ı���
public Bus(String type, String brand, double price, int numOfSeat) {
super(type, brand, price) ;
this. numOfSeat=numOfSeat;
}
}
//��д�����е�printInfo���� ����
