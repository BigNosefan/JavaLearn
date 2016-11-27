import javax.swing.*;
public class Ex8_4_UseScrollPane{
	public static void main(String[] args){
		// ��������
		JFrame frame = new JFrame();
		// ���ô������
		frame.setTitle("ʹ��JScrollPane");
		// ���ô���رշ�ʽ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������������2��32��
		JTextArea output = new JTextArea();
		output.setRows(2);
		output.setColumns(32);
	//	output.setEditable(false);
		
		// ����������岢������ʾ���Ե�
		JScrollPane outputScrollPane = new JScrollPane();
		outputScrollPane.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(outputScrollPane);
		outputScrollPane.setViewportView(output);
		output.setText("���� JScrollPane ʹ��ʾ����\n\r �������ɾ�������ַ��۲���ʾ���仯��");

		// ���ýṹ��JFrame����λ�����С����ʾ
		frame.setBounds(450,230,400,80);
		frame.setVisible(true);
	}
}
