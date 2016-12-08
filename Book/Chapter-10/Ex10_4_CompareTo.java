
public class Ex10_4_CompareTo {

	public static void main(String[] args) {
		Double number = 5.34;
		int a = number.compareTo(7.38);
		int b = number.compareTo(5.34);
		int c = number.compareTo(2.52);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("number="+number);
		System.out.println("(int)number="+number.intValue());// 相当于非包裹类型的强制转换
		Double number1 = 5.64;
		System.out.println("number1="+number1);
		System.out.println("(int)number1="+number1.intValue());// 只保留整数，并不四舍五入
	}

}
