package chapter_5;

public class Ex5_9_this4 {

	public static void main(String[] args) {
		Animal a = new Animal(10, 20);
		System.out.println("����С����");
		System.out.println("����="+a.age+"\t����="+a.weight+"��\t���="+a.height+"cm");
	}

}

class Animal {
	int age;
	String furColor;
	String eyeColor;
	String name;
	float weight;
	float height;
	public Animal(String name) {
		this.age = 1;
		this.name = name;
	}
	public Animal(float height) {
		this.age = 1;
		this.height = height;
	}
	public Animal(float height,float weight) {
		this(height);
		this.weight = weight;
	}
}