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
today=new Date(); // 获取系统当前日期
g.drawString("字符串格式："+today.toString(),20,20);
f1=DateFormat.getInstance(); // 以默认格式生成格式化器
s1=f1.format(today); // 将日期转换为字符串
g.drawString("系统格式："+s1,20,40);
// 生成长格式的中国日期格式化器
f1=DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
// 生成长格式的中国时间格式化器
f2=DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
s1=f1.format(today); // 将日期转换为日期字符串
s2=f2.format(today); // 将日期转换为时间字符串
g.drawString("中国格式："+s1+" "+s2,20,60);
now=Calendar.getInstance(); // 获取系统时间
s1=now.get(now.HOUR)+" 时" +now.get(now.MINUTE)+" 分"
+now.get(now.SECOND)+"秒";
g.drawString("调整前时间："+s1,20,80);
now.set(2004,8,15,9,9,9);
today=now.getTime();
g.drawString("调整后时间："+today.toString(),20,100);
}
}
