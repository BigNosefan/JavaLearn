
import java.util.*;

public class Ex10_15_Vector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("�����1��");
		vct.add("�����2��");
		vct.add("�����3��");
		System.out.println("�����ĳ�ʼԪ��Ϊ:"+vct);
		//��������Ĵ洢�ռ��С
		System.out.println("�洢�ռ�Ϊ"+vct.capacity());
		System.out.println("Ԫ�ظ���Ϊ"+vct.size());
		vct.setSize(5);
		System.out.println("��һ���޸ĺ�������Ԫ��Ϊ:"+vct);
		System.out.println("�洢�ռ�Ϊ"+vct.capacity());
		System.out.println("Ԫ�ظ���Ϊ"+vct.size());
		vct.setSize(2);
		System.out.println("�ڶ����޸ĺ�������Ԫ��Ϊ:"+vct);
		System.out.println("�洢�ռ�Ϊ"+vct.capacity());
		System.out.println("Ԫ�ظ���Ϊ"+vct.size());
	}

}
