
import java.util.*;

public class Ex10_16_Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("张三");
		stack.push("李四");
		stack.push("王五");
		stack.push("赵六");
		int index = stack.search("王五");
		if(index>0) {
			System.out.println("'王五'是栈中的第"+index+"个元素");
		} else {
			System.out.println("栈中不存在'王五'");
		}
		System.out.println("栈中的元素分别为:");
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}

}
