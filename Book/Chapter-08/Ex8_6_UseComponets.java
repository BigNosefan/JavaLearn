import java.awt.Font;
import javax.swing.*;

public class Ex8_6_UseComponets {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("使用常用组件");
		
		frm.setLayout(null);//设置不适用布局管理器
		//创建各组件并加入到容器中
		
		//1.标签组件的使用
		JLabel label = new JLabel("常用组件：");
		label.setBounds(5,5,160,80);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("G:/Code/JavaProject/chapter_8/src/label.jpg"));
		label.setHorizontalAlignment(JLabel.CENTER);

		//设置标记对图片的位置
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		frm.getContentPane().add(label);

		//2.对按钮键的使用
		JButton myBtn = new JButton("这是一个按钮");
		myBtn.setBounds(170,5,120,30);
		frm.getContentPane().add(myBtn);

		//3.文本框组件的使用
		JTextField text = new JTextField();
		text.setText("请输入文本");
		text.setHorizontalAlignment(JTextField.LEFT);
		text.setBounds(170,45,120,30);
		frm.getContentPane().add(text);
		
		//4.密码框组件的使用
		JPasswordField passwd = new JPasswordField();
		passwd.setText("My Password");
		passwd.setHorizontalAlignment(JPasswordField.LEFT);
		passwd.setBounds(170,80,120,30);
//		passwd.setEchoChar('X');
		frm.getContentPane().add(passwd);

		//5.文本域组件的使用
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);//当字数满了会自动转到下一行
		textArea.setColumns(10);
		textArea.setRows(3);
		textArea.append("这是一个多行文本域，");
		textArea.insert("将会自动回车.", 11);
		textArea.setBounds(300,5,120,60);
		frm.getContentPane().add(textArea);
		
		//6.单选按钮参见8-8
		//7.复选按钮参见8-9
		
		//8.列表组件的使用
		String[] likes = {"女朋友","篮球","计算机","好吃的","编程","爸爸妈妈","钱"};
		JList<String> list = new JList<String>(likes);
		list.setSelectedIndex(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(7);//好像没用？？？？
		JScrollPane scrollpane =new JScrollPane();
//		scrollpane.add(list);  //错误的地方！！！！！！
		scrollpane.setViewportView(list);
		scrollpane.setBounds(30,130,120,120);
		frm.getContentPane().add(scrollpane);
		
		//9.选择框组件的使用
		JComboBox<String> comboBox = new JComboBox<String>(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(3);
		comboBox.insertItemAt("something", 3);
		
		comboBox.setBounds(230,130,120,25);
		frm.getContentPane().add(comboBox);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400,200,450,320);
		frm.setVisible(true);
	}

}
