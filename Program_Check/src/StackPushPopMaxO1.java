
public class StackPushPopMaxO1 {

	Node head;
	Node max;

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

		if (max == null || data > max.data) {
			node.oldMax = max;
			max = node;
		}
	}

	public int pop() {
		int data = head.data;
		if (data == max.data) {
			max = head.oldMax;
		}
		head = head.next;
		return data;
	}

	public int max() {
		if (max == null) {
			throw new RuntimeException("No max value found");
		}
		return max.data;
	}

	public static void main(String[] args) {
		StackPushPopMaxO1 o1 = new StackPushPopMaxO1();
		o1.push(5);
		o1.push(8);
		o1.push(9);
		o1.push(3);
		o1.push(4);
		o1.push(10);
		o1.push(6);

		System.out.println("Max = " + o1.max());

		System.out.println("Pop - " + o1.pop());
		System.out.println("Max = " + o1.max());

		System.out.println("Pop - " + o1.pop());
		System.out.println("Max = " + o1.max());

	}

	class Node {
		int data;
		Node next;
		Node oldMax;

		Node(int data) {
			this.data = data;
		}
	}
}
