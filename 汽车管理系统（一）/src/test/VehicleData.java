package test;

import java. util. ArrayList;
import java. util. Iterator;
public class VehicleData{
private ArrayList vehicles; //����һ�����ڴ�����г������б�
 public VehicleData() {
vehicles=new ArrayList() ;
}
public void addVehicle(Vehicle aVehicle) { //�������б�����ӳ�����ķ���
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
