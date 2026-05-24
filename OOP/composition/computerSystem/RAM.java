package composition.computerSystem;

public class RAM {

	private int size;

	public RAM(int size) {
		this.size = size;
	}

	public void describe() {
		System.out.println("RAM size:" + size);
	}
}
