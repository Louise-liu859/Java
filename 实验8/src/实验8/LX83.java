package ʵ��8;

import java.awt.*;
import java.applet.*;
public class LX83 extends Applet {
Image img;
public void init(){
img=getImage(getCodeBase(),"file:/C:/Users/������/Desktop/ʵ��8  �ز�/image/��1.jpg");
//��ȡͼ���ļ���ַ��ȡͼ ���ļ����ڴ�
play(getDocumentBase(),"WAV/Sound.wav"); //���������ļ�
}
public void paint(Graphics g){
int w=img.getWidth(this);
int h=img.getHeight(this);
g.drawImage(img,20,10,this); // ����ԭͼ
g.drawImage(img,20,100, w/2, h/2, this); // ������Сһ����ͼ
g.drawImage(img,160,0, w*2, h*2, this); // �����Ŵ�һ����ͼ
}
}