import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueues {

	private Queue<Integer> queue1 = new LinkedList<>();
	private Queue<Integer> queue2 = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void push(int data) {
		queue2.add(data);

		while (!queue1.isEmpty()) {
			queue2.add(queue1.poll());
		}

		Queue<Integer> temp = queue2;
		queue2 = queue1;
		queue1 = temp;
	}

}
