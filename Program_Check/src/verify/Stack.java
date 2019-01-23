package verify;

public class Stack {

	int top = -1;
	int size;

	int items[];

	Stack(int size) {
		this.size = size;
		items = new int[size];
	}

	public boolean isFull() {
		if (size == items.length) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void push(int item) {
		if (isFull()) {
			return;
		}
		items[++top] = item;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int item = items[top--];
		size--;
		return item;
	}

	public int peek() {
		return items[top];
	}

}
