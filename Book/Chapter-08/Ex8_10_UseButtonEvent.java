package chapter_8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex8_10_UseButtonEvent {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		frm.setLayout(new BorderLayout());
		frm.setTitle("����¼�");
		
		//������ť�����ע�����������Ȩ������Ϊ�¼���������
		JButton myBtn = new JButton("����");
		frm.getContentPane().add(myBtn, BorderLayout.CENTER);
		ButtonHandler btnHandler = new ButtonHandler();
		myBtn.addActionListener(btnHandler);
		
		frm.setBounds(100,100,400,200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
//ʵ�ֵ����¼��������ӿڣ���Ϊ�����¼�ActionEvent�Ĵ�����
//����౻�Ҳ�С�Ķ����������������ˣ����� Ϊʲô�أ�
class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("�㰴����");
		}
	}