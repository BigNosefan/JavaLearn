
import java.io.*;

public class Ex9_3_FileAppendStream {

	public static void main(String[] args) {
		String str = "Welcome to Java!\n";
		FileWriter fw;
		try {
			fw = new FileWriter(".\\filestream.txt",true);//boolean append����true��ȷ��׷��
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//���ļ������
		
		FileReader fr;
		try {
			fr = new FileReader(".\\filestream.txt");
			int value;
			while((value = fr.read())!=-1)
				System.out.print((char)value);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
