package chapter_6;

import java.io.*;

public class Ex6_6_ThrowsException {
	public static int calc(int x) throws Exception {
		int z=0;
		if(x==0)
			throw new Exception("����Ϊ0!");
		z = 110/x;
		return z;
	}

	public static void main(String[] args) {
		int a = 0;
		try {
			a = calc(0);
			System.out.println("a="+a);
		} catch (Exception e) {
			System.out.println("���÷���calcʱ�����쳣:"+e.getMessage());
			e.printStackTrace();
			
		}
	}
}