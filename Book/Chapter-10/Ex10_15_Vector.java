
import java.util.*;

public class Ex10_15_Vector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		vct.add("计算机1班");
		vct.add("计算机2班");
		vct.add("计算机3班");
		System.out.println("向量的初始元素为:"+vct);
		//输出向量的存储空间大小
		System.out.println("存储空间为"+vct.capacity());
		System.out.println("元素个数为"+vct.size());
		vct.setSize(5);
		System.out.println("第一次修改后向量的元素为:"+vct);
		System.out.println("存储空间为"+vct.capacity());
		System.out.println("元素个数为"+vct.size());
		vct.setSize(2);
		System.out.println("第二次修改后向量的元素为:"+vct);
		System.out.println("存储空间为"+vct.capacity());
		System.out.println("元素个数为"+vct.size());
	}

}
