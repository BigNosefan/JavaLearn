
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.JOptionPane;

public class Ex4_2_StudentScore {

	public static void main(String[] args) {
		int k, count = 5;// count Ϊѧ���ĸ���

		double score[] = new double[count];// ѧ���ɼ�������
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
					System.out.println("�ɼ���Ӧ��Ϊ0�����������롣");
				} else 
					break;
			}// while
		}// for
		// ����ð�ݷ�,�Գɼ�����
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
		//���
		for(int i=0; i<scoreCopy.length; i++)
			System.out.print(scoreCopy[i]+"\t");
	}
}
