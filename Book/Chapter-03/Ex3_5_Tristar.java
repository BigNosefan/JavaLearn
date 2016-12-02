
public class Ex3_5_Tristar {
	public static final int N = 10;
	public static void main(String[] args) {
		int i = 1;
		while(i <= Ex3_5_Tristar.N) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");//»»ÐÐ
			i++;
		}
		
	}

}
