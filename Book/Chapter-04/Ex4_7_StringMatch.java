
import java.util.Scanner;

public class Ex4_7_StringMatch {

	public static void main(String[] args) {
		//大写字母，三个小写字母，三个数字
		String regex = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		Scanner in = new Scanner(System.in);
		String input ;
		while(true) {
			input = in.nextLine();
			if(input.equals("end"))
				break;
			if(input.matches(regex))
				System.out.println("YES!符合输入规则");
			else
				System.out.println("NO!不符合输入规则");
		}
		in.close();

	}

}
