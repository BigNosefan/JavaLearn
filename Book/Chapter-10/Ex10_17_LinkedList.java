
import java.util.*;

public class Ex10_17_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("");
		list.add("����");
		list.add("����");
		int size = list.size();
		System.out.println("�����й���"+size+"��Ԫ��,�ֱ�Ϊ:");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(""))
				list.set(i, "�����");
		}
		System.out.println(list);
	}

}
