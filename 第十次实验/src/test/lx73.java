package test;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class lx73 extends Applet implements ActionListener { // ʵ�ֶ����¼�����
public void init() {
setLayout(null);//�ر�Ĭ�ϵ�˳�������
Label l=new Label("��һ�°�ť������������", Label.CENTER);
add(l);
l.setBounds(40,10,150,30);
Button b=new Button("��ť");
add(b);
b.setBounds(60,50,60,40);
b.addActionListener (this); // ע���¼�Դ�Ķ���������
}
public void actionPerformed(ActionEvent e) {//ʵ�ֵ����¼��ӿڵķ���
Toolkit.getDefaultToolkit ().beep(); //�����¼�����ʱ�����ķ�Ӧ
}
}