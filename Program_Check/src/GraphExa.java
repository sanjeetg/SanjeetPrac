
public class GraphExa {

	public static void main(String[] args) {

		GraphNode graph = new GraphNode(4);

		graph.add(0, 1);
		graph.add(0, 2);
		graph.add(0, 3);
		graph.add(2, 0);
		graph.add(2, 1);
		graph.add(1, 3);

		// graph.traverse();

		// graph.BFS(0);

		System.out.println();

		// graph.DFS(0);

		System.out.println();

		graph.findPaths(2, 3);

	}

}
