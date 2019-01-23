
public class SplitLinkedListInTwoHalves {

	Node head;

	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public Node split(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node fast = head.next;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
		}

		Node toSplit = slow;

		slow.next = null;

		return toSplit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
}
