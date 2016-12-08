
import java.net.*;
import java.io.*;

public class Ex11_2_URLReader {

	public static void main(String[] args) throws Exception {
		//声明main方法抛出所有的异常
		URL urlSina = new URL("http://www.sina.com.cn/");
		//构建一个URL对象
		BufferedReader in = new BufferedReader(
				new InputStreamReader(urlSina.openStream()));
		//使用openStream得到一输入流并由此构造一个BufferedReader对象
		String str;
		while((str=in.readLine())!=null)
			System.out.println(str);
		in.close();
		//关闭输入流
	}

}
