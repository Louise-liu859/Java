package liu;

import java.awt.*;

import javax.swing.*;

import java.sql.*;
import java.util.*;

import javax.swing.filechooser.*;

import java.io.*;
import java.awt.event.*;

public class AddSC extends JPanel implements ActionListener{
	JTextField �κ�,ѧ��,�ɼ�;
	JButton ¼��;
	
public AddSC(){
	try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
	catch(Exception e){System.err.println("�����������:   "+e);}
	
	�κ�=new JTextField(12);
	ѧ��=new JTextField(12);
	�ɼ�=new JTextField(12);
	¼��=new JButton("¼��");
	¼��.addActionListener(this);
	
	Box box1=Box.createHorizontalBox();//���box
	Box box2=Box.createHorizontalBox();
	Box box3=Box.createHorizontalBox();
	Box box4=Box.createHorizontalBox();
	box1.add(new JLabel("�κ�:"));
	box1.add(�κ�);
	box2.add(new JLabel("ѧ��:"));
	box2.add(ѧ��);
	box3.add(new JLabel("�ɼ�:"));
	box3.add(�ɼ�);
	box4.add(¼��);
	Box boxH=Box.createVerticalBox();//����box
	boxH.add(box1);
	boxH.add(box2);
	boxH.add(box3);
	boxH.add(box4);
	boxH.add(Box.createVerticalGlue());
	JPanel messPanel=new JPanel();
	messPanel.add(boxH);
	setLayout(new BorderLayout());
	add(messPanel,BorderLayout.CENTER);
	validate();
}
public void actionPerformed(ActionEvent c){
	Object obj=c.getSource();
	if(obj==¼��){
		if(�κ�.getText().equals("")||ѧ��.getText().equals("")){
			JOptionPane.showMessageDialog(this,"��д�κ���ѧ�Ų���¼�룡" );
		}
		else
		{
		Statement stmt=null;
		ResultSet rs=null,rs1=null,rsC=null,rsS=null;
		String sql,sql1,sqlS,sqlC;
		    sqlC="select * from C where Cno='"+�κ�.getText()+"'";
		    sqlS="select * from S where Sno='"+ѧ��.getText()+"'";
		    sql1="select * from SC where Cno='"+�κ�.getText()+"' and Sno='"+ѧ��.getText()+"'";
		    sql="insert into SC values('"+�κ�.getText()+"','"+ѧ��.getText()+"','"+�ɼ�.getText()+"')";
	   try{
		   Connection dbConn1=CONN();
			stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rsC=stmt.executeQuery(sqlC);
			if(rsC.next()){
				rsS=stmt.executeQuery(sqlS);
				if(rsS.next()){
			rs1=stmt.executeQuery(sql1);
			if(rs1.next()){JOptionPane.showMessageDialog(this,"��ѧ����ѡ�ÿγ̺ţ��޷����");}
			else{
			stmt.executeUpdate(sql);	
			JOptionPane.showMessageDialog(this,"��ӳɹ�");
			}
			rs1.close();
			}
				else{JOptionPane.showMessageDialog(this,"��ѧ�������ڣ��޷����");}
				rsS.close();
			}
			else{JOptionPane.showMessageDialog(this,"�ÿγ̲����ڣ��޷����");}
			rsC.close();
			stmt.close();
	   }
	   catch(SQLException e){
		   System.out.print("SQL Exception occur.Message is:"+e.getMessage());
		   }
	   }
	}
}

//�������ݿⷽ��
public static Connection CONN(){
	String driverName = "com.mysql.cj.jdbc.Driver";   //����JDBC����
    String dbURL = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC&characterEncoding=utf8";   //���ӷ����������ݿ�test //���ӷ����������ݿ�test
    String userName = "root";   //Ĭ���û���
    String userPwd = "123456";   //����
	   Connection dbConn=null;

	   try {
	   Class.forName(driverName);
	   dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
	   System.out.println("Connection Successful!");   //������ӳɹ� ����̨���Connection Successful!
	   } catch (Exception e) {
	   e.printStackTrace();
	   }
	   return dbConn;
}
}

