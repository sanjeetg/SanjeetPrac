package verify;

public class SingleTon {

	private static volatile SingleTon instance = null;

	private SingleTon() {
		if (instance == null) {
			throw new RuntimeException("Call the static method to get the instance");
		}
	}

	public static SingleTon getInstance() {

		if (instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}

	public Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Clone not supported");
	}
}
