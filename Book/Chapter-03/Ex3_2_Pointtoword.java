
import javax.swing.JOptionPane;

public class Ex3_2_Pointtoword {
	// 输入分数转化为文字
	public static String pointtoword (int grad) {
		String gradWord;
		switch (grad) {
		case 10:
		case 9:
			gradWord = "优";
			break;
		case 8:
			gradWord = "良";
			break;
		case 7:
			gradWord = "中";
			break;
		case 6:
			gradWord = "及格";
			break;
		default:
			gradWord = "不及格";
		}
		return gradWord; 
	}

	public static void main(String[] args) {
		// 输入分数
		String score;
		score = JOptionPane.showInputDialog("请输入分数");
		long sc = Long.parseLong(score);
		JOptionPane.showMessageDialog(null, pointtoword((int)sc/10));
	}

}
