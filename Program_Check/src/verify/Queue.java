package verify;

public class Queue {

	int head = -1;
	int tail = -1;

	int noOfElements = 0;

	int items[];

	Queue(int size) {
		items = new int[size];
	}

	public boolean isFull() {
		return noOfElements == items.length;
	}

	public boolean isEmpty() {
		return noOfElements == 0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			return;
		}
		if (tail == items.length - 1) {
			tail = -1;
		}

		items[++tail] = item;
		noOfElements++;
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		if (head == items.length - 1) {
			head = -1;
		}
		int item = items[++head];
		noOfElements--;
		return item;
	}

	public int peek() {
		return items[head];
	}
}
