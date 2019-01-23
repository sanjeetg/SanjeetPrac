import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println(stack.toString());
		reverse(stack);
		System.out.println();
		System.out.println(stack.toString());

	}

	private static void reverse(Stack<Integer> stack) {

		if (stack == null || stack.isEmpty()) {
			return;
		}

		int item = stack.pop();
		reverse(stack);
		insertAtBotton(stack, item);
	}

	private static void insertAtBotton(Stack<Integer> stack, int item) {
		if (stack.isEmpty()) {
			stack.push(item);
			return;
		}

		int temp = stack.pop();
		insertAtBotton(stack, item);
		stack.push(temp);
	}
}
