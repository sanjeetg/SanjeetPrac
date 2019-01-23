
class Base {
	private void show() {
		System.out.println("Private method in super class.");
	}

	static void display() {
		System.out.println("Static method in a super class.");
	}

	final void view() {
		System.out.println("Final method in super class.");
	}
}

public class PrivateAndStaticMethod extends Base {

	public void show() {
		System.out.println("Private method in impl class.");
	}

	static public void display() {
		System.out.println("Static method in a impl class.");
	}

	// public void view() {
	// }

	public static void main(String[] args) {
		Base base = new Base();
		base.display();

		Base base1 = new PrivateAndStaticMethod();
		base1.display();

		PrivateAndStaticMethod psm = new PrivateAndStaticMethod();

		psm.show();
		psm.display();

	}

}
