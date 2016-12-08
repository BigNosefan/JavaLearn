
public class Ex10_1_TestEquals {

	public static void main(String[] args) {
		String name1 = new String("张三");
		String name2 = new String("张三");
		String name3 = "张三";
		String name4 = "张三";
		System.out.println(name1.equals(name2)); // true
		System.out.println(name1.equals(name3)); // true
		System.out.println(name1==name2); // false
		System.out.println(name1==name3); // false 
		System.out.println(name3==name4); // true
	}

}
