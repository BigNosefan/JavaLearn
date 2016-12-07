
import java.io.*;

public class Ex9_9_RandomAccess {
	final static int  DoubleSize = 8;
	void randomFileTest(String filename) throws IOException {
		RandomAccessFile rf = new RandomAccessFile(filename, "rw");
		for(int i=0; i<5; i++)
			rf.writeDouble(10.0*i);
		rf.seek(2*DoubleSize);
		rf.writeDouble(110.0001);
		rf.seek(0);
		for(int i=0; i<5; i++) {
			System.out.println("Value " + i + ": " + rf.readDouble());
		}
		rf.close();
	}
	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String fileName = null;
		Ex9_9_RandomAccess obj = null;

		try {
			System.out.println("请输入一个文件名");
			fileName = stdin.readLine();
			obj = new Ex9_9_RandomAccess();
			obj.randomFileTest(fileName);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件找不到");
		}

	}

}
