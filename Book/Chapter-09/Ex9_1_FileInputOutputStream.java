
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex9_1_FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos;
			fos = new FileOutputStream(".\\filestream.dat"); //���ļ������
			byte[] array = {1,3,5,7,9,11,13,15,17,19};
			for(int i=0; i<array.length; i++)
				fos.write(array[i]); //д���ݵ��ļ������
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis;
		fis = new FileInputStream(".\\filestream.dat");//���ļ�������
		int value;
		while((value = fis.read())!=-1)
			System.out.print(value+" ");
		fis.close();

		

	}

}
