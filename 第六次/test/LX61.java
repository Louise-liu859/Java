
package test;

import java.applet.Applet;
import java.awt.Graphics; 

public class LX61 extends Applet {
	 StringBuffer buffer=new StringBuffer();
	 public void init() {
	 addWords("执行了初始化方法 init()...");
	 }
	 public void start() {
	 addWords("执行了开始方法 start()...");
	 }
	 public void stop() {
	 addWords("执行了停止方法 stop()...");
	 } 
	 public void destroy() {
	 addWords("执行了清除方法 destroy()...");
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
