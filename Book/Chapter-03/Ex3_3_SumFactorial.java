
public class Ex3_3_SumFactorial {

	public static final int N = 20;
	public static long factorial (int n) {
		if(n == 1)
			return 1L;
		else
			return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		System.out.println("¼ÆËã½á¹û:"+sumFactorial(Ex3_3_SumFactorial.N));
	}
	public static long sumFactorial(int N) {
		long sign = -1,sum = 0;
		for(int i = 1; i<=N; i++){
			sum += sign * factorial(i);
			sign = -sign;
		}
		return sum;
	}

}
