
public class Ex3_4_Multiply99table {
	public static String Convert(int digit) {
		String[] digitWords = {"ʮ","һ","��","��","��","��","��","��","��","��"};
		String result = "";
		while(digit>0) {
			result += digitWords[digit-((int)digit/10)*10];
			digit = digit/10;
		}
		StringBuffer re = new StringBuffer(result);
		result = (re.reverse()).toString();
		if(result.length()>=2 && !result.substring(1,2).equals("ʮ"))
			result = result.substring(0,1) +"ʮ"+ result.substring(1,2);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Convert(450));
		for(int i = 1; i<10; i++) {
			for(int j = i; j<10; j++) {
				System.out.print(Convert(i)+Convert(j));
				String s = Convert(i*j);
				if(s.length()<2)
					System.out.print("��");
				System.out.print(s+"  ");
			}
			System.out.println("");
		}
	}

}
