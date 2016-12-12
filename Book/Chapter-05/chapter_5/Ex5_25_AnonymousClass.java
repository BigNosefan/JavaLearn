package chapter_5;


abstract class Student3 {
	abstract void speak();
}
class Teacher2 {
	void look(Student3 s) {
		s.speak();
	}
}
public class Ex5_25_AnonymousClass {

	public static void main(String[] args) {
		Teacher2 zhang = new Teacher2();
		Student3 liu = new Student3() {
			@Override
			void speak() {
				System.out.println("�����������еķ���");
			}
		};
		zhang.look(liu);
	}

}
