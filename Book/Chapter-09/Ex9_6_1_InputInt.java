
import java.io.*;

public class Ex9_6_1_InputInt  {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			String sInt;
			System.out.println("������һ������");
			sInt = br.readLine();
			int iInt = Integer.parseInt(sInt);
			System.out.println("�����������: "+iInt);
	}

}
