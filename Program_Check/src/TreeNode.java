import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {

	int data;
	TreeNode leftChild;
	TreeNode rightChild;

	TreeNode(int data) {
		this.data = data;
	}

	public TreeNode createBinaryTreeFormSortedArray(int arr[], int start, int end) {

		int mid = start + end / 2;
		TreeNode root = new TreeNode(mid);

		root.leftChild = createBinaryTreeFormSortedArray(arr, start, mid);
		root.rightChild = createBinaryTreeFormSortedArray(arr, mid + 1, end);

		return root;

	}

	public void insert(int data) {

		if (data <= this.data) {
			if (this.leftChild == null) {
				this.leftChild = new TreeNode(data);
			} else {
				this.leftChild.insert(data);
			}
		} else {
			if (this.rightChild == null) {
				this.rightChild = new TreeNode(data);
			} else {
				this.rightChild.insert(data);
			}
		}
	}

	public void traverse() {
		System.out.println(this.data);
		if (this.leftChild != null) {
			this.leftChild.traverse();
		}
		if (this.rightChild != null) {
			this.rightChild.traverse();
		}
	}

	public void preOrder() {
		System.out.println(this.data);

		if (this.leftChild != null)
			this.leftChild.preOrder();

		if (this.rightChild != null)
			this.rightChild.preOrder();
	}

	public void inOrder() {
		if (this.leftChild != null)
			this.leftChild.inOrder();
		if (this.rightChild != null)
			this.rightChild.inOrder();
	}

	public void postOrder() {
		if (this.leftChild != null)
			this.leftChild.postOrder();

		if (this.rightChild != null)
			this.rightChild.postOrder();

		System.out.println(this.data);
	}

	public void BFS() {
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(this);

		while (!queue.isEmpty()) {

			TreeNode node = queue.poll();
			System.out.print(node.data + " ");
			if (node.leftChild != null) {
				queue.add(node.leftChild);
			}
			if (node.rightChild != null) {
				queue.add(node.rightChild);
			}
		}
	}

	public void printLeftChild() {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(this);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.data + " ");
			if (node.leftChild != null) {
				queue.add(node.leftChild);
			}
		}
	}

	public void printRightChild() {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(this);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(node.data + " ");
			if (node.rightChild != null) {
				queue.add(node.rightChild);
			}
		}
	}

	public boolean isLeaf() {
		if (this.leftChild == null && this.rightChild == null) {
			return true;
		}
		return false;
	}

	public TreeNode largest() {
		if (this.rightChild == null) {
			return this;
		}
		return this.rightChild.largest();
	}

	public TreeNode smallest() {
		if (this.leftChild == null) {
			return this;
		}
		return this.leftChild.smallest();
	}

	public TreeNode find(int item) {
		if (this.data == item) {
			return this;
		}
		if (this.data > item) {
			if (this.leftChild != null) {
				return this.leftChild.find(item);
			}
		} else {
			if (this.rightChild != null) {
				return this.rightChild.find(item);
			}
		}
		return null;
	}

	public int height() {
		int left = 0;
		int right = 0;
		if (this.leftChild != null)
			left = this.leftChild.height();
		if (this.rightChild != null)
			right = this.rightChild.height();

		return left > right ? left + 1 : right + 1;
	}

	public boolean delete(int item) {

		TreeNode node = find(item);

		if (node == null) {
			return false;
		}

		System.out.println("Node data - " + node.data);
		// case 1 : leaf element

		if (node.isLeaf()) {
			node = null;
			return true;
		}

		// case 2 : it has left or right child

		if (node.leftChild == null) {
			node.rightChild = null;
			return true;
		}
		if (node.rightChild == null) {
			node.leftChild = null;
			return true;
		}

		// case 3 - if node has both the left and right child
		TreeNode smallest = node.rightChild.smallest();
		delete(smallest.data);
		node.data = smallest.data;
		return false;
	}
}
