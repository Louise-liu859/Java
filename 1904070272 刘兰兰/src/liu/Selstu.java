package liu;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class Selstu extends JPanel implements ActionListener{
	JTextField ѧ��,����,ϵ��;
	JButton ����;
	JTextField �κ�,����;
	JButton ����1;
	JTextField �κ�1,ѧ��1,�ɼ�;
	JButton ����2;

	public Selstu (){
		ѧ��=new JTextField(12);
		����=new JTextField(12);
		ϵ��=new JTextField(12);
		�κ�=new JTextField(12);
		����=new JTextField(12);
		�κ�1=new JTextField(12);
		ѧ��1=new JTextField(12);
		�ɼ�=new JTextField(12);
		����=new JButton("����ѧ����Ϣ");
		����1=new JButton("���ҿγ���Ϣ");
		����2=new JButton("����ѡ����Ϣ");
	
		
		Box box1=Box.createHorizontalBox();//���box
		Box box2=Box.createHorizontalBox();
		Box box4=Box.createHorizontalBox();
		Box box5=Box.createHorizontalBox();
		Box box6=Box.createHorizontalBox();
		Box box7=Box.createHorizontalBox();
		box1.add(new JLabel("ѧ��:",JLabel.CENTER));
		box1.add(ѧ��);
		box1.add(new JLabel("����:",JLabel.CENTER));
		box1.add(����);
		box1.add(new JLabel("ϵ��:",JLabel.CENTER));
		box1.add(ϵ��);
		box2.add(����);
		
		box4.add(new JLabel("�κ�:",JLabel.CENTER));
		box4.add(�κ�);
		box4.add(new JLabel("����:",JLabel.CENTER));
		box4.add(����);
		box6.add(����1);
		
		box5.add(new JLabel("�κ�:",JLabel.CENTER));
		box5.add(�κ�1);
		box5.add(new JLabel("ѧ��:",JLabel.CENTER));
		box5.add(ѧ��1);
		box5.add(new JLabel("�ɼ�:",JLabel.CENTER));
		box5.add(�ɼ�);
		box7.add(����2);

		Box boxH1=Box.createVerticalBox();//����box
		boxH1.add(box1);
		boxH1.add(box2);
		boxH1.add(Box.createVerticalGlue());
		Box boxH2=Box.createVerticalBox();//����box
		boxH2.add(box4);
		boxH2.add(box6);
		boxH2.add(Box.createVerticalGlue()); 
		Box boxH3=Box.createVerticalBox();//����box
		boxH3.add(box5);
		boxH3.add(box7);
		boxH3.add(Box.createVerticalGlue()); 
               
		����.addActionListener(this);
		����1.addActionListener(this);
		����2.addActionListener(this);
        
		JPanel messPanel=new JPanel();
		JPanel picPanel=new JPanel();
		JPanel threePanel=new JPanel();
		messPanel.add(boxH1);
		picPanel.add(boxH2);
		threePanel.add(boxH3);
		setLayout(new BorderLayout());
		JSplitPane splitV=new JSplitPane(JSplitPane.VERTICAL_SPLIT,messPanel,picPanel);//�ָ�
		add(splitV,BorderLayout.CENTER);
		JSplitPane splitV1=new JSplitPane(JSplitPane.VERTICAL_SPLIT,splitV,threePanel);//�ָ�
		add(splitV1,BorderLayout.CENTER);
		validate();
		
	
	}
	
	public void actionPerformed(ActionEvent c){
		Object obj=c.getSource();
		Statement stmt=null;
		ResultSet rs=null;
		int row=0;
		int i=0;
	    String sql=null;
	    Students K;
	    SelC K1;
	    SelSC K2;
		if(obj==����){
			if(ѧ��.getText().equals("")&&����.getText().equals("")&&ϵ��.getText().equals("")){
				sql="select * from S ";System.out.print("000");//000
			}
			else{
				if(ѧ��.getText().equals("")){
					if(����.getText().equals("")){
						sql="select * from S where Sx like'%"+ϵ��.getText()+"%'";System.out.print("001");}
					else{if(ϵ��.getText().equals("")){sql="select * from S where Sname like'%"+����.getText()+"%'";System.out.print("010");}
					     else{sql="select * from S where Sname like'%"+����.getText()+"%'and Sx like'%"+ϵ��.getText()+"%'";System.out.print("011");}}}
				else{if(����.getText().equals("")){
					      if(ϵ��.getText().equals("")){sql="select * from S where Sno like'%"+ѧ��.getText()+"%'";System.out.print("100");}
				          else{sql="select * from S where Sno like'%"+ѧ��.getText()+"%' and Sx like'%"+ϵ��.getText()+"%'";System.out.print("101");}}
				     else{if(ϵ��.getText().equals("")){sql="select * from S where  Sno like'%"+ѧ��.getText()+"%' and Sname like'%"+����.getText()+"%'";System.out.print("110");}
				           else{sql="select * from S where  Sno like'%"+ѧ��.getText()+"%' and Sname like'%"+����.getText()+"%' and Sx like'%"+ϵ��.getText()+"%'";System.out.print("111");}}}
		}
			K=new Students(sql);
		 }
		else{if(obj==����1){
			if(�κ�.getText().equals("")&&����.getText().equals("")){
				sql="select * from C ";System.out.print("00");//00
			}
			else{
				if(�κ�.getText().equals("")){sql="select * from C where Cname like'%"+����.getText()+"%'";System.out.print("01");}
				else{if(ϵ��.getText().equals("")){sql="select * from C where Cno like'%"+�κ�.getText()+"%'";System.out.print("10");}
				     else{sql="select * from C where  Cno like'%"+�κ�.getText()+"%' and Cname like'%"+����.getText()+"%'";System.out.print("11");}
			}
			}
			 K1=new SelC(sql);}
		else{if(obj==����2){
			if(�κ�1.getText().equals("")&&ѧ��1.getText().equals("")&&�ɼ�.getText().equals("")){
				sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("000");//000
			}
			else{
				if(�κ�1.getText().equals("")){
					if(ѧ��1.getText().equals("")){
						sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where C like'%"+�ɼ�.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("001");}
					else{if(�ɼ�.getText().equals("")){sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where SC.Sno like'%"+ѧ��1.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("010");}
					     else{sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where SC.Sno like'%"+ѧ��1.getText()+"%'and C like'%"+�ɼ�.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("011");}}}
				else{if(ѧ��1.getText().equals("")){
					      if(�ɼ�.getText().equals("")){sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where SC.Cno like'%"+�κ�1.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("100");}
				          else{sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where SC.Cno like'%"+�κ�1.getText()+"%' and C like'%"+�ɼ�.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("101");}}
				     else{if(�ɼ�.getText().equals("")){sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where  SC.Cno like'%"+�κ�1.getText()+"%' and SC.Sno like'%"+ѧ��1.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("110");}
				           else{sql="select SC.Cno,Cname,SC.Sno,Sname,C from SC,C,S where  SC.Cno like'%"+�κ�1.getText()+"%' and SC.Sno like'%"+ѧ��1.getText()+"%' and C like'%"+�ɼ�.getText()+"%' and C.Cno=SC.Cno and S.Sno=SC.Sno";System.out.print("111");}}}
			}
			K2=new SelSC(sql);
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
