
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import ;

public class Ex8_13_sunAudio {

	public static void main(String[] args) {
		// ��������ļ�
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./jilejingtu.wav");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�Ҳ��������ļ���");
		}
		BufferedInputStream sb = new BufferedInputStream(fis);
		//��������
		AudioStream as = null;
		as = new AudioStream(sb);
		
		//û��sun.audio��

	}

}
