package chapter_5;

public class Ex5_23_abstract {

	public static void main(String[] args) {
//		Animal2 a = new Animal2(); // 禁止实例抽象化类
		Cat2 tom = new Cat2();
		tom.eat();
		tom.run();
	}

}

abstract class Animal2 {
	String eyeColor;
	String furColor;
	int age;

	public Animal2() {
		age = 0;
	}
	abstract void eat();
	abstract void run();
}

class Cat2 extends Animal2 {
	void eat() {
		System.out.println("吃老鼠");
	}
	void run() {
		System.out.println("猫扑");
	}
}