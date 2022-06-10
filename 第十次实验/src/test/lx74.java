package test;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class lx74 extends Applet implements ItemListener {
TextArea area=new TextArea(6,30);//创建文本区
String Item[]={"2 进制","8 进制","16 进制","10 进制"};
Checkbox cb[]=new Checkbox[5];
Checkbox radio[]=new Checkbox[5];
Label l=new Label("输入 10 进制数");
TextField TF=new TextField(6);//创建单行文本框
public void init() {
add(l);add(TF);
add(area);
add(new Label(" 请选择进制："));
for(int i=0; i<4; i++) {
cb[i]=new Checkbox(Item[i]);
add(cb[i]);
cb[i].addItemListener(this);
}
CheckboxGroup cbGroup=new CheckboxGroup();//创建单选框
add(new Label("请选择进制："));
for(int i=0; i<4; i++) {
radio[i]=new Checkbox(Item[i],cbGroup,false);
add(radio[i]);
radio[i].addItemListener(this);
}
}
public void itemStateChanged(ItemEvent e) {
int x=Integer.parseInt(TF.getText());
if (e.getItem ()=="2 进制")
area.append ("你选择的是"+e.getItem ()+ Integer.toBinaryString(x)+"\n");
if (e.getItem ()=="8 进制")
area.append ("你选择的是"+e.getItem ()+ Integer.toOctalString(x)+"\n");
if (e.getItem ()=="16 进制")
area.append ("你选择的是"+e.getItem ()+Integer.toHexString(x)+"\n");
if (e.getItem ()=="10 进制")
area.append ("你选择的是"+e.getItem ()+x+"\n");
}
}