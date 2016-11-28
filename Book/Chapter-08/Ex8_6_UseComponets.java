import java.awt.Font;
import javax.swing.*;

public class Ex8_6_UseComponets {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("ʹ�ó������");
		
		frm.setLayout(null);//���ò����ò��ֹ�����
		//��������������뵽������
		
		//1.��ǩ�����ʹ��
		JLabel label = new JLabel("���������");
		label.setBounds(5,5,160,80);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("G:/Code/JavaProject/chapter_8/src/label.jpg"));
		label.setHorizontalAlignment(JLabel.CENTER);

		//���ñ�Ƕ�ͼƬ��λ��
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		frm.getContentPane().add(label);

		//2.�԰�ť����ʹ��
		JButton myBtn = new JButton("����һ����ť");
		myBtn.setBounds(170,5,120,30);
		frm.getContentPane().add(myBtn);

		//3.�ı��������ʹ��
		JTextField text = new JTextField();
		text.setText("�������ı�");
		text.setHorizontalAlignment(JTextField.LEFT);
		text.setBounds(170,45,120,30);
		frm.getContentPane().add(text);
		
		//4.����������ʹ��
		JPasswordField passwd = new JPasswordField();
		passwd.setText("My Password");
		passwd.setHorizontalAlignment(JPasswordField.LEFT);
		passwd.setBounds(170,80,120,30);
//		passwd.setEchoChar('X');
		frm.getContentPane().add(passwd);

		//5.�ı��������ʹ��
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);//���������˻��Զ�ת����һ��
		textArea.setColumns(10);
		textArea.setRows(3);
		textArea.append("����һ�������ı���");
		textArea.insert("�����Զ��س�.", 11);
		textArea.setBounds(300,5,120,60);
		frm.getContentPane().add(textArea);
		
		//6.��ѡ��ť�μ�8-8
		//7.��ѡ��ť�μ�8-9
		
		//8.�б������ʹ��
		String[] likes = {"Ů����","����","�����","�óԵ�","���","�ְ�����","Ǯ"};
		JList<String> list = new JList<String>(likes);
		list.setSelectedIndex(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(7);//����û�ã�������
		JScrollPane scrollpane =new JScrollPane();
//		scrollpane.add(list);  //����ĵط�������������
		scrollpane.setViewportView(list);
		scrollpane.setBounds(30,130,120,120);
		frm.getContentPane().add(scrollpane);
		
		//9.ѡ��������ʹ��
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
