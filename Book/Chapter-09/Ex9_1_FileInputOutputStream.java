
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex9_1_FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos;
			fos = new FileOutputStream(".\\filestream.dat"); //打开文件输出流
			byte[] array = {1,3,5,7,9,11,13,15,17,19};
			for(int i=0; i<array.length; i++)
				fos.write(array[i]); //写数据到文件输出流
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis;
		fis = new FileInputStream(".\\filestream.dat");//打开文件输入流
		int value;
		while((value = fis.read())!=-1)
			System.out.print(value+" ");
		fis.close();

		

	}

}
