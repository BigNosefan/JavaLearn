package chapter_5;

public class Ex5_8_this3 {

	public static void main(String[] args) {
		Dog tom = new Dog();
		System.out.println("新生的tom的身高"+tom.height+"cm,年龄:"+tom.age);
		tom = tom.grow();
		System.out.println("长大后的tom的身高:"+tom.height+"cm,年龄:"+tom.age);
		Dog tom2 = tom.grow();
		System.out.println("长大后的tom的身高:"+tom.height+"cm,年龄:"+tom.age);
		System.out.println("长大后的tom2的身高:"+tom2.height+"cm,年龄:"+tom2.age);
		System.out.println("tom和tom2是否相同:"+(tom==tom2));

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