
import java.util.Scanner;

public class Ex9_15_ScannerData {

	public static void main(String[] args) {
		Scanner s = new Scanner("123 3.1415 true abcdef");
		System.out.println(s.nextInt());
		System.out.println(s.nextDouble());
		System.out.println(s.nextBoolean());
		System.out.println(s.next());
	}
}
