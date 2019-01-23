
public class NthToLastLinkedList {

	// 3, 5, 6, 7, 8, 9, 10, 11, 12

	// take the length of the linked list l
	// element = (len - k+1)

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		int size;

		public void push(int data) {
			Node node = new Node(data);
			node.next = head;
			head = next;
			size++;
		}

		public void printNthToLast(int n, Node head) {
			int i = size - n + 1;
			Node current = head;
			while (i > 0) {
				current = current.next;
			}
			System.out.println(current.data);
		}
	}

	public static void main(String[] args) {

	}

}
