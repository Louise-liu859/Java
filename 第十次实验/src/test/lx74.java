package test;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class lx74 extends Applet implements ItemListener {
TextArea area=new TextArea(6,30);//�����ı���
String Item[]={"2 ����","8 ����","16 ����","10 ����"};
Checkbox cb[]=new Checkbox[5];
Checkbox radio[]=new Checkbox[5];
Label l=new Label("���� 10 ������");
TextField TF=new TextField(6);//���������ı���
public void init() {
add(l);add(TF);
add(area);
add(new Label(" ��ѡ����ƣ�"));
for(int i=0; i<4; i++) {
cb[i]=new Checkbox(Item[i]);
add(cb[i]);
cb[i].addItemListener(this);
}
CheckboxGroup cbGroup=new CheckboxGroup();//������ѡ��
add(new Label("��ѡ����ƣ�"));
for(int i=0; i<4; i++) {
radio[i]=new Checkbox(Item[i],cbGroup,false);
add(radio[i]);
radio[i].addItemListener(this);
}
}
public void itemStateChanged(ItemEvent e) {
int x=Integer.parseInt(TF.getText());
if (e.getItem ()=="2 ����")
area.append ("��ѡ�����"+e.getItem ()+ Integer.toBinaryString(x)+"\n");
if (e.getItem ()=="8 ����")
area.append ("��ѡ�����"+e.getItem ()+ Integer.toOctalString(x)+"\n");
if (e.getItem ()=="16 ����")
area.append ("��ѡ�����"+e.getItem ()+Integer.toHexString(x)+"\n");
if (e.getItem ()=="10 ����")
area.append ("��ѡ�����"+e.getItem ()+x+"\n");
}
}