import java.awt.*;
//����awt����
public class Ex8_1_UnderstandAWT{
	public static void main(String[] args){
		//create container and set layout
		Frame frame = new Frame("Understand AWT");
		frame.setLayout(new BorderLayout());
		//��������������ӵ�������
		Button btn = new Button("��ť");
		frame.add(btn);
		//���ã�Frame����λ�����С����ʾ
		frame.setBounds(400,200,400,200);
		frame.setVisible(true);
	}
}