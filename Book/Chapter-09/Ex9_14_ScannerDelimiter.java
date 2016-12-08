
import java.util.Scanner;

public class Ex9_14_ScannerDelimiter {

	public static void main(String[] args) {
		Scanner s = new Scanner("abcd efghijk..mnop,qrst uvwxyz");
		s.useDelimiter("\\.| |,");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
	}

}
