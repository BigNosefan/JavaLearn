/**
 * 
 * @author  BigNosefan
 * ע�� ����˵�������ȼ����������������ϻ����Խ��Ϊ��������ȼ��Ľ�����start(),
 * �����л���ȸ����ȼ����߳�������ģ����Ƿ������������ȼ����߳���start(),��ô
 * һ���������.
 * 
 */
public class Ex7_6_ChangeThreadPriority extends Thread {
	String threadName;
	public Ex7_6_ChangeThreadPriority(String threadName){
		this.threadName = threadName;
		System.out.println("���̵߳�����:"+this.threadName);
		System.out.println("�����߳�\""+this.threadName+"\"ʱ�����ȼ���"+this.getPriority());
	}

	public static void main(String[] args) {
		System.out.println("��ʼ����������");
		Ex7_6_ChangeThreadPriority thread1 = new Ex7_6_ChangeThreadPriority("����");
		Ex7_6_ChangeThreadPriority thread2 = new Ex7_6_ChangeThreadPriority("�����");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(MAX_PRIORITY);
		thread1.start();
		thread2.start();
		System.out.println("���������н���");
		


	}
	public void run(){
		System.out.println("�������еĳ���\""+this.threadName+"\"�����ȼ�Ϊ"+this.getPriority());;
	}

}
