
import java.util.*;

public class Ex10_16_Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("����");
		stack.push("����");
		stack.push("����");
		stack.push("����");
		int index = stack.search("����");
		if(index>0) {
			System.out.println("'����'��ջ�еĵ�"+index+"��Ԫ��");
		} else {
			System.out.println("ջ�в�����'����'");
		}
		System.out.println("ջ�е�Ԫ�طֱ�Ϊ:");
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}

}
