import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	private TreeNode root;

	public void insert(int data) {
		if (root == null) {
			root = new TreeNode(data);
		}
		root.insert(data);
	}

	public void traverse() {
		if (root != null) {
			root.traverse();
		}
	}

	public void printAllLeafNode(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.isLeaf()) {
			System.out.println(root.data);
		}
		if (root.leftChild != null) {
			printAllLeafNode(root.leftChild);
		}
		if (root.rightChild != null) {
			printAllLeafNode(root.rightChild);
		}
	}

	public void printPathsFromRootToAllLeafNodes(TreeNode root, Stack<Integer> path) {

		// ArrayList<Integer> path = new ArrayList<>();
		if (root == null) {
			return;
		}
		path.add(root.data);
		if (root.isLeaf()) {
			// pathLists.add(path);
			System.out.println(path.toString());
		}
		if (root.leftChild != null) {
			printPathsFromRootToAllLeafNodes(root.leftChild, path);
		}
		if (root.rightChild != null) {
			printPathsFromRootToAllLeafNodes(root.rightChild, path);
		}
		path.pop();
	}

	public void LCA(int a, int b) {
		Queue<Integer> path1 = new LinkedList<>();
		findPathFromRootToGivenNode(a, path1, root);
		System.out.println(path1.toString());
		Queue<Integer> path2 = new LinkedList<>();
		findPathFromRootToGivenNode(b, path2, root);
		Integer LCA = null;
		while (!path1.isEmpty() || !path2.isEmpty()) {
			int p1 = path1.poll();
			int p2 = path2.poll();
			if (p1 == p2) {
				LCA = p1;
			} else {
				break;
			}
		}
		System.out.println("LCA - " + LCA);
	}

	private void findPathFromRootToGivenNode(int item, Queue<Integer> path, TreeNode node) {

		if (node == null) {
			return;
		}
		path.add(node.data);
		if (node.data == item) {
			return;
		}
		if (node.data >= item) {
			findPathFromRootToGivenNode(item, path, node.leftChild);
		} else {
			findPathFromRootToGivenNode(item, path, node.rightChild);
		}
	}

	public void BFS() {
		if (root != null) {
			root.BFS();
		}
	}

	public int height() {
		if (root == null) {
			return 0;
		}
		return root.height();
	}

	public void printLeftChild() {
		if (root == null) {
			return;
		}

		root.printLeftChild();
	}

	public void printRightChild() {
		if (root == null) {
			return;
		}
		root.printRightChild();
	}

	public boolean delete(int data) {
		if (root == null) {
			return false;
		}
		return root.delete(data);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(30);
		bst.insert(25);
		bst.insert(35);
		bst.insert(24);
		bst.insert(26);// leaf
		bst.insert(34);// leaf
		bst.insert(36);// leaf
		bst.insert(22);// leaf

		// bst.traverse();

		// System.out.println("Print all leaf Nodes");

		// bst.printAllLeafNode(bst.root);

		// bst.printPathsFromRootToAllLeafNodes(bst.root, new Stack<>());

		// System.out.println(bst.delete(22));

		// bst.printPathsFromRootToAllLeafNodes(bst.root, new Stack<>());
		// System.out.println("BFS");
		bst.BFS();
		System.out.println();
		// System.out.println(bst.height());

		// System.out.println("Left Child");
		// bst.printLeftChild();
		// System.out.println();
		// System.out.println("Right Child");
		// bst.printRightChild();

		// System.out.println("Path from root to given node");

		// bst.LCA(22, 26);
	}

}
