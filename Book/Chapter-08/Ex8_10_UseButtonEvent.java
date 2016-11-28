package chapter_8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex8_10_UseButtonEvent {

	public static void main(String[] args) {
		//创建窗口
		JFrame frm = new JFrame();
		frm.setLayout(new BorderLayout());
		frm.setTitle("理解事件");
		
		//创建按钮对象和注册监听进行授权，参数为事件对象处理者
		JButton myBtn = new JButton("按我");
		frm.getContentPane().add(myBtn, BorderLayout.CENTER);
		ButtonHandler btnHandler = new ButtonHandler();
		myBtn.addActionListener(btnHandler);
		
		frm.setBounds(100,100,400,200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
//实现单击事件监听器接口，成为单击事件ActionEvent的处理者
//这个类被我不小心定义在上面类体里了，报错 为什么呢？
class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("你按下啦");
		}
	}