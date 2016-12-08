
/**
 * 	hash set 是不管插入顺序而且不能有重复元素的
 */

import java.util.HashSet;
public class Ex10_10_HashSet {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("002");
		hash.add("003");
		hash.add("001");
		hash.add("004");
		hash.add("005");
		hash.add("003"); // 重复元素未被加入
		System.out.println("此哈希集中的元素分别为:"+hash);
		System.out.println("此哈希集中的元素个数为:"+hash.size());
	}

}
