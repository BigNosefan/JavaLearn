package chapter_5;

public class Ex5_8_this3 {

	public static void main(String[] args) {
		Dog tom = new Dog();
		System.out.println("������tom�����"+tom.height+"cm,����:"+tom.age);
		tom = tom.grow();
		System.out.println("������tom�����:"+tom.height+"cm,����:"+tom.age);
		Dog tom2 = tom.grow();
		System.out.println("������tom�����:"+tom.height+"cm,����:"+tom.age);
		System.out.println("������tom2�����:"+tom2.height+"cm,����:"+tom2.age);
		System.out.println("tom��tom2�Ƿ���ͬ:"+(tom==tom2));

	}

}

class Dog {
	int age;
	float height;
	public Dog() {
		age = 1;
		height = 10;
	}
	public Dog grow() {
		height += 10;
		age++;
		return this;
	}
}