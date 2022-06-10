package test;
import test.lx;

public class LX2 
{ 
	private String name; 
	private lx birth; 
public static void main(String args[]) 
 	{ 
	 LX2 a = new LX2("张驰",1990,1,11); 
	 a.output(); 
 	} 
 	public LX2(String n1,lx d1) 
 	{ 
	 name = n1; 
	 birth = d1; 
 	} 
 	public LX2(String n1,int y,int m,int d) 
 	{ 
 		this(n1,new lx(y,m,d));//初始化变量与对象
 	} 
 	public int age() //计算年龄
 	{ 
 		return lx.thisyear() - birth.year(); //返回当前年与出生年的差即年龄
 	} 
		public void output() 
		{ 
 		System.out.println("姓名 : "+name); 
		System.out.println("出生日期: "+birth.toString()); 
 		System.out.println("今年年龄 : "+age()); 
 	} 
} 