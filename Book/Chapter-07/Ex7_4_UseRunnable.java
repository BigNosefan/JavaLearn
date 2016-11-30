
public class Ex7_4_UseRunnable {

	public static void main(String[] args) {
		Master master = new Master("����");
		Thread thread = new Thread(master);
		thread.start();
	}

}

class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void printInformation(){
		System.out.println("����һ����ѧ�����ҽ�"+this.name);
	}
}
class Master extends Student implements Runnable{
	public Master(String name){
		super(name);
	}
	@Override
	public void run() {
		printInformation();
	}
	@Override
	public void printInformation(){//���Ǹ��෽��
		System.out.println("����һ���о������ҽ�"+this.name);
	}
}
