package liu;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class DelSC extends JPanel implements ActionListener{
	String saveC=null;
	String saveS=null;
	JTextField �κ�1,ѧ��1,ѧ��,�κ�,�ɼ�;
	JButton ɾ��,����;
	
public DelSC(){
	try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
	catch(Exception e){System.err.println("�����������:   "+e);}
	
	ѧ��1=new JTextField(12);
	�κ�1=new JTextField(12);
	�κ�=new JTextField(12);
	ѧ��=new JTextField(12);
	�ɼ�=new JTextField(12);
	ɾ��=new JButton("ɾ��");
	����=new JButton("����");
	
	Box box1=Box.createHorizontalBox();//���box
	Box box2=Box.createHorizontalBox();
	Box box3=Box.createHorizontalBox();
	Box box4=Box.createHorizontalBox();
	Box box5=Box.createHorizontalBox();
	box1.add(new JLabel("�κ�:",JLabel.CENTER));
	box1.add(�κ�);
	box2.add(new JLabel("ѧ��:",JLabel.CENTER));
	box2.add(ѧ��);
	box3.add(new JLabel("�ɼ�:",JLabel.CENTER));
	box3.add(�ɼ�);
	box4.add(ɾ��);
	box5.add(new JLabel("�κ�:",JLabel.CENTER));
	box5.add(�κ�1);
	box5.add(new JLabel("ѧ��:",JLabel.CENTER));
	box5.add(ѧ��1);
	box5.add(����);
	Box boxH=Box.createVerticalBox();//����box
	boxH.add(box1);
	boxH.add(box2);
	boxH.add(box3);
	boxH.add(box4);
	boxH.add(Box.createVerticalGlue());
	
	ɾ��.addActionListener(this);
    ����.addActionListener(this);
	
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
    String sql=null,sql1=null;
	
	if(obj==����){if(�κ�1.getText().equals("")||ѧ��1.getText().equals(""))JOptionPane.showMessageDialog(this,"����д��ɲ�ѯ����Ϣ��" );
	else{
	     
	    sql1="select * from SC where Cno='"+�κ�1.getText()+"' and Sno='"+ѧ��1.getText()+"'";
	    try{
	    Connection dbConn1=CONN();
		stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs1=stmt.executeQuery(sql1);
	    if(rs1.next()){�κ�.setText(rs1.getString("Cno").trim());
	                   ѧ��.setText(rs1.getString("Sno").trim());
	                   �ɼ�.setText(rs1.getString("C").trim());
	                   saveC=�κ�1.getText().trim();	
	                   saveS=ѧ��1.getText().trim();
	    }
	    else{JOptionPane.showMessageDialog(this,"û������κŵ�ѧ��" );}
	    stmt.close();
	    rs1.close();
	    }catch(SQLException e1){
			   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
		   }
	    }
	}
	else{
		if(obj==ɾ��){if(saveC==null||saveS==null)JOptionPane.showMessageDialog(this,"��û������Ҫ�޸ĵ�ѧ��/�γ�" );
		else{sql="delete from SC where Cno='"+saveC+"' and Sno='"+saveS+"'";
		try{
		    Connection dbConn1=CONN();
			stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(sql);
			saveC=null;
			saveS=null;
			JOptionPane.showMessageDialog(this,"ɾ�����" );
			�κ�.setText("");
            ѧ��.setText("");
            �ɼ�.setText("");
			stmt.close();
		    }catch(SQLException e1){
				   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
			   }
		}
		}
}
}

//	�������ݿⷽ��
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

