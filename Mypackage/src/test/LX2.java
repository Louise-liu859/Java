package test;
import test.lx;

public class LX2 
{ 
	private String name; 
	private lx birth; 
public static void main(String args[]) 
 	{ 
	 LX2 a = new LX2("�ų�",1990,1,11); 
	 a.output(); 
 	} 
 	public LX2(String n1,lx d1) 
 	{ 
	 name = n1; 
	 birth = d1; 
 	} 
 	public LX2(String n1,int y,int m,int d) 
 	{ 
 		this(n1,new lx(y,m,d));//��ʼ�����������
 	} 
 	public int age() //��������
 	{ 
 		return lx.thisyear() - birth.year(); //���ص�ǰ���������Ĳ����
 	} 
		public void output() 
		{ 
 		System.out.println("���� : "+name); 
		System.out.println("��������: "+birth.toString()); 
 		System.out.println("�������� : "+age()); 
 	} 
} 