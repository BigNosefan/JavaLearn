
import java.util.*;

public class Ex10_13_Iterator {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("��ѧӢ��");
		list.add("�ߵ���ѧ");
		list.add("��ѧ����");
		list.add("��ѧ����");
		System.out.println("�����е�Ԫ��:"+list);
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equals("��ѧ����"))
				it.remove();
			} 
		System.out.println("ɾ�����Ԫ��:"+list);
	}

}
