
import java.util.Scanner;

public class Ex4_9_IPValidation {

	public static void main(String[] args) {
		String number = "((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
		String regex = "("+number+"\\.){3}"+number;
		Scanner in = new Scanner(System.in);
		System.out.println("����ip��ַ");
		while(true)
		{
			if(in.nextLine().matches(regex))
			{
				System.out.println("ƥ��");
				break;
			}
			else
				System.out.println("��ƥ��");
		}
		in.close();
	}

}
