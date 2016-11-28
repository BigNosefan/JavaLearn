package chapter_8;

import javax.swing.*;
import java.awt.GridLayout;

public class Ex8_9_UseGridLayout {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		//���ô��ڱ���
		frm.setTitle("ʹ�ø��Ӳ��ֹ�����");
		
		//�������������������
		GridLayout gridLayout = new GridLayout(2,2);
		frm.setLayout(gridLayout);
// ����
//		JLabel l1 = new JLabel("1");
//		JLabel l2 = new JLabel("2");
//		JLabel l3 = new JLabel("3");
//		JLabel l4 = new JLabel("4");
//		JLabel l5 = new JLabel("5");
//
//		frm.getContentPane().add(l1);
//		frm.getContentPane().add(l2);
//		frm.getContentPane().add(l3);
//		frm.getContentPane().add(l4);
//		frm.getContentPane().add(l5);

		//�������������ӵ�������
		JLabel label = new JLabel("�γ̣�");
		frm.getContentPane().add(label);
		
		JCheckBox mathsButton = new JCheckBox("�ߵ���ѧ");
		mathsButton.setSelected(true);
		frm.add(mathsButton);

		JCheckBox englishButton = new JCheckBox("English");
		frm.add(englishButton);

		//Ϊ�˶��� ��һ���ձ�ǩ
		JLabel emptyLabel = new JLabel();
		frm.add(emptyLabel);

		JCheckBox introductionButton = new JCheckBox("���������");
		frm.add(introductionButton);
		
		JCheckBox programmingButton = new JCheckBox("������������");
		frm.add(programmingButton);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(100,100,400,200);
		frm.setVisible(true);


	}

}
