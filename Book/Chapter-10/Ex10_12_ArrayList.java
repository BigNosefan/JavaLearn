
import java.util.ArrayList;;

public class Ex10_12_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("001");
		list.add("002");
		list.add("003");
		list.add("004");
		list.add("005");
		list.add("003");
		System.out.println("此列表中的元素分别为:"+list);
		System.out.println("此列表中的元素个数为:"+list.size());
	// List 中的元素可以重复  而且为有序的	
	}

}
