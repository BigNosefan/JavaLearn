package chapter_5;

// this��ʹ��

public class Ex5_6_this1 {

	public static void main(String[] args) {
		Cat garfield = new Cat("��",12);
		garfield.grow();
		garfield.grow();
	}

}
class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;
		this.cry();
	}
	public Cat(String color,int height) {
		this(color); //ͨ��this�����������캯��
		this.height= height;
	}
	public void cry() {
		System.out.println("����һֻ"+this.furColor+"��ɫ��è");
	}
	public void grow() {
		this.height++;
		System.out.println("�ҳ����ˣ�����Ϊ:"+this.height);
	}
}