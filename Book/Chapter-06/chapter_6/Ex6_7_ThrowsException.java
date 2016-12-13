package chapter_6;

import java.io.*;

public class Ex6_7_ThrowsException {

	public static void main(String[] args) {
		
		System.out.println("输入一行文本:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inputReader = new BufferedReader(isr);
		String inputLine = inputReader.readLine();
		System.out.println("输入的文本时:" + inputLine);
	
	}

}
