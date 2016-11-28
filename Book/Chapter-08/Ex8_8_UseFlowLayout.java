import java.awt.FlowLayout;
import javax.swing.*;

public class Ex8_8_UseFlowLayout {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame();
		//设置窗口标题
		frm.setTitle("使用流布局管理器");
		FlowLayout flowlayout = new FlowLayout();
		frm.setLayout(flowlayout);

		JLabel label = new JLabel("性	别:");
		frm.getContentPane().add(label);
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioBtn = new JRadioButton("男人");
		btnGroup.add(manRadioBtn);
		JRadioButton womanRadioBtn = new JRadioButton("女人");
		btnGroup.add(womanRadioBtn);
		manRadioBtn.setSelected(true);
		
		frm.getContentPane().add(manRadioBtn);
		frm.getContentPane().add(womanRadioBtn);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		frm.setBounds(100,100,400,200);

		
		
	}

}
