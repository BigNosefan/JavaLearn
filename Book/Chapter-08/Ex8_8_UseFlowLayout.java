import java.awt.FlowLayout;
import javax.swing.*;

public class Ex8_8_UseFlowLayout {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		//���ô��ڱ���
		frm.setTitle("ʹ�������ֹ�����");
		FlowLayout flowlayout = new FlowLayout();
		frm.setLayout(flowlayout);

		JLabel label = new JLabel("��	��:");
		frm.getContentPane().add(label);
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioBtn = new JRadioButton("����");
		btnGroup.add(manRadioBtn);
		JRadioButton womanRadioBtn = new JRadioButton("Ů��");
		btnGroup.add(womanRadioBtn);
		manRadioBtn.setSelected(true);
		
		frm.getContentPane().add(manRadioBtn);
		frm.getContentPane().add(womanRadioBtn);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		frm.setBounds(100,100,400,200);

		
		
	}

}
