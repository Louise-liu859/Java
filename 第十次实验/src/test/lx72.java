package test;

import java.awt.*;
import java.awt.Color;
import java.applet.Applet;
public class lx72 extends Applet {
public void init() {
//设置最底层的 Applet 容器为顺序布局
setFont(new Font("Arial",Font.PLAIN,20));
Label l=new Label("这是最底层的 Applet 容器中的标签",Label.CENTER);
add(l);
Panel panel1=new Panel();
add( panel1);
panel1.setBackground(Color.blue);
panel1.setForeground(Color.red);
panel1.setLayout(new BorderLayout());//设置边界布局
panel1.add("North", new Button("北"));
panel1.add("South", new Button("南"));
panel1.add("East", new Button("东"));
panel1.add("West", new Button("西"));
panel1.add("Center", new Label("这是在 Panel1 面板 中部添加的标签"));
Panel panel2=new Panel();
add( panel2);
panel2.setLayout(new GridLayout(3,1)); //设置网格布局
Choice c=new Choice ();//创建下拉式列表
c.addItem("北京");
c.addItem("上海");
c.addItem("天津");
Label l1=new Label("这是在 Panel2 面板中的标签");
Button b1=new Button("Panel2 中的按钮");
panel2.setBackground(Color.green);
panel2.add(l1);
panel2.add(b1);
panel2.add(c);
}
}
