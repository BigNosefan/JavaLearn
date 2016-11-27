import javax.swing.*;
public class Ex8_5_UseSplitPane{
	public static void main(String[] args){
		// ��������
		JFrame frame = new JFrame();
		// ���ô������
		frame.setTitle("ʹ��JSplitPane");
		// ���ô���رշ�ʽ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ֱ�ָ����
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
//		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		frame.getContentPane().add(splitPane);

		// �����ı������ӵ�������ࣨ�ϲࣩ
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);
		splitPane.setLeftComponent(input);

		// ����������ť�����ӵ������һ��²�
		JButton myBtn = new JButton("����");
		splitPane.setRightComponent(myBtn);

		// ���÷ָ�������ϲ�Ϊ140�����ظ�
		splitPane.setDividerLocation(140);

		// ���ýṹ��JFrame����λ�����С����ʾ
		frame.setBounds(450,230,400,200);
		frame.setVisible(true);
	}
}