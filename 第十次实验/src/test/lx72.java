package test;

import java.awt.*;
import java.awt.Color;
import java.applet.Applet;
public class lx72 extends Applet {
public void init() {
//������ײ�� Applet ����Ϊ˳�򲼾�
setFont(new Font("Arial",Font.PLAIN,20));
Label l=new Label("������ײ�� Applet �����еı�ǩ",Label.CENTER);
add(l);
Panel panel1=new Panel();
add( panel1);
panel1.setBackground(Color.blue);
panel1.setForeground(Color.red);
panel1.setLayout(new BorderLayout());//���ñ߽粼��
panel1.add("North", new Button("��"));
panel1.add("South", new Button("��"));
panel1.add("East", new Button("��"));
panel1.add("West", new Button("��"));
panel1.add("Center", new Label("������ Panel1 ��� �в���ӵı�ǩ"));
Panel panel2=new Panel();
add( panel2);
panel2.setLayout(new GridLayout(3,1)); //�������񲼾�
Choice c=new Choice ();//��������ʽ�б�
c.addItem("����");
c.addItem("�Ϻ�");
c.addItem("���");
Label l1=new Label("������ Panel2 ����еı�ǩ");
Button b1=new Button("Panel2 �еİ�ť");
panel2.setBackground(Color.green);
panel2.add(l1);
panel2.add(b1);
panel2.add(c);
}
}
