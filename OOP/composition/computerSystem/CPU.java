package composition.computerSystem;

public class CPU {

	private String modelName;
	private int coreCount;

	public CPU(String modelName, int coreCount) {
		this.modelName = modelName;
		this.coreCount = coreCount;
	}

	public void describe() {
		System.out.println("CPU modelName:" + modelName + " core:" + coreCount);
	}
}
