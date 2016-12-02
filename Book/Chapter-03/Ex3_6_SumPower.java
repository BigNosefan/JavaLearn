
public class Ex3_6_SumPower {
	public static final int N = 10;
	public static final double power(int n) {
		double result = 1;
		int i = n;
		do {
			result *= n;
			i--;
		} while (i > 0);
		return result;
	}
	public static double sumPower(int n) {
		int i = 1;
		double sum = 0;
		do {
			sum += power(i++);
		} while (i <= n);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("¼ÆËã½á¹û"+sumPower(Ex3_6_SumPower.N));
	}

}
