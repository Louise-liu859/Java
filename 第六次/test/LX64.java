package test;

import java.util.*;
import java.text.*;
public class LX64
{
public static void main (String args[])
{
Date today = new Date(); //��ǰ���ں�ʱ��
SimpleDateFormat sdf;
sdf= new SimpleDateFormat("yyyy �� MM �� dd �� hh ʱ mm �� ss �� a EEEEE");
System.out.println("��ǰ���ں�ʱ��: "+sdf.format(today));
long hms=System.currentTimeMillis(); //��ǰʱ��ĺ�����
System.out.println("��ǰʱ��ĺ�����="+hms);
Date tomorrow = new Date(hms+24*60*60*1000);
System.out.println("������"+sdf.format(tomorrow));
Calendar now = Calendar.getInstance();
int year =now.get(Calendar.YEAR); //���
int month=now.get(Calendar.MONTH)+1; //�·�
int day = now.get(Calendar.DATE); //����
System.out.print("������"+year+"��"+month+"��"+day+"��");
int week = now.get(Calendar.DAY_OF_WEEK); //����
switch (week)
{
case 1: System.out.println(" ������");break;
case 2: System.out.println(" ����һ");break;
case 3: System.out.println(" ���ڶ�");break;
case 4: System.out.println(" ������");break;
case 5: System.out.println(" ������");break;
case 6: System.out.println(" ������");break;
case 7: System.out.println(" ������");break;
}
}
}