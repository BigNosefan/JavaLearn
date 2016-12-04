
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Ex4_3_MatrixMultiply {

	public static void main(String[] args) {
		int j,k,aH=2,aL=3,bL=4,a[][],b[][],c[][];
//		BufferedReader buf = new BufferedReader(
//				new InputStreamReader(System.in));
//		String str;
		a = new int[aH][aL];
		b = new int[aL][bL];
		c = new int[aH][bL];
		//随机产生两个数组的元素
		for(j=0; j<aH; j++)
			for(k=0; k<aL; k++) {
				a[j][k] = (int)(Math.random()*10);
			}
		for(j=0; j<aL; j++)
			for(k=0; k<bL; k++) {
				b[j][k] = (int)(Math.random()*10);
			}
		System.out.println("a矩阵的内容是");
		for(j=0; j<aH; j++) {
			for(k=0; k<aL; k++) {
				System.out.print(""+a[j][k]+" ");
			}
			System.out.println("");
		}
		System.out.println("b矩阵的内容是");
		for(j=0; j<aL; j++) {
			for(k=0; k<bL; k++) {
				System.out.print(""+b[j][k]+" ");
			}
			System.out.println("");
		}
		//c矩阵
		for(j=0; j<aH; j++)
			for(k=0; k<bL; k++) {
				c[j][k] = 0;
				for(int t = 0; t<aL; t++) {
					c[j][k] += a[j][t]*b[t][k];
				}
			}


		System.out.println("c矩阵的内容是");
		for(j=0; j<aH; j++) {
			for(k=0; k<bL; k++) {
				System.out.print(""+c[j][k]+" ");
			}
			System.out.println("");
		}
	}
}
