
import java.io.*;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex4_4_StudentScore {

	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		int classCount = 3;//�ݶ�������
		int[] studentCount = { 2,3,4 };
		double score[][] = new double[classCount][];
		boolean contiGo = true;
		for (int i=0; i<score.length; i++)
			score[i] = new double[studentCount[i]];

		//����ɼ�
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		for(int i=0; i<classCount; i++) {
			for(int j=0; j<studentCount[i]; j++) {
				while(contiGo) {
					System.out.println("�������"+(i+1)+"��ĵ�"+(j+1)+"��ͬѧ�ĳɼ�:");
					str = buf.readLine();
					try {
						score[i][j] = Double.parseDouble(str);
						if (0>score[i][j] || 100<score[i][j])
							JOptionPane.showMessageDialog(null,"�������");
						else
							break;
					} catch(Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null,"�������","��ʾ��Ϣ",JOptionPane.QUESTION_MESSAGE);;
					}
				}//while
			}//for
		}//for 
		//�������
		double sumScore=0,avgScore=0;
		for(int i=0; i<classCount; i++) {
			sumScore = 0;
			for(int j=0; j<studentCount[i]; j++) {
				sumScore += score[i][j];
			}
			avgScore = sumScore / studentCount[i];
			System.out.println("��"+(i+1)+"�����ƽ���ɼ�Ϊ: "+avgScore);
			
		}
	}
}
