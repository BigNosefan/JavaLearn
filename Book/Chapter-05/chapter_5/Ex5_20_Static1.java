package chapter_5;

public class Ex5_20_Static1 {

	public static void main(String[] args) {
		System.out.println("Ŀǰ����������Ϊ:"+Person3.totalNum);
		Person3 wang = new Person3("Wang");
		Person3 liu = new Person3("Liu");
		Person3 zhao = new Person3("Zhao");
		System.out.println("Ŀǰ����������Ϊ:"+liu.totalNum);
		System.out.println("Ŀǰ����������Ϊ:"+Person3.totalNum);
	}
}

class Person3 {
	static long totalNum=10000;
	int age;
	String name;
	String id;

	public Person3(String name) {
		totalNum ++;
		this.name = name;
		age = 1;
	}
}