
public class Ex10_9_TestRunTime {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long a = 0;
		for(int i = 0; i<1000000000; i++)
			a+=i;
		long end = System.currentTimeMillis();
		double time = (double) ((end - start)/1000.0);
		System.out.println("总时间为:"+time+"秒");
		System.out.println("a = "+a);
	}

}
