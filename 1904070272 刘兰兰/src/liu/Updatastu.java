package liu;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Updatastu extends JPanel implements ActionListener{
	String save=null;
	JTextField ѧ��1,ѧ��,����,ϵ��;
	JButton �޸�,����;
	
public Updatastu(){
	try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
	catch(Exception e){System.err.println("�����������:   "+e);}
	
	ѧ��1=new JTextField(12);
	ѧ��=new JTextField(12);
	����=new JTextField(12);
	ϵ��=new JTextField(12);
	�޸�=new JButton("�޸�");
	����=new JButton("����");
	
	Box box1=Box.createHorizontalBox();//���box
	Box box2=Box.createHorizontalBox();
	Box box3=Box.createHorizontalBox();
	Box box4=Box.createHorizontalBox();
	Box box5=Box.createHorizontalBox();
	box1.add(new JLabel("ѧ��:",JLabel.CENTER));
	box1.add(ѧ��);
	box2.add(new JLabel("����:",JLabel.CENTER));
	box2.add(����);
	box3.add(new JLabel("ϵ��:",JLabel.CENTER));
	box3.add(ϵ��);
	box4.add(�޸�);
	box5.add(new JLabel("ѧ��:",JLabel.CENTER));
	box5.add(ѧ��1);
	box5.add(����);
	
	�޸�.addActionListener(this);
    ����.addActionListener(this);
	
	Box boxH=Box.createVerticalBox();//����box
	boxH.add(box1);
	boxH.add(box2);
	boxH.add(box3);
	boxH.add(box4);
	boxH.add(Box.createVerticalGlue());
	JPanel picPanel=new JPanel();
	JPanel messPanel=new JPanel();
	messPanel.add(box5);
	picPanel.add(boxH);
	setLayout(new BorderLayout());
	JSplitPane splitV=new JSplitPane(JSplitPane.VERTICAL_SPLIT,messPanel,picPanel);//�ָ�
	add(splitV,BorderLayout.CENTER);
	validate();
}

public void actionPerformed(ActionEvent e){
	Object obj=e.getSource();
	Statement stmt=null;
	ResultSet rs=null,rs1=null;
    String sql=null,sql1=null,sqlSC;
	
	if(obj==����){if(ѧ��1.getText().equals(""))JOptionPane.showMessageDialog(this,"����д��ѯ��ѧ�ţ�" );
	else{
	     
	    sql1="select * from S where Sno='"+ѧ��1.getText()+"'";
	    try{
	    Connection dbConn1=CONN();
		stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs1=stmt.executeQuery(sql1);
	    if(rs1.next()){ѧ��.setText(rs1.getString("Sno").trim());
	                   ����.setText(rs1.getString("Sname").trim());
	                   ϵ��.setText(rs1.getString("Sx").trim());
	                   save=ѧ��1.getText();	    	
	    }
	    else{JOptionPane.showMessageDialog(this,"û�����ѧ�ŵ�ѧ��" );}
	    stmt.close();
	    rs1.close();
	    }catch(SQLException e1){
			   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
		   }
	    }
	}
	else{
	if(obj==�޸�){if(save==null){JOptionPane.showMessageDialog(this,"��û������Ҫ�޸ĵ�ѧ��" );}
	else{
		if(ѧ��.getText().equals("")||����.getText().equals("")||ϵ��.getText().equals("")){
			JOptionPane.showMessageDialog(this,"ѧ����Ϣ���������޸ģ�" );
		}
		else{sql="update S set Sno='"+ѧ��.getText()+"',Sname='"+����.getText()+"',Sx='"+ϵ��.getText()+"'"+"where Sno='"+save+"'";
		if(save.trim().equals(ѧ��.getText().trim())){
		try{
		    Connection dbConn1=CONN();
			stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(sql);
			save=null;
			JOptionPane.showMessageDialog(this,"�޸����" );
			ѧ��.setText("");
            ����.setText("");
            ϵ��.setText("");
			stmt.close();
		    }catch(SQLException e1){
				   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
			   }
	}
		else{sql1="select * from S where Sno='"+ѧ��.getText()+"'";
		try{
		    Connection dbConn1=CONN();
			stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs1=stmt.executeQuery(sql1);
		    if(rs1.next()){  	JOptionPane.showMessageDialog(this,"�Ѵ��ڴ�ѧ��ѧ��" );
		    }
		    else{
		    	sqlSC="update SC set Sno='"+ѧ��.getText()+"' where Sno='"+save+"'";
		    	stmt.executeUpdate(sql);
		    	stmt.executeUpdate(sqlSC);
		    	save=null;
			JOptionPane.showMessageDialog(null,"�޸����" );
			ѧ��.setText("");
            ����.setText("");
            ϵ��.setText("");}
		    stmt.close();
		    rs1.close();
		    }catch(SQLException e1){
				   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
			   }
		
		}
		
	}}}}
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
