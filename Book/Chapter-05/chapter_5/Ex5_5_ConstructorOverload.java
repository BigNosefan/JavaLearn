package chapter_5;

public class Ex5_5_ConstructorOverload {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		System.out.println("p1的原点为("+p1.x+","+p1.y+")");
		System.out.println("p2的原点为("+p2.x+","+p2.y+")");
	}

}
class Point {
	int x,y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}

