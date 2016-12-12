package chapter_5;

public class Ex5_24_InnerClass {

	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.testShip();
	}

}

class Parcel {
	private Contents c;
	private Destination d;
	private int contentsCount = 0;
	class Contents {
		private int i;
		Contents(int i) {
			this.i = i;
			contentsCount++;
		}
		int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	void ship() {
		System.out.println("运输"+c.value()+"到"+d.label);
	}
	public void testShip() {
		c = new Contents(22);
		d = new Destination("山西太原");
		ship();
	}
}