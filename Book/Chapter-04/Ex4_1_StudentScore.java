
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Ex4_1_StudentScore {

	public static void main(String[] args) {
		int k, count = 2;// count 为学生的个数

		double score[] = new double[count];// 学生成绩的数组
		double doubleSum = 0.0, doubleAver = 0.0,maxScore = 0.0;
			// 学生的总成绩，平均成绩，最大值
		boolean contiGo = true;
		String str = null;
		BufferedReader buf =new BufferedReader(
				new InputStreamReader(System.in));
		for(k = 0; k<count; k++) {
			while (contiGo) {
				System.out.print("请输入第"+(k+1)+"个学生的成绩：");
				try {
					str = buf.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				score[k] = Double.parseDouble(str);
				if (0>score[k] || 100 < score[k]) {
					JOptionPane.showMessageDialog(null, "成绩不应该为0，请重新输入。","提示信息",JOptionPane.QUESTION_MESSAGE);
				} else 
					break;
			}
			doubleSum += score[k];
			if (score[k]>maxScore) maxScore = score[k];
		}
		doubleAver = doubleSum / count;//平均成绩保留2位数
		System.out.println("这" + count + "个同学的平均成绩是:" + doubleAver);
		System.out.println("这" + count + "个同学的最好成绩是:" + maxScore);
	}
}
