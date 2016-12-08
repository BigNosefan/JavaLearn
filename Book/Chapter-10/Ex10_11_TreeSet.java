
import java.util.TreeSet;

public class Ex10_11_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("003");
		tree.add("004");
		tree.add("001");
		tree.add("002");
		tree.add("005");
		tree.add("003");
		System.out.println("此树集中的元素分别为:"+tree);
		System.out.println("此树集中的元素个数为:"+tree.size());
	}

}
