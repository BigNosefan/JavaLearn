import java.awt.*;
import javax.swing.*;
//����awt��Swing����
public class Ex8_2_UnderstandSwing{
	public static void main(String[] args){
		//create container and set layout
		JFrame frame = new JFrame("Understand AWT");
		frame.setLayout(new BorderLayout());
		//�������������ӵ�������
		JButton btn = new JButton("��ť");
		frame.add(btn);
		//���ã�JFrame����λ�����С����ʾ
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}
