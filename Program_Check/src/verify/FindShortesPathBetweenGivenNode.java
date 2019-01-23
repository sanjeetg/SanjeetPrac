package verify;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node {
	int val;
	LinkedList<Node> children;

	Node(int val) {
		this.val = val;
	}

	void add(Node node) {
		if (this.children == null) {
			this.children = new LinkedList<>();
		}
		this.children.add(node);
	}
}

public class FindShortesPathBetweenGivenNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Node> findShortestPath(Node a, Node b) {

		List<Node> node = new LinkedList<>();
		if (a == null || b == null || a == b) {
			return null;
		}
		Queue<Node> paths = new LinkedList<>();

		paths.add(a);

		Map<Node, Node> parents = new HashMap<>();

		parents.put(a, null);

		while (!paths.isEmpty()) {
			Node curr = paths.poll();
			if (curr == b) {
				break;
			}
			for (Node child : curr.children) {
				paths.add(child);
				parents.put(child, curr);
			}
		}

		if (!parents.containsKey(b)) {
			return null;
		}

		Node end = b;

		while (end != null) {
			node.add(end);
			end = parents.get(end);
		}

		return node;
	}

}
