
public class Ex7_11_TestWaitNotify {

	public static void main(String[] args) {
		ProducerThread pt = new ProducerThread();
		System.out.println("生产结果为: sum="+pt.getSum());;
	}

}
class ProducerThread extends Thread {
	long sum = 0;
	ProducerThread(){
		start();
	}
	public void run(){
		synchronized (this) {
			for( int i=0; i<1000; i++){
				sum += i;
			}
			System.out.println("生产者生产完毕数据: sum="+sum);
//			notify();//为什么不发信号也是正确结果
		}
	}
	synchronized public long getSum(){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sum;
	}
	
}
