package chapter_8;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex8_7_UseBorderLayout {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame();
		//设置窗体标题
		frm.setTitle("使用布局管理器");
		frm.setLayout(new BorderLayout());
		//NORTH
		JLabel northLabel  = new JLabel("容器顶部(NORTH)");
		northLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(northLabel, BorderLayout.NORTH);
		//SOUTH
		JLabel southLabel  = new JLabel("容器底部(SOUTH)");
		southLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(southLabel, BorderLayout.SOUTH);
		//EAST
		JLabel eastLabel  = new JLabel("容器右侧(EAST)");
		eastLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(eastLabel, BorderLayout.EAST);
		//WEST
		JLabel westLabel  = new JLabel("容器左侧(WEST)");
		westLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(westLabel, BorderLayout.WEST);
		//CENTER
		JLabel centerLabel = new JLabel("容器中心(CENTER)");
		centerLabel.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(centerLabel, BorderLayout.CENTER);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(200,200,400,200);
		frm.setVisible(true);
	}

}
