import java.awt.*;
import javax.swing.*;
//导入awt和Swing内容
public class Ex8_2_UnderstandSwing{
	public static void main(String[] args){
		//create container and set layout
		JFrame frame = new JFrame("Understand AWT");
		frame.setLayout(new BorderLayout());
		//创建组件，并添加到容器中
		JButton btn = new JButton("按钮");
		frame.add(btn);
		//重置（JFrame）的位置与大小并显示
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}
