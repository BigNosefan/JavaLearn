
public class Ex7_9_UseJoin {

	public static void main(String[] args) {
		System.out.println("���߳�����ִ�У����������߳�!");
		RunThread rthread = new RunThread();
		try {
			rthread.join();
//			rthread.join(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���߳���ֹ�����̼߳���ִ��");

	}

}
class RunThread extends Thread{
	RunThread(){
		start();
	}
	public void run(){
		System.out.println("���̵߳�������:"+this.getName()+",�ѿ�ʼ���У�Ԥ��ִ��3�룡");
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���߳���������˳���");
	}
}
