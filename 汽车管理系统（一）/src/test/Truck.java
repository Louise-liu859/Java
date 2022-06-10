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
public void printInfo() { //重写父类中的printInfo（） 方法
super. printInfo() ; //调用父类中的该方法
System. out. println("座位数:" + numOfSeat) ;
}
}
