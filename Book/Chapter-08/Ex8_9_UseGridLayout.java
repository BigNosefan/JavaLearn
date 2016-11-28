package chapter_8;

import javax.swing.*;
import java.awt.GridLayout;

public class Ex8_9_UseGridLayout {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame();
		//设置窗口标题
		frm.setTitle("使用格子布局管理器");
		
		//创建网格管理器并设置
		GridLayout gridLayout = new GridLayout(2,2);
		frm.setLayout(gridLayout);
// 测试
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

		//创建各组件并添加到容器中
		JLabel label = new JLabel("课程：");
		frm.getContentPane().add(label);
		
		JCheckBox mathsButton = new JCheckBox("高等数学");
		mathsButton.setSelected(true);
		frm.add(mathsButton);

		JCheckBox englishButton = new JCheckBox("English");
		frm.add(englishButton);

		//为了对齐 加一个空标签
		JLabel emptyLabel = new JLabel();
		frm.add(emptyLabel);

		JCheckBox introductionButton = new JCheckBox("计算机导论");
		frm.add(introductionButton);
		
		JCheckBox programmingButton = new JCheckBox("计算机程序设计");
		frm.add(programmingButton);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(100,100,400,200);
		frm.setVisible(true);


	}

}
