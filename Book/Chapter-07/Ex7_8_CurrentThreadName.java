
public class Ex7_8_CurrentThreadName {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();//�����޷�ֱ�ӶԵ�ǰ�߳̽��в����ĺ���
		System.out.println("��ǰ�̵߳������ǣ�"+thread.getName());
		ShowCurrentThreadName cthread = new ShowCurrentThreadName();
		cthread.start();

	}

}

class ShowCurrentThreadName extends Thread{
	public void run(){
		System.out.println("����̵߳������ǣ�"+this.getName());
		Thread thread = Thread.currentThread();
		System.out.println("��ǰ�̵߳������ǣ�"+thread.getName());
	}
}
