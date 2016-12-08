
public class Ex10_7_TestMath {

	public static void main(String[] args) {
		System.out.println("E="+Math.E);
		System.out.println("Pi="+Math.PI);
		System.out.println("abs(-6.8)="+Math.abs(-6.8));
		System.out.println("abs(-6)="+Math.abs(-6));
		System.out.println("max(2,7)="+Math.max(2,7));
		System.out.println("min(-2,-7)="+Math.min(-2, -7));
		System.out.println("sqrt(9)="+Math.sqrt(9));
		System.out.println("cbrt(8)="+Math.cbrt(8));
		System.out.println("sin(30degree)="+Math.sin(Math.toRadians(30)));
		System.out.println("atan(90degree)="+Math.atan(90.0*Math.PI/180));
		System.out.println("exp(1)="+Math.exp(1.0));
		System.out.println("pow(2,5)="+Math.pow(2, 5));
		System.out.println("log10(100)="+Math.log10(100));
		System.out.println("ceil(3.7)="+Math.ceil(3.7));//返回比该值大的最小整数 应该等于floor（a）+1
		System.out.println("floor(3.7)="+Math.floor(3.7));
		System.out.println("round(3.7)="+Math.round(3.7));
	}

}
