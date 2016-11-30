
public class Ex7_4_UseRunnable {

	public static void main(String[] args) {
		Master master = new Master("如来");
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
		System.out.println("我是一名大学生！我叫"+this.name);
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
	public void printInformation(){//覆盖父类方法
		System.out.println("我是一名研究生！我叫"+this.name);
	}
}
