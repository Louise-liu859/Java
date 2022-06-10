package test;

class VehicleTest{
public static void main(String args[] ) {
VehicleData vList=new VehicleData() ;
Car car=new Car("小轿车", "宝马", 56) ;
car. setComment("很好") ;//调用从父类继承下来的方法
Bus bus=new Bus("大巴车", "奔驰", 123, 30);
bus. setComment("不错") ;
Truck truck=new Truck("货车","吉瑞",67,15);
truck. setComment("一般") ;
vList. addVehicle(car) ;
vList. addVehicle(bus) ;
vList. addVehicle(truck) ;
vList. list() ;
}
}
