package liu;

import javax.swing.*;
public class BackGroundTest extends JFrame{
 
	public BackGroundTest(){
 
        setTitle("���Ա���");	
        ImageIcon bg = new ImageIcon("C:\\Users\\������\\Desktop\\01.jpg");	//����һ������ͼƬ
        setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
        JLabel label=new JLabel(bg);//�ѱ���ͼƬ��ӵ���ǩ��
        label.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());	//�ѱ�ǩ����Ϊ��ͼƬ�ȸߵȿ�
        JPanel jp = (JPanel)this.getContentPane();		//���ҵ��������Ϊ�������
        jp.setOpaque(false);//���ҵ��������Ϊ������
        jp.setLayout(null);//���ҵ��������Ϊ���Բ���
        
        
 
        /**
         * ��������λ�ã��������jp�У������������Ϊ���Բ��֣������Ҫ���ô�С�ͳ��ֵ�λ��
         * ���磺JLabel Name_inf=new JLabel("����Ա��"+this.user_);
         *       ���ô�С��Name_inf.setSize(110,50);
         *       ����λ�ã�Name_inf.setLocation(0,-16);
         */
 
         //����ʾ����
         JLabel Name_inf=new JLabel("����Ա��");
         Name_inf.setSize(200,100);
         Name_inf.setLocation(0,-16);
         label.add(Name_inf);
         add(label);
         //����ʾ��   
 
 
        add(label);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//�ѱ�ǩ��ӵ��ֲ�������ײ�
        //���ý�������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
    public static void main(String[] args) {
		new BackGroundTest();
	}
 
}