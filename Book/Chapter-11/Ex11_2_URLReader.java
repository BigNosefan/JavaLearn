
import java.net.*;
import java.io.*;

public class Ex11_2_URLReader {

	public static void main(String[] args) throws Exception {
		//����main�����׳����е��쳣
		URL urlSina = new URL("http://www.sina.com.cn/");
		//����һ��URL����
		BufferedReader in = new BufferedReader(
				new InputStreamReader(urlSina.openStream()));
		//ʹ��openStream�õ�һ���������ɴ˹���һ��BufferedReader����
		String str;
		while((str=in.readLine())!=null)
			System.out.println(str);
		in.close();
		//�ر�������
	}

}
