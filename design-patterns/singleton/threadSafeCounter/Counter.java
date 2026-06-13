package singleton.threadSafeCounter;

public class Counter {

	private volatile int count;

	private Counter() {
		count = 0;
	}

	private static class Holder {

		private static final Counter INSTANCE = new Counter();
	}

	public static Counter getInstance() {
		return Holder.INSTANCE;
	}

	public synchronized void  increment() {
		count ++;
	}

	public int getCount() {
		return count;
	}
}
