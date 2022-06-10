package 绘制几何图形;

interface drawTest {
public void draw() ;
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements
drawTest {
public void draw() {
System. out . println("平行四边形. draw() ") ;
}
public void doAnyThing() {
 }
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest {
public void draw() {
System. out . println("正方形. draw() ") ;
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
