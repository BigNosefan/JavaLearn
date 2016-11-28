package chapter_8;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex8_7_UseBorderLayout {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		//���ô������
		frm.setTitle("ʹ�ò��ֹ�����");
		frm.setLayout(new BorderLayout());
		//NORTH
		JLabel northLabel  = new JLabel("��������(NORTH)");
		northLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(northLabel, BorderLayout.NORTH);
		//SOUTH
		JLabel southLabel  = new JLabel("�����ײ�(SOUTH)");
		southLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(southLabel, BorderLayout.SOUTH);
		//EAST
		JLabel eastLabel  = new JLabel("�����Ҳ�(EAST)");
		eastLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(eastLabel, BorderLayout.EAST);
		//WEST
		JLabel westLabel  = new JLabel("�������(WEST)");
		westLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(westLabel, BorderLayout.WEST);
		//CENTER
		JLabel centerLabel = new JLabel("��������(CENTER)");
		centerLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(centerLabel, BorderLayout.CENTER);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200,200,400,200);
		frm.setVisible(true);
	}

}
