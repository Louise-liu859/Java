package test;

class Vehicle{
private String type; //���ڴ�ų����͵ı���
private String brand; //���ڴ�ų�Ʒ�Ƶı���
private double price; //���ڴ�ų��۸�ı���
private String comment; //���ڴ�����۵ı���
public Vehicle(String type, String brand, double price) {
this. type = type;
this. brand = brand;
this. price = price;
}
public void setComment(String comment) {
this. comment = comment;
 }
public void printInfo() {
System. out. println("���ͣ� "+type) ;
System. out. println("Ʒ��: " + brand) ;
System. out. println("�۸�: " + price) ;
System. out. println("����: " + comment) ;
}
}
