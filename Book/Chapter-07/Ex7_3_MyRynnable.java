
public class Ex7_3_MyRynnable implements Runnable {
	String threadName;

	public Ex7_3_MyRynnable(String threadName){
		System.out.println("本线程的名字：" + threadName);
		this.threadName = threadName;
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println("正在运行的线程是"+threadName);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("开始运行主函数");
		Ex7_3_MyRynnable myThread1 = new Ex7_3_MyRynnable("如来");
		Ex7_3_MyRynnable myThread2 = new Ex7_3_MyRynnable("孙悟空");
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread1.start();
		thread2.start();
		System.out.println("主函数运行结束");
	}

}
