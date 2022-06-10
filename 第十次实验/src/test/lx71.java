package test;
import java.awt.*;
import java.applet.Applet;
public class lx71 extends Applet {
Label l1;
Button b1, b2, b3, b4, b5, b6;
public void init() {
setLayout(new GridLayout(3,3)); // 设置网格布局（3 行3 列共9 个网格）
l1=new Label("标签1");
b1 = new Button("按钮1");
b2 = new Button("按钮2");
b3 = new Button("按钮3");
b4 = new Button("按钮4");
add(l1);
add(b1);
add(b2);
add(b3);
add(new Label());
add(b4);
add(new Button("按钮5"));
add( new Button("按钮6"));
add(new Label("标签2"));
}
}