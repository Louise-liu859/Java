package test;
import java.util.*;
class LX62 {
public static void main(String args[]) {
Random r1=new Random(1234567890L);
Random r2=new Random(1234567890L);
boolean b=r1.nextBoolean(); // �������Ϊ0 ʱȡ��ֵ
int i1=r1.nextInt(100); // �������ڵ���0 С��100 �������
int i2=r2.nextInt(100); // ͬ��
double i3=r1.nextDouble(); // �������ڵ���0.0 С��1.0 �������
double i4=r2.nextDouble(); // ͬ��
double d1=Math.sin(Math.toRadians(30.0));
double d2=Math.log(Math.E);
double d3=Math.pow(2.0, 3.0);
int r=Math.round(33.6F);
System.out.println("b ���������Ϊ0 ʱ "+b);
System.out.println("i1 �������Ϊ "+i1);
System.out.println("i2 �������Ϊ "+i2);
System.out.println("d1 �������Ϊ "+i3);
System.out.println("d2 �������Ϊ "+i4);
System.out.println("30 ���ȵ�����ֵ��Math.sin(Math.toRadians(30.0))�� "+d1);
System.out.println("E �Ķ���ֵ��Math.log(Math.E)�� "+d2);
System.out.println("2 ��3 �η���Math.pow(2.0, 3.0)�� "+d3);
System.out.println("33.6F �������룺Math.round(33.6F)�� "+r);
}
}
