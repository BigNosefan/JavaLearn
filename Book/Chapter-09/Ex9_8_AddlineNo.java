
import java.io.*;

public class Ex9_8_AddlineNo {

	public static void main(String[] args) {
		String str = null;
		FileReader file;
		try {
			file = new FileReader(".\\src\\chapter_9\\Ex9_8_AddlineNo.java");
			LineNumberReader in = new LineNumberReader(file);
			while((str=in.readLine())!=null)
				System.out.println(in.getLineNumber()+":"+str);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ��򲻿����߶��ļ�����");
		} catch (IOException e) {
			System.out.println("�ļ��򲻿����߶��ļ�����");
		}

	}

}
