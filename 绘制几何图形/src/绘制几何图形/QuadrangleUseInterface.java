package ���Ƽ���ͼ��;

interface drawTest {
public void draw() ;
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements
drawTest {
public void draw() {
System. out . println("ƽ���ı���. draw() ") ;
}
public void doAnyThing() {
 }
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest {
public void draw() {
System. out . println("������. draw() ") ;
}
public void doAnyThing() {
}
}
class AnyThingUseInterface extends QuadrangleUseInterface {
public void doAnyThing() {
}
}
public class QuadrangleUseInterface {
public void doAnyThing() {
}
public static void main(String[] args) {
drawTest[] d = { new SquareUseInterface() ,
new ParallelogramgleUseInterface() } ;
for (int i = 0; i < d. length; i++) {
d[i] . draw() ;
}
}
}
