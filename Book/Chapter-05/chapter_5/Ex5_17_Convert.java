package chapter_5;

public class Ex5_17_Convert {

	public static void main(String[] args) {
		C c = new D();
		c.n = Math.PI;
//		c.w = 300;
//		c.cry();
		c.m = 186;
		c.f();
		c.g();

		D d = (D) c;
		d.n = 555;
		d.f();
		d.g();
		d.cry();
	}

}

class C {
	int m;
	double n;
	void f() {
		System.out.println("������̳еķ���f()");
	}
	void g() {
		System.out.println("��ã�n="+n+" m="+m);
	}
}
class D extends C {
	int n =12;
	void g() {
		System.out.println("������д����g,n="+n+" m="+m);
	}
	void cry() {
		System.out.println("���������ķ���");
	}
}