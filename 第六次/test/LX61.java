
package test;

import java.applet.Applet;
import java.awt.Graphics; 

public class LX61 extends Applet {
	 StringBuffer buffer=new StringBuffer();
	 public void init() {
	 addWords("ִ���˳�ʼ������ init()...");
	 }
	 public void start() {
	 addWords("ִ���˿�ʼ���� start()...");
	 }
	 public void stop() {
	 addWords("ִ����ֹͣ���� stop()...");
	 } 
	 public void destroy() {
	 addWords("ִ����������� destroy()...");
	 }
	 void addWords(String s) {
	 System.out.println(s);
	 buffer.append(s);
	 repaint();
	 }
	 public void paint(Graphics g) {
	 g.drawString(buffer.toString(),5,15);
	 }
}
