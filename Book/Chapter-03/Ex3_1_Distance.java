
import javax.swing.JOptionPane;

public class Ex3_1_Distance {
	public static String distancetoword(long dist){
		/* ������ת��Ϊ�������� */
		String distanceWord = null;
		if (0 < dist && dist <= 500) {
			distanceWord = "�̾���";
		} else if (500 < dist && dist <= 1000) {
			distanceWord = "�о���";
		} else if (1000 < dist && dist <= 2000) {
			distanceWord = "Զ����";
		} else if (dist > 2000) {
			distanceWord = "��Զ����";
		} else 
			distanceWord = "";
		return distanceWord;
	}
	public static void main(String[] args) {
	//ͨ���Ի���������빫����	
		String distanceString = JOptionPane.showInputDialog("�����빫����");
		//�����ַ���ת��Ϊ����������
		
		long distanceValue = Long.parseLong(distanceString);
		//���ת�����
		JOptionPane.showMessageDialog(null, distancetoword(distanceValue),
				"ת�����",JOptionPane.INFORMATION_MESSAGE);
	}

}