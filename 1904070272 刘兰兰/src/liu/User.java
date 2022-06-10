package liu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.xml.crypto.Data;

import java.io.*;
import java.net.MalformedURLException;
import java.sql.*;


public class User extends JFrame{
    private JLabel tle,use,password;
    private JTextField k1;//�û��������
    private JPasswordField k2;//���������
    private JButton b1,b2;

    //��¼����
    public User(JFrame f) throws IOException {
        super("��¼ϵͳ");

        Container c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER,40,30));
        
        use=new JLabel("username:");
        use.setFont(new Font("����",Font.PLAIN,30));
        use.setForeground(Color.white);
        use=new JLabel("username:");
        use.setFont(new Font("����",Font.PLAIN,30));
        use.setForeground(Color.white);
        password=new JLabel("password:");
        password.setFont(new Font("����",Font.PLAIN,30));
        password.setForeground(Color.white);
        
       
        k1=new JTextField(15);
        k1.setFont(new Font("serif",Font.PLAIN,15));
        k2=new JPasswordField(15);
        k2.setFont(new Font("serif",Font.PLAIN,15));
        b1=new JButton("��¼");
        b1.setFont(new Font("����",Font.PLAIN,15));
        b2=new JButton("�˳�");
        b2.setFont(new Font("����",Font.PLAIN,15));
        
        //	���õ�¼����
        BHandler b=new BHandler();
        EXIT d=new EXIT();
        b1.addActionListener(b);
        b2.addActionListener(d);

        //��ӿؼ�
        c.add(use);
        c.add(k1);
        c.add(password);
        c.add(k2);
        c.add(b1);
        c.add(b2);

        setBounds(300,300,250,160);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon bg = new ImageIcon("C:\\Users\\������\\Desktop\\02.jpg");	//����һ������ͼƬ
        setBounds( 550, 400,700, 500);
        JLabel label=new JLabel(bg);//�ѱ���ͼƬ��ӵ���ǩ��
        label.setBounds(0, 0, 700, 500);	//�ѱ�ǩ����Ϊ��ͼƬ�ȸߵȿ�
        JPanel jp = (JPanel)this.getContentPane();		//���ҵ��������Ϊ�������
        jp.setOpaque(false);//���ҵ��������Ϊ������
        jp.setLayout(null);//���ҵ��������Ϊ���Բ���
        
        add(label);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));	//�ѱ�ǩ��ӵ��ֲ�������ײ�
        //���ý�������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //������
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        User f1=new User(new JFrame());
        //������������
        backMusic.playMusic();

    }
    //��¼��ť����
    private class BHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(k1.getText().equals("")||k2.getText().equals("")){
                JOptionPane.showMessageDialog(User.this,"�û������벻��Ϊ�գ�" );
            }
            else{
                Statement stmt=null;
                ResultSet rs=null;
                String sql;
                sql="select * from student.admin where username='"+k1.getText()+"'";
                try{
                    Connection dbConn1=CONN();
                    stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    rs=stmt.executeQuery(sql);
                    if(rs.next()){
                        String xm=rs.getString("password");
                        if(k2.getText().equals(xm.trim())){JOptionPane.showMessageDialog(User.this,"��¼�ɹ�");
                            dispose();
                            new Menu();//������
                        }
                        else{JOptionPane.showMessageDialog(User.this,"�������");}
                    }
                    else{JOptionPane.showMessageDialog(User.this,"�û�������");}
                    rs.close();
                    stmt.close();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(User.this,"SQL Exception occur.Message is:"+e.getMessage());
                }
            }
        }
    }
    //�˳���������
    private class EXIT implements ActionListener{
        public void actionPerformed(ActionEvent even){
            System.exit(0);
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
}//�������


