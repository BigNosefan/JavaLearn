
public class Ex4_6_StringBuffer {

	public static void main(String[] args) {
		System.out.println("----------����������������----------");
		char c1, ch1[] = new char[13];
		String str1 = "";
		StringBuffer sbufstr1;
		boolean bFlag = true;
		sbufstr1 = new StringBuffer("NewStrBuffer");
		// 1.�ַ�������������ת��Ϊ�ַ���
		System.out.println("1.�ַ�������������ת��Ϊ�ַ���");
		str1 = sbufstr1.toString();//toString()�������ת������
		str1 = str1+":";
		System.out.println(sbufstr1);
		System.out.println(str1);
		ch1 = str1.toCharArray();
		System.out.println(ch1);
		// 2.׷���ַ�
		System.out.println("2.׷���ַ�");
		sbufstr1 = sbufstr1.append("bFlag");
		sbufstr1 = sbufstr1.append(3456);
		sbufstr1 = sbufstr1.append(12345678987654L);
		sbufstr1 = sbufstr1.append(3.14159F);
		sbufstr1 = sbufstr1.append(2.71717171);
		sbufstr1 = sbufstr1.append("�й�");
		sbufstr1 = sbufstr1.append(new StringBuffer("��ž�"));
		System.out.println(sbufstr1);
		// 3.�����ַ� 
		System.out.println("3.�����ַ�");
		sbufstr1 = new StringBuffer("NewStrBuffer");
		sbufstr1.insert(6, "ing");
		System.out.println(sbufstr1);
		sbufstr1.insert(sbufstr1.length(),":");
		System.out.println(sbufstr1);
		sbufstr1.insert(0,bFlag);
		System.out.println(sbufstr1);
		sbufstr1.insert(0,ch1,6,3);
		System.out.println(sbufstr1);
		sbufstr1.insert(0,3456);
		System.out.println(sbufstr1);
		sbufstr1.insert(0,12345678987654L);
		System.out.println(sbufstr1);
		sbufstr1.insert(0,3.14159F);
		System.out.println(sbufstr1);
		sbufstr1.insert(0,2.71);
		System.out.println(sbufstr1);
		sbufstr1.insert(0, new StringBuffer("��ž�"));
		sbufstr1.insert(0,"�й�����");
		System.out.println(sbufstr1);
		// 4.�滻�ַ�
		System.out.println("4.�滻�ַ�");
		str1 = "You have a ";
		sbufstr1 = sbufstr1.replace(0, 6, str1);
		System.out.println(sbufstr1);
		// 5.ɾ���ַ�
		System.out.println("5.ɾ���ַ�");
		sbufstr1.delete(3, 6);
		System.out.println(sbufstr1);
		sbufstr1.deleteCharAt(2);
		System.out.println(sbufstr1);
		// 6.����ַ���
		// substr1.ensureCapacity(1);
		System.out.println("6.����ַ���");
		System.out.println(sbufstr1);
		sbufstr1.setLength(0);
		System.out.println(sbufstr1);
		sbufstr1.append("�й������ž�");
		System.out.println(sbufstr1);
		// 7.ȡ�ַ�
		System.out.println("7.ȡ�ַ�");
		c1 = sbufstr1.charAt(3);
		System.out.println(c1);
		// 8.ȡ�Ӵ�
		System.out.println("8.ȡ�Ӵ�");
		str1 = sbufstr1.substring(3);
		System.out.println(str1);
		str1 = sbufstr1.substring(3,6);
		System.out.println(str1);
		// 9.�ַ�����ת
		System.out.println("9.�ַ�����ת");
		sbufstr1.reverse();
		System.out.println(sbufstr1);
		str1 = sbufstr1.toString();
		System.out.println(str1);
		System.out.println("----------����������Ѿ�����----------");
	}

}
