package chapter_6;

import java.io.*;

public class Ex6_7_ThrowsException {

	public static void main(String[] args) {
		
		System.out.println("����һ���ı�:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inputReader = new BufferedReader(isr);
		String inputLine = inputReader.readLine();
		System.out.println("������ı�ʱ:" + inputLine);
	
	}

}
