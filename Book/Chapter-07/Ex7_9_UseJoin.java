
public class Ex7_9_UseJoin {

	public static void main(String[] args) {
		System.out.println("主线程启动执行，并创建子线程!");
		RunThread rthread = new RunThread();
		try {
			rthread.join();
//			rthread.join(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("子线程终止，主线程继续执行");

	}

}
class RunThread extends Thread{
	RunThread(){
		start();
	}
	public void run(){
		System.out.println("子线程的名字是:"+this.getName()+",已开始运行，预计执行3秒！");
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("子线程运行完毕退出！");
	}
}
