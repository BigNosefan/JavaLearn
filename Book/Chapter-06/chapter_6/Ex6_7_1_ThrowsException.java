package chapter_6;

import java.io.*;

public class Ex6_7_1_ThrowsException {

	public static void main(String[] args) {
		System.out.println("����һ���ı�:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inputReader = new BufferedReader(isr);
		try {
			String inputLine = inputReader.readLine();
			System.out.println("������ı�ʱ:" + inputLine);
		} catch (IOException e) {
			System.out.println("�����쳣:"+e);
		}
	}

}
