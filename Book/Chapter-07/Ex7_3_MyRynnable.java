
public class Ex7_3_MyRynnable implements Runnable {
	String threadName;

	public Ex7_3_MyRynnable(String threadName){
		System.out.println("���̵߳����֣�" + threadName);
		this.threadName = threadName;
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println("�������е��߳���"+threadName);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("��ʼ����������");
		Ex7_3_MyRynnable myThread1 = new Ex7_3_MyRynnable("����");
		Ex7_3_MyRynnable myThread2 = new Ex7_3_MyRynnable("�����");
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread1.start();
		thread2.start();
		System.out.println("���������н���");
	}

}
