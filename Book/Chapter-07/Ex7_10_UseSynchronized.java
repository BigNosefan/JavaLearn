
public class Ex7_10_UseSynchronized {

	public static void main(String[] args) {
		int size = 100;
		for(int t=0; t<5; t++){
			Sum sum = new Sum(0);
			AddOneThread[] rathread = new AddOneThread[size];
			for(int i=0; i<size; i++){
				try{
					rathread[i] = new AddOneThread(sum);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			//��������δ��룬�����п������߳�δ�ȵ����߳��������������
			for(int i=0; i<size; i++){
				try{
					rathread[i].join();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println("��"+(t+1)+"�Σ�sum="+sum.sum);
		}
	}
}
class AddOneThread extends Thread{
	Sum sum;

	public AddOneThread(Sum sum){
		this.sum = sum;
		start();
	}

	public void run(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sum.addOne();
	}
	
}

class Sum {
	int sum;
	public Sum(int sum){
		this.sum = sum;
	}
//	public void addOne(){
//		// synchronized(this){
//		sum += 1;// }
//	}
//	public void addOne(){
//		 synchronized(this){
//		sum += 1;
//		}
//	}
	public synchronized void addOne(){
		sum += 1;
	}
}
