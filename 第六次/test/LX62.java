package test;
import java.util.*;
class LX62 {
public static void main(String args[]) {
Random r1=new Random(1234567890L);
Random r2=new Random(1234567890L);
boolean b=r1.nextBoolean(); // 随机数不为0 时取真值
int i1=r1.nextInt(100); // 产生大于等于0 小于100 的随机数
int i2=r2.nextInt(100); // 同上
double i3=r1.nextDouble(); // 产生大于等于0.0 小于1.0 的随机数
double i4=r2.nextDouble(); // 同上
double d1=Math.sin(Math.toRadians(30.0));
double d2=Math.log(Math.E);
double d3=Math.pow(2.0, 3.0);
int r=Math.round(33.6F);
System.out.println("b 的随机数不为0 时 "+b);
System.out.println("i1 的随机数为 "+i1);
System.out.println("i2 的随机数为 "+i2);
System.out.println("d1 的随机数为 "+i3);
System.out.println("d2 的随机数为 "+i4);
System.out.println("30 弧度的正弦值：Math.sin(Math.toRadians(30.0))＝ "+d1);
System.out.println("E 的对数值：Math.log(Math.E)＝ "+d2);
System.out.println("2 的3 次方：Math.pow(2.0, 3.0)＝ "+d3);
System.out.println("33.6F 四舍五入：Math.round(33.6F)＝ "+r);
}
}
