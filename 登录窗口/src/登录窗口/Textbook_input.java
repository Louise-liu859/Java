package 登录窗口;

import java. awt. BorderLayout;
import java. awt. GridLayout;
import javax. swing. ButtonGroup;
import javax. swing. ComboBoxModel;
import javax. swing. DefaultComboBoxModel;
import javax. swing. JButton;
import javax. swing. JCheckBox;
import javax. swing. JComboBox;
import javax. swing. JLabel;
 import javax. swing. JList;
import javax. swing. JPanel;
import javax. swing. JRadioButton;
import javax. swing. JScrollPane;
import javax. swing. JTextArea;
import javax. swing. JTextField;
import javax. swing. ListModel;
import javax. swing. WindowConstants;
import javax. swing. SwingUtilities;
public class Textbook_input extends javax. swing. JFrame {
private JPanel jPanel1;
private JList jList1;
private JButton jButton2;
private JButton jButton1;
private JScrollPane jScrollPane2;
private JTextArea jTextArea1;
private JLabel jLabel3;
private JScrollPane jScrollPane1;
private JLabel jLabel2;
private JComboBox jComboBox2;
private JComboBox jComboBox1;
private ButtonGroup buttonGroup1;
private JRadioButton jRadioButton2;
private JRadioButton jRadioButton1;
private JCheckBox jCheckBox1;
private JTextField jTextField1;
private JLabel jLabel1;
private JPanel jPanel2;
private JPanel jPanel3;


public static void main(String[] args) {

Textbook_input inst = new Textbook_input();


}

public Textbook_input() {
super() ;
setLocationRelativeTo(null) ;
setVisible(true) ;
initGUI() ;
}
private void initGUI() {
try {
setDefaultCloseOperation(WindowConstants. DISPOSE_ON_CLOSE ) ;
{
jPanel1 = new JPanel() ;
getContentPane() . add(jPanel1, BorderLayout. NORTH ) ;
jPanel1. setPreferredSize(new java. awt. Dimension(392, 39) ) ;
{
jLabel1 = new JLabel() ;
jPanel1. add(jLabel1) ;
jLabel1. setText("\u8f93\u5165\u6559\u6750\u4fe1\u606f") ;
}
{
jTextField1 = new JTextField() ;
jPanel1. add(jTextField1) ;
jTextField1
. setPreferredSize(new java. awt. Dimension(90, 22) ) ;
}
{
jCheckBox1 = new JCheckBox() ;
jPanel1. add(jCheckBox1) ;
jCheckBox1. setText("\u7ffb\u8bd1\u6559\u6750") ;
}
jPanel2 = new JPanel() ;
getContentPane() . add(jPanel2, BorderLayout. CENTER ) ;
jPanel2. setPreferredSize(new java. awt. Dimension(392, 38) ) ;
{
jRadioButton1 = new JRadioButton() ;
jRadioButton1. setSelected(true) ;
jPanel2. add(jRadioButton1) ;
jRadioButton1. setText("\u63a8\u8350\u6559\u6750") ;
}
{
jRadioButton2 = new JRadioButton() ;
 jPanel2. add(jRadioButton2) ;
jRadioButton2. setText("\u975e\u63a8\u8350\u6559\u6750") ;
}
{
buttonGroup1 = new ButtonGroup() ;
buttonGroup1. add(jRadioButton1) ;
buttonGroup1. add(jRadioButton2) ;
}
{
ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
new String[] { "2006年", "2007年", "2008年", "2009年" }) ;
jComboBox1 = new JComboBox() ;
jPanel2. add(jComboBox1) ;
jComboBox1. setModel(jComboBox1Model) ;
}
{
ComboBoxModel jComboBox2Model = new DefaultComboBoxModel(
new String[] { "1月", "2月", "3月", "4月", "5月", "6月","7月", "8月", "9月", "10月", "11月", "12月" }) ;
jComboBox2 = new JComboBox() ;
jPanel2. add(jComboBox2) ;
jComboBox2. setModel(jComboBox2Model) ;
}
jPanel3 = new JPanel() ;
GridLayout jPanel3Layout = new GridLayout(3, 2) ;
jPanel3Layout. setColumns(1) ;
jPanel3Layout. setHgap(5) ;
jPanel3Layout. setVgap(5) ;
jPanel3. setLayout(jPanel3Layout) ;
getContentPane() . add(jPanel3, BorderLayout. SOUTH ) ;
jPanel3. setPreferredSize(new java. awt. Dimension(392, 141) ) ;
{
jLabel2 = new JLabel() ;
jPanel3. add(jLabel2) ;
jLabel2. setText("\u6559\u6750\u7c7b\u578b") ;
}
{
 ListModel jList1Model = new DefaultComboBoxModel(
new String[] { "高职高专", "国家级规划", "教执委规划", "近三年出版" }) ;
jList1 = new JList() ;
jList1. setModel(jList1Model) ;
}
{
jScrollPane1 = new JScrollPane() ;
jScrollPane1
. setVerticalScrollBarPolicy(jScrollPane1. VERTICAL_SCROLLBAR_ALWAYS ) ;
jScrollPane1. getViewport() . add(jList1) ;
jList1. setPreferredSize(new java. awt. Dimension(190, 70) ) ;
jPanel3. add(jScrollPane1) ;
}
{
jLabel3 = new JLabel() ;
jPanel3. add(jLabel3) ;
jLabel3. setText("\u4fe1\u606f\u8bf4\u660e") ;
}
{
jTextArea1 = new JTextArea(5, 10) ;
}
{
jScrollPane2 = new JScrollPane() ;
jScrollPane2
. setVerticalScrollBarPolicy(jScrollPane2. VERTICAL_SCROLLBAR_ALWAYS ) ;
jScrollPane2
. setHorizontalScrollBarPolicy(jScrollPane2. HORIZONTAL_SCROLLBAR_ALWAYS ) ;
jScrollPane2. getViewport() . add(jTextArea1) ;
jPanel3. add(jScrollPane2) ;
}
{
jButton1 = new JButton() ;
jPanel3. add(jButton1) ;
jButton1. setText("\u4fdd\u5b58") ;
}
{
jButton2 = new JButton() ;
jPanel3. add(jButton2) ;
jButton2. setText("\u9000\u51fa") ;
 }
}
pack() ;
setSize(400, 300) ;
setTitle("教材录入界面") ;
} catch (Exception e) {
e. printStackTrace() ;
}
}
}
