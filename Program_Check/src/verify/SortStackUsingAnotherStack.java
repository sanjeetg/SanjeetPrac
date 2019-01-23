package verify;

import java.util.Stack;

public class SortStackUsingAnotherStack {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	private static void sort(Stack<Integer> stack1, Stack<Integer> stack2) {

		while (!stack1.isEmpty()) {
			if (stack2.isEmpty()) {
				stack2.push(stack1.pop());
			}
			int temp = stack1.pop();
			while (!stack2.isEmpty() && stack2.peek() > temp) {
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
