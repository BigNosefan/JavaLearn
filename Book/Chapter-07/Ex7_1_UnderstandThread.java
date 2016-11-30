
public class Ex7_1_UnderstandThread {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("线程1");
		myThread1.start();
		MyThread myThread2 = new MyThread("线程2");
		myThread2.start();
		for(int i = 0 ; i < 10 ; i++ )
			System.out.println("主程序第"+(i+1)+"次输出");
	}

}
class MyThread extends Thread{
	MyThread(String name){
		super(name);
	}
	public void run(){
		for(int i = 0 ; i < 10; i++)
			System.out.println(this.getName()+"第"+(i+1)+"次输出");
	}
}
