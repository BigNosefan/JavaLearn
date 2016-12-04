
import java.io.*;

public class Ex9_4_BufferedStream {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			FileWriter fout = new FileWriter(".\\buffer.txt",true);
			BufferedWriter bout = new BufferedWriter(fout);
			String str;
			while(true){
				str = br.readLine();
				if(str.equals("end"))
					break;
				bout.write(str);
				bout.newLine();
			}
			bout.close();
			FileReader fin = new FileReader(".\\buffer.txt");//打开文本文件读
			BufferedReader bin = new BufferedReader(fin);
			while((str=bin.readLine())!=null)
				System.out.println(str);
			bin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
