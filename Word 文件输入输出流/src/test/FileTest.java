package test;

import java. io. *; //����java. io��
public class FileTest { // ������
public static void main(String[] args) { // ������
File file = new File("D:/myword", "word.txt") ; // �����ļ�����
try { // ��׽�쳣
 FileOutputStream out = new FileOutputStream(file) ; // ����FileOutputStream����
byte buy[] = "����һֻСë¿�� �Ҵ���Ҳ��� ". getBytes() ; // ����byte������
out. write(buy) ; // ����������Ϣ�� д�뵽�ļ���
out. close() ; // �����ر�
} catch (Exception e) { // catch��䴦���쳣��Ϣ
e. printStackTrace() ; // ����쳣��Ϣ
}
try {
FileInputStream in = new FileInputStream(file) ; // ����FileInputStream�����
byte byt[] = new byte[1024]; // ����byte����
int len = in. read(byt) ; // ���ļ��ж�ȡ��Ϣ
System. out . println("�ļ��е���Ϣ�ǣ� " + new String(byt, 0, len) ) ; //���ļ�����Ϣ���
in. close() ; // �ر���
} catch (Exception e) {
e. printStackTrace() ; // ����쳣��Ϣ
}
}
}
