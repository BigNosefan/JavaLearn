
public class Ex10_5_UpperLower {

	public static void main(String[] args) {
		char score[] = {'a','B','C','d','e'};
		System.out.println("数组元素为:");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+"; ");
		}
		for(int i=0; i<score.length; i++) {
			score[i]=Character.toUpperCase(score[i]);
		}
		System.out.println("");
		System.out.println("转换后结果为:");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+"; ");
		}
	}

}
