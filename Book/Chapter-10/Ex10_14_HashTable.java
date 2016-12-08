
import java.util.*;

public class Ex10_14_HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("001", "��ѧӢ��");
		table.put("002", "�ߵ���ѧ");
		table.put("003", "��ѧ����");
		table.put("004", "��ѧ����");
		System.out.println("��ϣ���е�Ԫ��Ϊ:");
		Enumeration<String> em = table.keys();
		while(em.hasMoreElements()) {
			Object key = em.nextElement();
			Object element = table.get(key);
			System.out.println(key+":"+element);
		}
		System.out.println("�ù�ϣ�����Ƿ����'��ѧ����':"+table.contains("��ѧ����"));
	}

}