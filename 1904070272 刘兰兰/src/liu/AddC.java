package liu;

import java.awt.*;

import javax.swing.*;

import java.sql.*;
import java.awt.event.*;

public class AddC extends JPanel implements ActionListener{
	JTextField �κ�,����;
	JButton ¼��;
	
public AddC(){
	try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
	catch(Exception e){System.err.println("�����������:   "+e);}
	
	�κ�=new JTextField(12);
	����=new JTextField(12);
	¼��=new JButton("¼��");
	¼��.addActionListener(this);
	
	Box box1=Box.createHorizontalBox();//���box
	Box box2=Box.createHorizontalBox();
	Box box3=Box.createHorizontalBox();
	Box box4=Box.createHorizontalBox();
	box1.add(new JLabel("�κ�:"));
	box1.add(�κ�);
	box2.add(new JLabel("����:"));
	box2.add(����);
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
		if(�κ�.getText().equals("")||����.getText().equals("")){
			JOptionPane.showMessageDialog(this,"ѧ����Ϣ��������¼�룡" );
		}
		Statement stmt=null;
		ResultSet rs=null,rs1=null;
		String sql,sql1;
		    sql1="select * from C where Cno='"+�κ�.getText()+"'";
		    sql="insert into C values('"+�κ�.getText()+"','"+����.getText()+"')";
	   try{
		   Connection dbConn1=CONN();
			stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs1=stmt.executeQuery(sql1);
			if(rs1.next()){JOptionPane.showMessageDialog(this,"�ÿκ��Դ��ڣ��޷����");}
			else{
			stmt.executeUpdate(sql);	
			JOptionPane.showMessageDialog(this,"��ӳɹ�");
			}		
			rs1.close();
			
			stmt.close();
	   }
	   catch(SQLException e){
		   System.out.print("SQL Exception occur.Message is:"+e.getMessage());
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

