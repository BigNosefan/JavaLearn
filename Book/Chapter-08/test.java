import java.awt.*;
import javax.swing.*;
//����awt����
public class test{
	public static void main(String args[]){
		//create container and set layout
		JFrame frame = new JFrame("Understand AWT");
		frame.setLayout(new BorderLayout());
		//��������������ӵ�������
		JButton btn = new JButton("��ť");
		frame.add(btn);
		frame.setDefaultCloseOperation(3);
		//���ã�Frame����λ�����С����ʾ
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}