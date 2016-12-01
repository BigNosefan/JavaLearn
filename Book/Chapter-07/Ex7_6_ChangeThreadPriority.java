/**
 * 
 * @author  BigNosefan
 * 注： 书上说进程优先级大的先输出，可是上机测试结果为如果低优先级的进程先start(),
 * 还是有机会比高优先级的线程先输出的，但是反过来，高优先级的线程先start(),那么
 * 一定会先输出.
 * 
 */
public class Ex7_6_ChangeThreadPriority extends Thread {
	String threadName;
	public Ex7_6_ChangeThreadPriority(String threadName){
		this.threadName = threadName;
		System.out.println("本线程的名字:"+this.threadName);
		System.out.println("创建线程\""+this.threadName+"\"时的优先级是"+this.getPriority());
	}

	public static void main(String[] args) {
		System.out.println("开始运行主程序");
		Ex7_6_ChangeThreadPriority thread1 = new Ex7_6_ChangeThreadPriority("如来");
		Ex7_6_ChangeThreadPriority thread2 = new Ex7_6_ChangeThreadPriority("孙悟空");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(MAX_PRIORITY);
		thread1.start();
		thread2.start();
		System.out.println("主程序运行结束");
		


	}
	public void run(){
		System.out.println("正在运行的程序\""+this.threadName+"\"的优先级为"+this.getPriority());;
	}

}
