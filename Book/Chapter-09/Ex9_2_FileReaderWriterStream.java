
import java.io.*;

public class Ex9_2_FileReaderWriterStream {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter(".\\filestream.txt");
			char array[] = {'文','本','输','入','输','出','实','例','。'};
			for(int i=0; i<array.length; i++)
				fw.write(array[i]);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}//打开文件输出流
		
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
