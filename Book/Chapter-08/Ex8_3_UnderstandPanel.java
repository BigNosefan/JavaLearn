import java.awt.*;
import javax.swing.*;

public class Ex8_3_UnderstandPanel{
	public static void main(String[] args){
		// ��������
		JFrame frame = new JFrame();
		// ���ô������
		frame.setTitle("ʹ��JPanel");
		// ���ô���رշ�ʽ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������岢���ڴ����ϰ벿��
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel,BorderLayout.NORTH);

		// �������������򣬿ɱ༭��������룬25��
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);

		// ����������ť
		JButton myBtn = new JButton("search");

		// �������������Ͱ�ť
		topPanel.add(input);
		topPanel.add(myBtn);

		// ������岢���ڴ����°벿��
		JPanel bottomPanel = new JPanel();
		frame.getContentPane().add(bottomPanel,BorderLayout.CENTER);

		// ������������6��32�У����ɱ༭
		JTextArea output = new JTextArea();
		output.setRows(6);
		output.setColumns(32);
		output.setEditable(false);

		// ���ӽ�������
		bottomPanel.add(output);
		//bottomPanel.setVisible(true);??ΪʲôҪ������ʾ
		//���ã�JFrame����λ�����С����ʾ
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}