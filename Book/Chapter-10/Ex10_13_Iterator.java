
import java.util.*;

public class Ex10_13_Iterator {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("大学英语");
		list.add("高等数学");
		list.add("大学语文");
		list.add("大学物理");
		System.out.println("数组中的元素:"+list);
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equals("大学语文"))
				it.remove();
			} 
		System.out.println("删除后的元素:"+list);
	}

}
