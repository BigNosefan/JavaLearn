
public class Ex7_5_TestExtendsThread {

	public static void main(String[] args) {
		Master1 master = new Master1("����");
		master.start();
		Student1 student = new Student1("�����");
		student.start();
	}

}
class Student1 extends Thread{
	String name;
	public Student1(String name){
		this.name = name;
	}
	public void run(){
		printInformation();
	}
	public void printInformation(){
		System.out.println("����һ�����������ҵ�������"+this.name);
	}
}
class Master1 extends Student1 {
	public Master1(String name){
		super(name);
	}
	public void run(){
		printInformation();
	}
	public void printInformation(){
		System.out.println("����һ���о������ҽ�"+this.name);
	}
	
}
