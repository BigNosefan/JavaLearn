
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Ex4_1_StudentScore {

	public static void main(String[] args) {
		int k, count = 2;// count Ϊѧ���ĸ���

		double score[] = new double[count];// ѧ���ɼ�������
		double doubleSum = 0.0, doubleAver = 0.0,maxScore = 0.0;
			// ѧ�����ܳɼ���ƽ���ɼ������ֵ
		boolean contiGo = true;
		String str = null;
		BufferedReader buf =new BufferedReader(
				new InputStreamReader(System.in));
		for(k = 0; k<count; k++) {
			while (contiGo) {
				System.out.print("�������"+(k+1)+"��ѧ���ĳɼ���");
				try {
					str = buf.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				score[k] = Double.parseDouble(str);
				if (0>score[k] || 100 < score[k]) {
					JOptionPane.showMessageDialog(null, "�ɼ���Ӧ��Ϊ0�����������롣","��ʾ��Ϣ",JOptionPane.QUESTION_MESSAGE);
				} else 
					break;
			}
			doubleSum += score[k];
			if (score[k]>maxScore) maxScore = score[k];
		}
		doubleAver = doubleSum / count;//ƽ���ɼ�����2λ��
		System.out.println("��" + count + "��ͬѧ��ƽ���ɼ���:" + doubleAver);
		System.out.println("��" + count + "��ͬѧ����óɼ���:" + maxScore);
	}
}
