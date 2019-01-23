import java.util.Stack;

public class SortAStackUsingAnotherStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(20);
		stack.push(2);
		stack.push(16);
		stack.push(12);
		stack.push(8);
		stack.push(15);

		print(stack);
		System.out.println();
		print(sortStack(stack));
	}

	private static Stack<Integer> sortStack(Stack<Integer> stack) {

		if (stack == null || stack.isEmpty()) {
			return stack;
		}

		Stack<Integer> tempStack = new Stack<>();

		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!tempStack.isEmpty() && tempStack.peek() > temp) {
				stack.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}

	private static void print(Stack<Integer> stack) {
		for (Integer i : stack) {
			System.out.print(i + " ");
		}
	}
}
