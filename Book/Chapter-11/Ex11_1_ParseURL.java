
import java.net.*;

public class Ex11_1_ParseURL {

	public static void main(String[] args) {
		URL sampleURL = null;
		try {
			sampleURL = new URL("http://www.sina.com.cn:80/index.html");// ����URL����
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//��ʾsampleURL����ĸ�����ֵ
		System.out.println("Э��:"+sampleURL.getProtocol());
		System.out.println("������:"+sampleURL.getHost());
		System.out.println("�˿ں�:"+sampleURL.getPort());
		System.out.println("�ļ���:"+sampleURL.getFile());
		System.out.println("ê��:"+sampleURL.getRef());
		
	}

}
