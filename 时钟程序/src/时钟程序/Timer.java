package ʱ�ӳ���;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Timer extends Applet implements Runnable {


Thread timer=null; // ������ʾʱ�ӵ��߳�
int lastXSecond=0;
int lastYSecond=0;
int lastXMinute=0;
int lastYMinute=0;
int lastXHour=0;
int lastYHour=0; //����ָ��λ�ò���
String lastDate=null;
int xCenter=100;
int yCenter=100; //��������λ��
int radius=80; //ָ��ƽ���뾶
int xToday=45;
int yToday=220; //���ֱ�λ��

public void start() {
if (timer == null) {
timer = new Thread(this) ;
timer. start() ;
}
}
public void stop() {
timer = null;
}


public void paint(Graphics g){
int xHour, yHour, xMinute, yMinute, xSecond, ySecond, second, minute, hour;
String today;
drawScale(g);
Date date = new Date();
second = date. getSeconds() ;
minute = date. getMinutes() ;
hour = date. getHours() ;
today = date. toLocaleString() ;
lastDate = date. toLocaleString() ;
xSecond = (int) (Math. cos (second * 3.14f / 30 - 3.14f / 2) * radius + xCenter) ;
ySecond = (int) (Math. sin (second * 3.14f / 30 - 3.14f / 2) * radius + yCenter) ;
xMinute = (int) (Math. cos (minute * 3.14f / 30 - 3.14f / 2)
* (radius - 5) + xCenter) ;
yMinute = (int) (Math. sin (minute * 3.14f / 30 - 3.14f / 2)
* (radius - 5) + yCenter) ;
xHour = (int) (Math. cos ((hour * 30 + hour / 2) * 3.14f / 180 - 3.14f
/ 2)
* (radius - 15) + xCenter) ;
yHour = (int) (Math. sin ((hour * 30 + hour / 2) * 3.14f / 180 - 3.14f
/ 2)
* (radius - 15) + yCenter) ;
if (xSecond != lastXSecond || lastYSecond != lastYSecond) {
g. drawLine(xCenter, yCenter, lastXSecond, lastYSecond) ;
g. drawString(lastDate, xToday, yToday) ;
}
if (xMinute != lastXMinute || lastYMinute != lastYMinute) {
g. drawLine(xCenter, yCenter - 1, lastXMinute, lastYMinute) ;
g. drawLine(xCenter - 1, yCenter, lastXMinute, lastYMinute) ;
}
if (xHour != lastXHour || lastYHour != lastYHour) {
g. drawLine(xCenter, yCenter - 1, lastXHour, lastYHour) ;
g. drawLine(xCenter - 1, yCenter, lastXHour, lastYHour) ;
}
g. setColor(Color. blue) ;// ���ʱ��
g. drawString(today, xToday, yToday) ;
g. setColor(Color. pink) ;// ����
g. drawLine(xCenter, yCenter, xSecond, ySecond) ;
g. setColor(Color. orange) ;// ����
g. drawLine(xCenter, yCenter - 1, xMinute, yMinute) ;
g. drawLine(xCenter - 1, yCenter, xMinute, yMinute) ;
g. setColor(Color. green) ; // ʱ��
g. drawLine(xCenter, yCenter - 1, xHour, yHour) ;
 g. drawLine(xCenter - 1, yCenter, xHour, yHour) ;
lastXSecond = xSecond;
lastYSecond = ySecond;
lastXMinute = xMinute;
lastYMinute = yMinute;
lastXHour = xHour;
lastYHour = yHour;
lastDate = today;
}
//�������� ����̶ȣ� ���ο�Դ���룩
public void drawScale(Graphics g) {
int xHour, yHour, xMinute, yMinute;
g. setColor(Color. darkGray) ;
for (int i = 0; i < 12; i++) {
xHour = (int) (Math. cos ((i * 30) * 3.14f / 180 - 3.14f / 2)
* radius + xCenter) ;
yHour = (int) (Math. sin ((i * 30) * 3.14f / 180 - 3.14f / 2)
* radius + yCenter) ;
g. draw3DRect(xHour - 2, yHour - 2, 4, 4, true) ;
}
g. setColor(Color. gray) ;
for (int j = 0; j < 60; j++) {
xMinute = (int) (Math. cos (j * 3.14f / 30 - 3.14f / 2) * radius + xCenter) ;
yMinute = (int) (Math. sin (j * 3.14f / 30 - 3.14f / 2) * radius + yCenter) ;
g. draw3DRect(xMinute - 1, yMinute - 1, 2, 2, true) ;
}
}
//�����ߡ� ���̼߳����� ���ο�Դ���룩

public void run() {
while (timer != null) {
try {
Thread. sleep (100) ;
} catch (InterruptedException e) {
}
repaint() ;
}
}
}
