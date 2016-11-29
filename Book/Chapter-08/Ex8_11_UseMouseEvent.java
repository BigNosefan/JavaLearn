
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;//����õڶ��ַ���(WindowAdapter)���ò������
import java.awt.event.WindowListener;//����õڶ��ַ������ò������

import javax.swing.*;

public class Ex8_11_UseMouseEvent {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame("����¼�ʹ��ʾ��");
		frm.setLayout(null);

		JLabel label = new JLabel("���ڴ����ڰ�ס���������϶���꣡");
		label.setBounds(45,5,200,25);
		frm.getContentPane().add(label);

		//�����ı�����
		JTextField text = new JTextField(30);//�����ʼ��30��ʲô��˼�� --��������Ϊint columns����˼��30�С�
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);
		
		//ע�������������Ϊ�¼������߶���
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
//		String s = "��ק��꣬���꣺X="+e.getX()+",Y="+e.getY();
//		text.setText(s);
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		String s = "�������˴���";
//		text.setText(s);
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		//Ϊ���ô����������ر�
//		System.exit(1);
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		String s = "����뿪�˴���";
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

//����ʹ���������򻯲���
class MouseListenerImp extends WindowAdapter implements MouseListener,MouseMotionListener{
	JTextField text;
	MouseListenerImp(JTextField text){
		this.text = text;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		String s = "��ק��꣬���꣺X="+e.getX()+",Y="+e.getY();
		text.setText(s);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String s = "�������˴���";
		text.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String s = "����뿪�˴���";
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
