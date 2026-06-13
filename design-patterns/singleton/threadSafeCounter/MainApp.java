package singleton.threadSafeCounter;

public class MainApp {

	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();
        System.out.println("Same instance: " + (c1 == c2));
        for (int i = 0; i < 5; i++) {
            c1.increment();
        }
        System.out.println("Count after 5 increments: " + c1.getCount());
	}
}
