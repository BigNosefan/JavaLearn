package chapter_5;

// 定义一个point类，该类包含两个成员变量，x和y和一个成员方法 init(),对x和y赋初值

public class Ex5_2_Point {
	int x,y;
	public void init() {
		this.x = 0;
		this.y = 0;
	}
	public void init(int x , int y) {
		this.x = x;
		this.y = y;
	}
}
