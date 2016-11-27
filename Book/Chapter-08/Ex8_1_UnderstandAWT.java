import java.awt.*;
//导入awt内容
public class Ex8_1_UnderstandAWT{
	public static void main(String[] args){
		//create container and set layout
		Frame frame = new Frame("Understand AWT");
		frame.setLayout(new BorderLayout());
		//创建组件，并添加到容器中
		Button btn = new Button("按钮");
		frame.add(btn);
		//重置（Frame）的位置与大小并显示
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}
