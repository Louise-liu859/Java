package test;

import java. util. ArrayList;
import java. util. Iterator;
public class VehicleData{
private ArrayList vehicles; //定义一个用于存放所有车辆的列表
 public VehicleData() {
vehicles=new ArrayList() ;
}
public void addVehicle(Vehicle aVehicle) { //定义向列表中添加车对象的方法
vehicles. add(aVehicle) ;
}
public void list() {
for(Iterator iter=vehicles. iterator() ; iter. hasNext() ; ) {
Vehicle vehicle=(Vehicle) iter. next() ;
vehicle. printInfo() ;
System. out . println() ;
}
}
}
