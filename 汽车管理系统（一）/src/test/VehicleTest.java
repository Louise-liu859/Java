package test;

class VehicleTest{
public static void main(String args[] ) {
VehicleData vList=new VehicleData() ;
Car car=new Car("С�γ�", "����", 56) ;
car. setComment("�ܺ�") ;//���ôӸ���̳������ķ���
Bus bus=new Bus("��ͳ�", "����", 123, 30);
bus. setComment("����") ;
Truck truck=new Truck("����","����",67,15);
truck. setComment("һ��") ;
vList. addVehicle(car) ;
vList. addVehicle(bus) ;
vList. addVehicle(truck) ;
vList. list() ;
}
}
