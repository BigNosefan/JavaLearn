
import java.io.*;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex4_4_StudentScore {

	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		int classCount = 3;//暂定三个班
		int[] studentCount = { 2,3,4 };
		double score[][] = new double[classCount][];
		boolean contiGo = true;
		for (int i=0; i<score.length; i++)
			score[i] = new double[studentCount[i]];

		//输入成绩
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		for(int i=0; i<classCount; i++) {
			for(int j=0; j<studentCount[i]; j++) {
				while(contiGo) {
					System.out.println("请输入第"+(i+1)+"班的第"+(j+1)+"个同学的成绩:");
					str = buf.readLine();
					try {
						score[i][j] = Double.parseDouble(str);
						if (0>score[i][j] || 100<score[i][j])
							JOptionPane.showMessageDialog(null,"输入错误");
						else
							break;
					} catch(Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null,"输入错误","提示信息",JOptionPane.QUESTION_MESSAGE);;
					}
				}//while
			}//for
		}//for 
		//计算均分
		double sumScore=0,avgScore=0;
		for(int i=0; i<classCount; i++) {
			sumScore = 0;
			for(int j=0; j<studentCount[i]; j++) {
				sumScore += score[i][j];
			}
			avgScore = sumScore / studentCount[i];
			System.out.println("第"+(i+1)+"个班的平均成绩为: "+avgScore);
			
		}
	}
}
