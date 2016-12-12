package chapter_5;

public class Ex5_3_Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println("圆的面积是:"+c1.getArea());
	}

}

class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
}