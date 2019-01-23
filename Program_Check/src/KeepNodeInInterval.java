
public class KeepNodeInInterval {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {
	}

	public void deleteInInterval(Node node, int a, int b) {

		int keep = a;
		int delete = b;

		if (node == null) {
			return;
		}

		Node current = node;

		while (keep > 0) {
			if (current != null) {
				current = current.next;
			}
			keep--;
		}
		while (delete > 0) {
			if (current != null && current.next != null) {
				current.data = current.next.data;
				current.next = current.next.next;
			}
			delete--;
		}
		deleteInInterval(current, a, b);
	}

}
