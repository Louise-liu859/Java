package test;
import java.awt.*;
import java.applet.Applet;
public class lx71 extends Applet {
Label l1;
Button b1, b2, b3, b4, b5, b6;
public void init() {
setLayout(new GridLayout(3,3)); // �������񲼾֣�3 ��3 �й�9 ������
l1=new Label("��ǩ1");
b1 = new Button("��ť1");
b2 = new Button("��ť2");
b3 = new Button("��ť3");
b4 = new Button("��ť4");
add(l1);
add(b1);
add(b2);
add(b3);
add(new Label());
add(b4);
add(new Button("��ť5"));
add( new Button("��ť6"));
add(new Label("��ǩ2"));
}
}