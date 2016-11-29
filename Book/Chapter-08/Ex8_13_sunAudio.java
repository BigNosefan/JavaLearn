
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import ;

public class Ex8_13_sunAudio {

	public static void main(String[] args) {
		// 获得声音文件
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./jilejingtu.wav");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("找不到声音文件！");
		}
		BufferedInputStream sb = new BufferedInputStream(fis);
		//打开声音流
		AudioStream as = null;
		as = new AudioStream(sb);
		
		//没有sun.audio包

	}

}
