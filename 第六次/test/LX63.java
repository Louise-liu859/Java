package test;

import java.text.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
public class LX63 extends Applet {
public void paint(Graphics g) {
Date today;
Calendar now;
DateFormat f1,f2;
String s1,s2;
today=new Date(); // ��ȡϵͳ��ǰ����
g.drawString("�ַ�����ʽ��"+today.toString(),20,20);
f1=DateFormat.getInstance(); // ��Ĭ�ϸ�ʽ���ɸ�ʽ����
s1=f1.format(today); // ������ת��Ϊ�ַ���
g.drawString("ϵͳ��ʽ��"+s1,20,40);
// ���ɳ���ʽ���й����ڸ�ʽ����
f1=DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
// ���ɳ���ʽ���й�ʱ���ʽ����
f2=DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
s1=f1.format(today); // ������ת��Ϊ�����ַ���
s2=f2.format(today); // ������ת��Ϊʱ���ַ���
g.drawString("�й���ʽ��"+s1+" "+s2,20,60);
now=Calendar.getInstance(); // ��ȡϵͳʱ��
s1=now.get(now.HOUR)+" ʱ" +now.get(now.MINUTE)+" ��"
+now.get(now.SECOND)+"��";
g.drawString("����ǰʱ�䣺"+s1,20,80);
now.set(2004,8,15,9,9,9);
today=now.getTime();
g.drawString("������ʱ�䣺"+today.toString(),20,100);
}
}
