
import java.util.Scanner;

public class Ex4_7_StringMatch {

	public static void main(String[] args) {
		//��д��ĸ������Сд��ĸ����������
		String regex = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		Scanner in = new Scanner(System.in);
		String input ;
		while(true) {
			input = in.nextLine();
			if(input.equals("end"))
				break;
			if(input.matches(regex))
				System.out.println("YES!�����������");
			else
				System.out.println("NO!�������������");
		}
		in.close();

	}

}
