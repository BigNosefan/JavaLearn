
/**
 * 	hash set �ǲ��ܲ���˳����Ҳ������ظ�Ԫ�ص�
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
		hash.add("003"); // �ظ�Ԫ��δ������
		System.out.println("�˹�ϣ���е�Ԫ�طֱ�Ϊ:"+hash);
		System.out.println("�˹�ϣ���е�Ԫ�ظ���Ϊ:"+hash.size());
	}

}
