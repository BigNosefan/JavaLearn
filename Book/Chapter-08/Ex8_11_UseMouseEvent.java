
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;//如果用第二种方法(WindowAdapter)就用不到这个
import java.awt.event.WindowListener;//如果用第二种方法就用不到这个

import javax.swing.*;

public class Ex8_11_UseMouseEvent {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame("鼠标事件使用示例");
		frm.setLayout(null);

		JLabel label = new JLabel("请在窗体内按住鼠标左键，拖动鼠标！");
		label.setBounds(45,5,200,25);
		frm.getContentPane().add(label);

		//创建文本对象
		JTextField text = new JTextField(30);//这里初始化30是什么意思？ --定义里面为int columns，意思是30列。
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);
		
		//注册监听器，参数为事件处理者对象
		MouseListenerImp mouse = new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addWindowListener(mouse);
		frm.addMouseMotionListener(mouse);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(500,250,400,200);
		frm.setVisible(true);
	}

}
//class MouseListenerImp implements WindowListener,MouseListener,MouseMotionListener{
//	private JTextField text;
//	MouseListenerImp(JTextField text){
//		this.text = text; 
//	}
//
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		String s = "拖拽鼠标，坐标：X="+e.getX()+",Y="+e.getY();
//		text.setText(s);
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		String s = "鼠标进入了窗体";
//		text.setText(s);
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		//为了让窗口能正常关闭
//		System.exit(1);
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		String s = "鼠标离开了窗体";
//		text.setText(s);
//	}
//
//	@Override
//	public void mouseMoved(MouseEvent e) {
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//	}
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//	}
//}

//或者使用适配器简化操作
class MouseListenerImp extends WindowAdapter implements MouseListener,MouseMotionListener{
	JTextField text;
	MouseListenerImp(JTextField text){
		this.text = text;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		String s = "拖拽鼠标，坐标：X="+e.getX()+",Y="+e.getY();
		text.setText(s);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String s = "鼠标进入了窗体";
		text.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String s = "鼠标离开了窗体";
		text.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
