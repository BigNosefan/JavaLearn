
import javax.swing.JOptionPane;

public class Ex3_2_Pointtoword {
	// �������ת��Ϊ����
	public static String pointtoword (int grad) {
		String gradWord;
		switch (grad) {
		case 10:
		case 9:
			gradWord = "��";
			break;
		case 8:
			gradWord = "��";
			break;
		case 7:
			gradWord = "��";
			break;
		case 6:
			gradWord = "����";
			break;
		default:
			gradWord = "������";
		}
		return gradWord; 
	}

	public static void main(String[] args) {
		// �������
		String score;
		score = JOptionPane.showInputDialog("���������");
		long sc = Long.parseLong(score);
		JOptionPane.showMessageDialog(null, pointtoword((int)sc/10));
	}

}
