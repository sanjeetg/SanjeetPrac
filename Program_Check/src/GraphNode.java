import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphNode {
	int v;
	LinkedList<Integer> adjArray[];

	GraphNode(int v) {
		this.v = v;
		adjArray = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjArray[i] = new LinkedList<Integer>();
		}
	}

	public void add(int a, int b) {
		adjArray[a].add(b);
	}

	public void traverse() {
		for (int i = 0; i < v; i++) {
			for (Integer val : adjArray[i]) {
				System.out.println("[ " + i + " " + val + " ]");
			}
		}
	}

	public void BFS(int a) {
		boolean visited[] = new boolean[v];

		visited[a] = true;

		Queue<Integer> queue = new LinkedList<>();

		queue.add(a);

		while (!queue.isEmpty()) {
			int s = queue.poll();
			System.out.print(s + " ");
			for (Integer i : adjArray[s]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

	public void DFS(int a) {
		boolean visited[] = new boolean[v];
		DFSUtil(a, visited);
	}

	private void DFSUtil(int a, boolean visited[]) {
		visited[a] = true;
		System.out.print(a + " ");
		for (Integer i : adjArray[a]) {
			if (!visited[i]) {
				DFSUtil(i, visited);
			}
		}
	}

	public void findPaths(int a, int b) {

		boolean visited[] = new boolean[v];
		Stack<Integer> paths = new Stack<>();
		// ArrayList<Integer> paths = new ArrayList<>();
		paths.add(a);

		findPathsUtil(a, b, visited, paths);

	}

	private void findPathsUtil(int a, int b, boolean visited[], Stack<Integer> paths) {
		visited[a] = true;
		if (a == b) {
			System.out.println(paths.toString());
		}

		for (Integer i : adjArray[a]) {
			if (!visited[i]) {
				paths.add(i);
				findPathsUtil(i, b, visited, paths);
				paths.pop();
				// paths.remove(i);
			}
			visited[i] = false;
		}

	}

}
