import java.awt.*;
import javax.swing.*;

public class Ex8_3_UnderstandPanel{
	public static void main(String[] args){
		// 创建窗体
		JFrame frame = new JFrame();
		// 设置窗体标题
		frame.setTitle("使用JPanel");
		// 设置窗体关闭方式
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 创建面板并放在窗体上半部分
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel,BorderLayout.NORTH);

		// 创建输入搜索框，可编辑，左侧输入，25列
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);

		// 创建搜索按钮
		JButton myBtn = new JButton("search");

		// 添加搜索输入框和按钮
		topPanel.add(input);
		topPanel.add(myBtn);

		// 创建面板并放在窗体下半部分
		JPanel bottomPanel = new JPanel();
		frame.getContentPane().add(bottomPanel,BorderLayout.CENTER);

		// 创建结果输出框，6行32列，不可编辑
		JTextArea output = new JTextArea();
		output.setRows(6);
		output.setColumns(32);
		output.setEditable(false);

		// 添加结果输出框
		bottomPanel.add(output);
		//bottomPanel.setVisible(true);??为什么要设置显示
		//重置（JFrame）的位置与大小并显示
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}
