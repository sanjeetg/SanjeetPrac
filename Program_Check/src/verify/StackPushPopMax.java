package verify;

class Node {
	int data;
	Node next;
	Node secondMax;

	Node(int data) {
		this.data = data;
	}

}

public class StackPushPopMax {

	Node head;
	Node max;

	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		if (max == null || data > max.data) {
			temp.secondMax = max;
			max = temp;
		}
	}

	public int pop() {
		int data = head.data;
		if (data == max.data) {
			max.data = head.secondMax.data;
		}
		head = head.next;
		return data;
	}
}
