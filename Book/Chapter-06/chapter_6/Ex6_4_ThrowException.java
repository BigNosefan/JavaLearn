package chapter_6;

public class Ex6_4_ThrowException {

	public static void main(String[] args) {
		int age = 200;
		try {
			if(age<0||age>120)
				throw new Exception("�������ݳ�����Χ");
			System.out.println("age = "+age);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
