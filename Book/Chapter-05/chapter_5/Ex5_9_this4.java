package chapter_5;

public class Ex5_9_this4 {

	public static void main(String[] args) {
		Animal a = new Animal(10, 20);
		System.out.println("新生小动物");
		System.out.println("年龄="+a.age+"\t体重="+a.weight+"克\t身高="+a.height+"cm");
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