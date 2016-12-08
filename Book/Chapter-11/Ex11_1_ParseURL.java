
import java.net.*;

public class Ex11_1_ParseURL {

	public static void main(String[] args) {
		URL sampleURL = null;
		try {
			sampleURL = new URL("http://www.sina.com.cn:80/index.html");// 创建URL对象
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//显示sampleURL对象的各属性值
		System.out.println("协议:"+sampleURL.getProtocol());
		System.out.println("主机名:"+sampleURL.getHost());
		System.out.println("端口号:"+sampleURL.getPort());
		System.out.println("文件名:"+sampleURL.getFile());
		System.out.println("锚点:"+sampleURL.getRef());
		
	}

}
