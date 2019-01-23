
public class SortALinkedList {

	Node head;

	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	public void traverse(Node head) {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public Node sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = sort(head);
		Node right = sort(nextOfMiddle);

		Node sortedNode = sortedNode(left, right);

		return sortedNode;

	}

	private Node sortedNode(Node left, Node right) {
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}

		Node temp = null;

		if (left.data <= right.data) {
			temp = left;
			temp.next = sortedNode(left.next, right);
		} else {
			temp = right;
			temp.next = sortedNode(left, right.next);
		}

		return temp;
	}

	private Node getMiddle(Node node) {

		Node fast = node.next;
		Node slow = node;

		while (fast != null && fast.next != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
		}

		return slow;

	}

	public static void main(String[] args) {

		SortALinkedList sort = new SortALinkedList();

		sort.push(40);
		sort.push(20);
		sort.push(30);
		sort.push(50);
		sort.push(10);

		sort.traverse(sort.head);

		Node sortedNode = sort.sort(sort.head);

		System.out.println();

		sort.traverse(sortedNode);

	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

}
