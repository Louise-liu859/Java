package test;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class lx73 extends Applet implements ActionListener { // 实现动作事件监听
public void init() {
setLayout(null);//关闭默认的顺序管理布局
Label l=new Label("按一下按钮可听到响声！", Label.CENTER);
add(l);
l.setBounds(40,10,150,30);
Button b=new Button("按钮");
add(b);
b.setBounds(60,50,60,40);
b.addActionListener (this); // 注册事件源的动作监听者
}
public void actionPerformed(ActionEvent e) {//实现单击事件接口的方法
Toolkit.getDefaultToolkit ().beep(); //单击事件发生时作出的反应
}
}