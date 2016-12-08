
import java.util.*;

public class Ex10_17_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("张三");
		list.add("李四");
		list.add("");
		list.add("王五");
		list.add("赵六");
		int size = list.size();
		System.out.println("队列中共有"+size+"个元素,分别为:");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(""))
				list.set(i, "待添加");
		}
		System.out.println(list);
	}

}
