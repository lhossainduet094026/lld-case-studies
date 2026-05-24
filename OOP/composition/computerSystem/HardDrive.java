package composition.computerSystem;

public class HardDrive {

	private int capacity;

	public HardDrive(int capacity) {
		this.capacity = capacity;
	}

	public void describe() {
		System.out.println("RAM capacity:" + capacity);
	}
}
