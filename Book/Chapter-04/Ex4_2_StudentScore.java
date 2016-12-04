
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.JOptionPane;

public class Ex4_2_StudentScore {

	public static void main(String[] args) {
		int k, count = 5;// count 为学生的个数

		double score[] = new double[count];// 学生成绩的数组
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
					System.out.println("成绩不应该为0，请重新输入。");
				} else 
					break;
			}// while
		}// for
		// 采用冒泡法,对成绩排序
		double[] scoreCopy = new double[count];
		for(int i = 0; i<count; i++)
			scoreCopy[i] = score[i];
		for(int i = count-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(scoreCopy[j] > scoreCopy[j+1]) {
					double tmp = scoreCopy[j];
					scoreCopy[j] = scoreCopy[j+1];
					scoreCopy[j+1] = tmp;
				}
			}
		}
		//输出
		for(int i=0; i<scoreCopy.length; i++)
			System.out.print(scoreCopy[i]+"\t");
	}
}
