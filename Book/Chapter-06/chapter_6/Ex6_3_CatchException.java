package chapter_6;

public class Ex6_3_CatchException {

	public static void main(String[] args) {
		int a,b,c;
		a = 110;
		b = 0;
		try {
			c = a / b;
			System.out.println(""+a+"/"+b+"="+c);
		} catch (ArithmeticException e) {
			System.out.println("���ֱ�0�����쳣���");
		} catch (Exception e) {
			System.out.println("�쳣����Ϊ"+e);
		} finally {
			System.out.println("����="+a);
			System.out.println("������="+b);
		}
		a = 110;
		b = 10;
		try {
			c = a / b;
			System.out.println(""+a+"/"+b+"="+c);
		} catch (ArithmeticException e) {
			System.out.println("���ֱ�0�����쳣���");
		} catch (Exception e) {
			System.out.println("�쳣����Ϊ"+e);
		} finally {
			System.out.println("����="+a);
			System.out.println("������="+b);
		}

	}

}
