
import java.io.*;

public class Ex9_5_DataInputOutputStream {

	public static void main(String[] args) throws IOException {
		char c = 'A';
		int i = 3721;
		long l = 123456;
		float f = 3.14f;
		double d = 3.1415926535;
		String str = "�������������������ʾ��";
		//д
		DataOutputStream  dos = new DataOutputStream(
				new FileOutputStream(".\\datastream.dat"));//true����׷��
		dos.writeChar(c);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeUTF(str);
		dos.close();
		
		//��
		DataInputStream dis = new DataInputStream(
				new FileInputStream(".\\datastream.dat"));
		System.out.println("�ַ�:\t"+dis.readChar());
		System.out.println("����:\t"+dis.readInt());
		System.out.println("Long:\t"+dis.readLong());
		System.out.println("Float:\t"+dis.readFloat());
		System.out.println("Double:\t"+dis.readDouble());
		System.out.println("UTF:\t"+dis.readUTF());
		dis.close();
	}

}
