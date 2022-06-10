package 实验8;

import java.awt.*;
import java.applet.*;
public class LX83 extends Applet {
Image img;
public void init(){
img=getImage(getCodeBase(),"file:/C:/Users/刘兰兰/Desktop/实验8  素材/image/花1.jpg");
//获取图像文件地址读取图 像文件到内存
play(getDocumentBase(),"WAV/Sound.wav"); //播放声音文件
}
public void paint(Graphics g){
int w=img.getWidth(this);
int h=img.getHeight(this);
g.drawImage(img,20,10,this); // 画出原图
g.drawImage(img,20,100, w/2, h/2, this); // 画出缩小一倍的图
g.drawImage(img,160,0, w*2, h*2, this); // 画出放大一倍的图
}
}