package test;

import java.util.*;
import java.text.*;
public class LX64
{
public static void main (String args[])
{
Date today = new Date(); //当前日期和时间
SimpleDateFormat sdf;
sdf= new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh 时 mm 分 ss 秒 a EEEEE");
System.out.println("当前日期和时间: "+sdf.format(today));
long hms=System.currentTimeMillis(); //当前时间的毫秒数
System.out.println("当前时间的毫秒数="+hms);
Date tomorrow = new Date(hms+24*60*60*1000);
System.out.println("明天是"+sdf.format(tomorrow));
Calendar now = Calendar.getInstance();
int year =now.get(Calendar.YEAR); //年份
int month=now.get(Calendar.MONTH)+1; //月份
int day = now.get(Calendar.DATE); //日期
System.out.print("今天是"+year+"年"+month+"月"+day+"日");
int week = now.get(Calendar.DAY_OF_WEEK); //星期
switch (week)
{
case 1: System.out.println(" 星期日");break;
case 2: System.out.println(" 星期一");break;
case 3: System.out.println(" 星期二");break;
case 4: System.out.println(" 星期三");break;
case 5: System.out.println(" 星期四");break;
case 6: System.out.println(" 星期五");break;
case 7: System.out.println(" 星期六");break;
}
}
}